package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.CompraDao;
import dominio.Compra;

public class CompraDaoImpl implements CompraDao {

	private EntityManager em;
	
	public CompraDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Compra c) {
		if (c.getCodCompras() != null) {
			c = em.merge(c);
		}
		em.persist(c);
	}

	@Override
	public void excluir(Compra c) {
		c = em.merge(c);
		em.remove(c);
	}

	@Override
	public Compra buscar(int cod) {
		return em.find(Compra.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Compra> buscarTodos() {
		String jpql = "SELECT c FROM Compra c";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
