package servico;

import java.util.List;

import dominio.Insumo;

public interface InsumoServico {
	public void inserirInsumo(Insumo i);
	public void excluir(Insumo i);
	public Insumo buscar(int cod);
	public List<Insumo> buscarTodos();	

}
