package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.FuncionarioServico;
import servico.PedidoServico;
import servico.ProdutoServico;
import servico.ServicoFactory;
import dominio.Pedido;
import dominio.Produto;


@WebServlet("/pedido/PedidoCrud")
public class PedidoCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private static String LISTAR = "/pedido/pedidoLista.jsp";	
	private static String ESCOLHER_FUNCIONARIO = "/pedido/escolherFuncionario.jsp";
	private static String ERRO = "/publico/erro.jsp";
	private static String INSERIR_OU_ALTERAR = "/pedido/pedidoForm.jsp";



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PedidoServico ps = ServicoFactory.criarPedidoServico();			
		ProdutoServico prs = ServicoFactory.criarProdutoServico();
		FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();
String forward = "";
		
		String cmd = request.getParameter("cmd");
		
		if (cmd == null || cmd.equalsIgnoreCase(""))
			cmd = "listar";
		if (cmd.equalsIgnoreCase("deletar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Pedido ped = ps.buscar(cod);
				if (ped != null) {
					ps.excluir(ped);
					
				}
				request.setAttribute("lista", ps.buscarTodos());
				forward = LISTAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
			
		}
		
		
		else if (cmd.equalsIgnoreCase("editar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Pedido ped = ps.buscar(cod);
				if (ped != null) {
					request.setAttribute("ped", ped);
					forward = INSERIR_OU_ALTERAR;
				}
				else {
					request.setAttribute("lista", ps.buscarTodos());
					forward = LISTAR;
				}
			} catch (RuntimeException e) {
				request.setAttribute("Erro de execução: ", e.getMessage());
				forward = ERRO;
			}
		}
		
		
		else if (cmd.equalsIgnoreCase("escolherFuncionario")) {
			try {
				request.setAttribute("lista", fs.buscarTodos());
				forward = ESCOLHER_FUNCIONARIO;
			} catch (RuntimeException e) {
				request.setAttribute("Erro de execução: ", e.getMessage());
				forward = ERRO;
			}
		}
		
		
	else if (cmd.equalsIgnoreCase("listar")) {
		try {
			request.setAttribute("lista", ps.buscarTodos());
			forward = LISTAR;
		} catch (RuntimeException e) {
			request.setAttribute("erro", "Erro de execução: " + e.getMessage());
			forward = ERRO;
		}
	}
		
		
	else if (cmd.equalsIgnoreCase("novo")) {
		int codFuncionario = Integer.parseInt(request.getParameter("codFuncionario"));
		try {
			Pedido ped = new Pedido();
			ped.setFuncionario(fs.buscar(codFuncionario));
			
			request.setAttribute("ped", ped);
			forward = INSERIR_OU_ALTERAR;
		} catch (RuntimeException e) {
			request.setAttribute("erro", "Erro de execução: " + e.getMessage());
			forward = ERRO;
		}
	}
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PedidoServico ps = ServicoFactory.criarPedidoServico();
		String forward = "";
			Pedido ped = instanciar(request);
			ps.inserirAtualizar(ped);
			request.setAttribute("lista", ps.buscarTodos());
			forward = LISTAR;
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			}


	private Pedido instanciar(HttpServletRequest req) {
		 {
			 FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();
			 String aux;
			 Pedido c = new Pedido();
			 Produto p = new Produto();
			 
			 aux = req.getParameter("codPedido");
			 if (aux != null && !aux.isEmpty()){
				 c.setCodPedido(Integer.parseInt(aux));
			 
			 	aux = req.getParameter("datapedido");
			 	c.setDatapedido(aux);
			 
		        aux = req.getParameter("codFuncionario");
			    c.setFuncionario(fs.buscar(Integer.parseInt(aux)));
			    
			    aux = req.getParameter("nome");
			    p.setNome(aux);
			    
			    aux = req.getParameter("codFuncionario");
			    p.setNome(aux);
			 }
			 return c;
			 
						 
			 }
	}

}


