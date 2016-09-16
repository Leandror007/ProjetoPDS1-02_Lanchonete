package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.CompraServico;
import servico.FuncionarioServico;
import servico.ServicoException;
import servico.ServicoFactory;
import dominio.Compra;
import dominio.Funcionario;

@WebServlet("/compra/CompraCrud")
public class CompraCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private static String LISTAR = "/compra/compraLista.jsp";	
	private static String INSERIR_OU_ALTERAR = "/compra/compraForm.jsp";
	private static String ERRO = "/publico/erro.jsp";
	private static String ESCOLHER_FUNCIONARIO = "/compra/escolherFuncionario.jsp";

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CompraServico cs = ServicoFactory.criarCompraServico();
		FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();

		String forward = "";
		
		String cmd = request.getParameter("cmd");
		
		if (cmd == null || cmd.equalsIgnoreCase(""))
			cmd = "listar";
		if (cmd.equalsIgnoreCase("deletar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Compra comp = cs.buscar(cod);
				if (comp != null) {
					cs.excluir(comp);
					
				}
				request.setAttribute("lista", cs.buscarTodos());
				forward = LISTAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
			
		}
		
		else if (cmd.equalsIgnoreCase("editar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Compra comp = cs.buscar(cod);
				if (comp != null) {
					request.setAttribute("comp", comp);
					forward = INSERIR_OU_ALTERAR;
				}
				else {
					request.setAttribute("lista", cs.buscarTodos());
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
			request.setAttribute("lista", cs.buscarTodos());
			forward = LISTAR;
		} catch (RuntimeException e) {
			request.setAttribute("erro", "Erro de execução: " + e.getMessage());
			forward = ERRO;
		}
	}
		
		
	else if (cmd.equalsIgnoreCase("novo")) {
		int codFuncionario = Integer.parseInt(request.getParameter("codFuncionario"));
		try {
			Compra comp = new Compra();
			comp.setFuncionario(fs.buscar(codFuncionario));
			
			request.setAttribute("comp", comp);
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
			CompraServico cs = ServicoFactory.criarCompraServico();
			String forward = "";
				try {
					Compra comp = instanciar(request);
					cs.inserirCompra(comp);
					request.setAttribute("lista", cs.buscarTodos());
					forward = LISTAR;
				} catch (ServicoException e) {
					request.setAttribute("erro", e.getMessage());
					forward = ERRO;
				}
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
				}

private Compra instanciar(HttpServletRequest req) {
		 {
			 FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();
			 String aux;
			 Compra c = new Compra();
			 
			 aux = req.getParameter("codCompras");
			 if (aux != null && !aux.isEmpty())
				 c.setCodCompras(Integer.parseInt(aux));
			 
			 	aux = req.getParameter("dsData");
			 	c.setDsData(aux);
			 
		       aux = req.getParameter("codFuncionario");
			   c.setFuncionario(fs.buscar(Integer.parseInt(aux)));
			 return c;
			 }
		} 
	}