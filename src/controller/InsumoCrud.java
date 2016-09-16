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
import servico.InsumoServico;
import servico.ServicoFactory;
import dominio.Insumo;

@WebServlet("/insumo/InsumoCrud")
public class InsumoCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String LISTAR = "/insumo/insumoListar.jsp";	
	private static String INSERIR_OU_ALTERAR = "/insumo/insumoForm.jsp";
	private static String ERRO = "/publico/erro.jsp";
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InsumoServico is = ServicoFactory.criarInsumoServico();	
		
		String forward = "";
		String cmd = request.getParameter("cmd");
		List<Insumo> aux = is.buscarTodos();
		
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
				Insumo insu = is.buscar(cod);
				if (insu != null) {
					is.excluir(insu);
				
				}
				request.setAttribute("lista", is.buscarTodos());				
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
				Insumo insu = is.buscar(cod);
				if (insu != null) {
					request.setAttribute("insu", insu);
					forward = INSERIR_OU_ALTERAR;
				}
				else {
					request.setAttribute("lista", is.buscarTodos());
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
				request.setAttribute("lista", is.buscarTodos());
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
				Insumo insu = new Insumo();	
				
				request.setAttribute("insu", insu);
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
		InsumoServico is = ServicoFactory.criarInsumoServico();
		String forward = "";
		
	
			Insumo insu = instanciar(request);
			is.inserirInsumo(insu);
			request.setAttribute("lista", is.buscarTodos());			
			forward = LISTAR;			
		
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	

private Insumo instanciar(HttpServletRequest req) {
	/*Funcão para instanciar a edição do formulario*/
	
		InsumoServico is = ServicoFactory.criarInsumoServico();
		String aux;
		Insumo x = new Insumo();
		
		aux = req.getParameter("codInsumo");
		
		if (aux != null && !aux.isEmpty())
		x.setCodInsumo(Integer.parseInt(aux));
		
		aux = req.getParameter("nome");
		x.setNome(aux);
		
		aux = req.getParameter("unidadedemedida");
		x.setUnidadedemedida(aux);
		
		aux = req.getParameter("preco");
		x.setPreco(new BigDecimal(aux));		
			
		
		return x;
		}
}
	

