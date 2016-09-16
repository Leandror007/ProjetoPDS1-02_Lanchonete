package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.FuncionarioServico;
import servico.ProdutoServico;
import servico.ServicoException;
import servico.ServicoFactory;
import dominio.Funcionario;
import dominio.Produto;


@WebServlet("/produto/ProdutoCrud")
public class ProdutoCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String LISTAR = "/produto/produtoListar.jsp";	
	private static String INSERIR_OU_ALTERAR = "/produto/produtoForm.jsp";
	private static String ERRO = "/publico/erro.jsp";
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProdutoServico ps = ServicoFactory.criarProdutoServico();	
		
		String forward = "";
		String cmd = request.getParameter("cmd");
		List<Produto> aux = ps.buscarTodos();
		
		if (cmd == null || cmd.equalsIgnoreCase("")){			
			request.setAttribute("lista", aux);		
			RequestDispatcher rd = request.getRequestDispatcher(LISTAR);
			rd.forward(request, response);
			cmd = "listar";		
		}
	

	/*-----------------------------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------------------------*/
					
			if (cmd.equalsIgnoreCase("deletar")) {
				int cod = Integer.parseInt(request.getParameter("cod"));
				try {
					Produto prod = ps.buscar(cod);
					if (prod != null) {
						ps.excluir(prod);
					
					}
					request.setAttribute("lista", ps.buscarTodos());				
					forward = LISTAR;
				} catch (RuntimeException e) {
					request.setAttribute("erro", "Erro de execução: " + e.getMessage());
					forward = ERRO;
				}
				/*comando necessario para atualizar a pagina */
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
			}
			
	/*-----------------------------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------------------------*/		
		
			else if (cmd.equalsIgnoreCase("editar")) {
				int cod = Integer.parseInt(request.getParameter("cod"));
				try {
					Produto prod = ps.buscar(cod);
					if (prod != null) {
						request.setAttribute("prod", prod);
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
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
			}
			

	/*-----------------------------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------------------------*/		

			else if (cmd.equalsIgnoreCase("listar")) {
				try {
					request.setAttribute("lista", ps.buscarTodos());
					forward = LISTAR;
				} catch (RuntimeException e) {
					request.setAttribute("erro", "Erro de execução: " + e.getMessage());
					forward = ERRO;
				}
			}
			
	/*-----------------------------------------------------------------------------------------------------------------------------*/
	/*-----------------------------------------------------------------------------------------------------------------------------*/		
			else if (cmd.equalsIgnoreCase("novo")) {
				
				try {
					Produto prod = new Produto();	
					
					request.setAttribute("prod", prod);
					forward = INSERIR_OU_ALTERAR;
					
				} catch (RuntimeException e) {
					request.setAttribute("erro", "Erro de execução: " + e.getMessage());
					forward = ERRO;
				}
				RequestDispatcher rd = request.getRequestDispatcher(forward);
				rd.forward(request, response);
			}
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoServico ps = ServicoFactory.criarProdutoServico();
		String forward = "";
		try {
			Produto prod = instanciar(request);
			ps.inserirProduto(prod);
			request.setAttribute("lista", ps.buscarTodos());			
			forward = LISTAR;			
		
		} catch (ServicoException e) {
			request.setAttribute("erro", e.getMessage());
			forward = ERRO;
		}
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}


	private Produto instanciar(HttpServletRequest req) {
		/*Funcão para instanciar a edição do formulario*/
		
		ProdutoServico ps = ServicoFactory.criarProdutoServico();
		String aux;
		Produto p = new Produto();
		
		aux = req.getParameter("codProduto");
		
		if (aux != null && !aux.isEmpty())
		p.setCodProduto(Integer.parseInt(aux));
		
		aux = req.getParameter("descricao");
		p.setDescricao(aux);
		
		aux = req.getParameter("nome");
		p.setNome(aux);
		
		aux = req.getParameter("preco");
		p.setPreco(new BigDecimal(aux));
			
		
		return p;
		}

	}


