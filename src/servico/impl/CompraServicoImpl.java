package servico.impl;

import java.util.List;

import jpa.EM;
import servico.CompraServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.CompraDao;
import dominio.Compra;

public class CompraServicoImpl implements CompraServico {

	private CompraDao dao;
	
	public CompraServicoImpl() {
		dao = DaoFactory.criarCompraDao();
	}
	
	@Override
	public void inserirCompra(Compra c) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(c);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(Compra c) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(c);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Compra buscar(int cod) {
		return dao.buscar(cod);
	}

	@Override
	public List<Compra> buscarTodos() {
		return dao.buscarTodos();
	}

	
}
