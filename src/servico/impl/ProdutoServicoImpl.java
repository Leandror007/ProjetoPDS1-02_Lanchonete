package servico.impl;

import java.util.List;

import jpa.EM;
import servico.ProdutoServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.ProdutoDao;
import dominio.Produto;

public class ProdutoServicoImpl implements ProdutoServico {

	private ProdutoDao dao;
	
	public ProdutoServicoImpl() {
		dao = DaoFactory.criarProdutoDao();
	}
	
	@Override
	public void inserirProduto(Produto p) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(p);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(Produto p) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(p);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Produto buscar(int cod) {
		return dao.buscar(cod);
	}

	@Override
	public List<Produto> buscarTodos() {
		return dao.buscarTodos();
	}

	
}
