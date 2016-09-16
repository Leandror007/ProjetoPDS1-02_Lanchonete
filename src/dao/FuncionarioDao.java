package dao;

import java.util.List;

import dominio.Funcionario;


public interface FuncionarioDao {
	
	public void inserirAtualizar(Funcionario f);
	public void excluir(Funcionario f);
	public Funcionario buscar(int cod);
	public List<Funcionario> buscarTodos();
	
}
