package servico.impl;

import java.util.List;

import jpa.EM;
import servico.InsumoServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.InsumoDao;
import dominio.Insumo;

public class InsumoServicoImpl implements InsumoServico {

	private InsumoDao dao;
	
	public InsumoServicoImpl() {
		dao = DaoFactory.criarInsumoDao();
	}
	
	@Override
	public void inserirInsumo(Insumo i) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(i);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(Insumo i) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(i);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Insumo buscar(int cod) {
		return dao.buscar(cod);
	}

	@Override
	public List<Insumo> buscarTodos() {
		return dao.buscarTodos();
	}

	
	
}
