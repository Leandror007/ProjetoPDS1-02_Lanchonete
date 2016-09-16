package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.PedidoDao;
import dominio.Pedido;

public class PedidoDaoImpl implements PedidoDao{
	private EntityManager em;
	
	public PedidoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Pedido p) {
		if (p.getCodPedido() != null) {
			p = em.merge(p);
		}
		em.persist(p);
	}
	
	@Override
	public void excluir(Pedido p) {
		p = em.merge(p);
		em.remove(p);
	}
	
	@Override
	public Pedido buscar(int codPedido) {
		return em.find(Pedido.class, codPedido);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pedido> buscarTodos() {
		String jpql = "SELECT p FROM Pedido p";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
}
