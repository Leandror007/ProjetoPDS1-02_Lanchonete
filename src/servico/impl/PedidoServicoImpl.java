package servico.impl;

import java.util.List;

import jpa.EM;
import servico.PedidoServico;
import dao.DaoFactory;
import dao.PedidoDao;
import dominio.Pedido;

public class PedidoServicoImpl implements PedidoServico {
	
	private PedidoDao dao;
	
	public PedidoServicoImpl() {
		dao = DaoFactory.criarPedidoDao();
	}
	
	@Override
	public void inserirAtualizar(Pedido p) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(p);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Pedido p) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(p);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Pedido buscar(int codPedido) {
		return dao.buscar(codPedido);
	}
	
	@Override
	public List<Pedido> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void itemdp(Pedido p) {
		// TODO Auto-generated method stub
		
	}
	
	
}