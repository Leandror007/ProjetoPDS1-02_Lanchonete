package servico;

import java.util.List;

import dominio.Pedido;

public interface PedidoServico {
	public void inserirAtualizar(Pedido p);
	public void itemdp(Pedido p);
	public Pedido buscar(int cod);
	public List<Pedido> buscarTodos();
	void excluir(Pedido p);
}
