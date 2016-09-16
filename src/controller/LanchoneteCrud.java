package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.FuncionarioServico;
import servico.ServicoException;
import servico.ServicoFactory;
import dominio.Funcionario;

@WebServlet("/funcionario/LanchoneteCrud")
public class LanchoneteCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static String LISTAR = "/funcionario/funcionarioListar.jsp";	
	private static String INSERIR_OU_ALTERAR = "/funcionario/funcionarioForm.jsp";
	private static String ERRO = "/publico/erro.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();	
		
		String forward = "";
		String cmd = request.getParameter("cmd");
		List<Funcionario> aux = fs.buscarTodos();
		
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
				Funcionario func = fs.buscar(cod);
				if (func != null) {
					fs.excluir(func);
				
				}
				request.setAttribute("lista", fs.buscarTodos());				
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
				Funcionario func = fs.buscar(cod);
				if (func != null) {
					request.setAttribute("func", func);
					forward = INSERIR_OU_ALTERAR;
				}
				else {
					request.setAttribute("lista", fs.buscarTodos());
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
				request.setAttribute("lista", fs.buscarTodos());
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
				Funcionario func = new Funcionario();	
				
				request.setAttribute("func", func);
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
		FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();
		String forward = "";
		try {
			Funcionario func = instanciar(request);
			fs.inserirFuncionario(func);
			request.setAttribute("lista", fs.buscarTodos());			
			forward = LISTAR;			
		
		} catch (ServicoException e) {
			request.setAttribute("erro", e.getMessage());
			forward = ERRO;
		}
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}

private Funcionario instanciar(HttpServletRequest req) {
	/*Funcão para instanciar a edição do formulario*/
	
		FuncionarioServico fs = ServicoFactory.criarFuncionarioServico();
		String aux;
		Funcionario x = new Funcionario();
		
		aux = req.getParameter("codFuncionario");
		
		if (aux != null && !aux.isEmpty())
		x.setCodFuncionario(Integer.parseInt(aux));
		
		aux = req.getParameter("nmFuncionario");
		x.setNmFuncinario(aux);
		
		aux = req.getParameter("dataNascimento");
		x.setDataNascimento(aux);
		
		aux = req.getParameter("dsEndereco");
		x.setDsEndereco(aux);
		
		aux = req.getParameter("dsTelefone");
		x.setDsTelefone(aux);
		
		aux = req.getParameter("dsLogin");
		x.setDsLogin(aux);
		
		aux = req.getParameter("dsSenha");
		x.setDsSenha(aux);
			
		
		return x;
		}
}
	
		

	