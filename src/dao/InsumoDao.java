package dao;

import java.util.List;

import dominio.Insumo;

public interface InsumoDao {
	
	public void inserirAtualizar(Insumo i);
	public void excluir(Insumo i);
	public Insumo buscar(int i);
	public List<Insumo> buscarTodos();
	

}
