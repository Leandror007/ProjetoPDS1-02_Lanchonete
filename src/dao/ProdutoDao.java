package dao;

import java.util.List;

import dominio.Produto;

public interface ProdutoDao {
	public void inserirAtualizar(Produto p);
	public void excluir(Produto p);
	public Produto buscar(int cod);
	public List<Produto> buscarTodos();
}
