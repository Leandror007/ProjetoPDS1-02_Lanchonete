package servico;

import java.util.List;

import dominio.Produto;

public interface ProdutoServico {
	public void inserirProduto(Produto p) throws ServicoException;
	public void excluir(Produto p);
	public Produto buscar(int cod);
	public List<Produto> buscarTodos();
}
