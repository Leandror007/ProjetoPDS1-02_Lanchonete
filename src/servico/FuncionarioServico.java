package servico;

import java.util.List;

import dominio.Funcionario;

public interface FuncionarioServico {

	public void inserirFuncionario(Funcionario f) throws ServicoException;
	public void excluir(Funcionario f);
	public Funcionario buscar(int cod);
	public List<Funcionario> buscarTodos();
	
}
