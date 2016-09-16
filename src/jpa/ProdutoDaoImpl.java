package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ProdutoDao;
import dominio.Produto;

public class ProdutoDaoImpl implements ProdutoDao {

	private EntityManager em;
	
	public ProdutoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Produto p) {
		if (p.getCodProduto() != null) {
			p = em.merge(p);
		}
		em.persist(p);
	}

	@Override
	public void excluir(Produto p) {
		p = em.merge(p);
		em.remove(p);
	}

	@Override
	public Produto buscar(int cod) {
		return em.find(Produto.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> buscarTodos() {
		String jpql = "SELECT p FROM Produto p";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
