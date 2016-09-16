package servico;

import java.util.List;

import dominio.Compra;

public interface CompraServico {

	public void inserirCompra(Compra c) throws ServicoException;
	public void excluir(Compra c);
	public Compra buscar(int cod);
	public List<Compra> buscarTodos();
	
}
