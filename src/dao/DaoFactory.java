package dao;

import jpa.CompraDaoImpl;
import jpa.FuncionarioDaoImpl;
import jpa.InsumoDaoImpl;
import jpa.PedidoDaoImpl;
import jpa.ProdutoDaoImpl;

public class DaoFactory {

	public static FuncionarioDao criarFuncionarioDao() {
		return new FuncionarioDaoImpl();
	}
	
	public static InsumoDao criarInsumoDao() {
		return new InsumoDaoImpl();
	}
	
	public static ProdutoDao criarProdutoDao() {
		return new ProdutoDaoImpl();
	}
	
	public static CompraDao criarCompraDao() {
		return new CompraDaoImpl();
	}
	

	public static PedidoDao criarPedidoDao() {
		return new PedidoDaoImpl();
	}
}
