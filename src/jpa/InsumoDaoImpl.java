package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.InsumoDao;
import dominio.Insumo;

public class InsumoDaoImpl implements InsumoDao{
	private EntityManager em;
	
	public InsumoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Insumo i) {
		if (i.getCodInsumo() != null) {
			i = em.merge(i);
		}
		em.persist(i);
	}
	
	@Override
	public void excluir(Insumo i) {
		i = em.merge(i);
		em.remove(i);
	}
	
	@Override
	public Insumo buscar(int codInsumo) {
		return em.find(Insumo.class, codInsumo);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Insumo> buscarTodos() {
		String jpql = "SELECT i FROM Insumo i";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
}
