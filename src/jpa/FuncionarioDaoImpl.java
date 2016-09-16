package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.FuncionarioDao;
import dominio.Funcionario;

public class FuncionarioDaoImpl implements FuncionarioDao {

	private EntityManager em;
	
	public FuncionarioDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Funcionario f) {
		if (f.getCodFuncionario() != null) {
			f = em.merge(f);
		}
		em.persist(f);
	}

	@Override
	public void excluir(Funcionario f) {
		f = em.merge(f);
		em.remove(f);
	}

	@Override
	public Funcionario buscar(int cod) {
		return em.find(Funcionario.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcionario> buscarTodos() {
		String jpql = "SELECT f FROM Funcionario f";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
