package dao;

import java.util.List;

import dominio.Pedido;

public interface PedidoDao {
	public void inserirAtualizar(Pedido p);
	public void excluir(Pedido p);
	public Pedido buscar(int p);
	public List<Pedido> buscarTodos();

}
