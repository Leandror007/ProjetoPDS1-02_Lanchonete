package dao;

import java.util.List;

import dominio.Compra;

public interface CompraDao {

	public void inserirAtualizar(Compra c);
	public void excluir(Compra c);
	public Compra buscar(int c);
	public List<Compra> buscarTodos();
}
