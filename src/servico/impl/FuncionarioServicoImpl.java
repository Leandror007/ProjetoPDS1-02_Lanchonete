package servico.impl;

import java.util.List;

import jpa.EM;
import servico.FuncionarioServico;
import servico.ServicoException;
import dao.DaoFactory;
import dao.FuncionarioDao;
import dominio.Funcionario;

public class FuncionarioServicoImpl implements FuncionarioServico {

	private FuncionarioDao dao;
	
	public FuncionarioServicoImpl() {
		dao = DaoFactory.criarFuncionarioDao();
	}
	
	@Override
	public void inserirFuncionario(Funcionario f) throws ServicoException {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(f);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void excluir(Funcionario f) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(f);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public Funcionario buscar(int cod) {
		return dao.buscar(cod);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.buscarTodos();
	}

	
}
