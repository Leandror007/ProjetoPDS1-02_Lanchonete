package servico;

import servico.impl.CompraServicoImpl;
import servico.impl.FuncionarioServicoImpl;
import servico.impl.InsumoServicoImpl;
import servico.impl.PedidoServicoImpl;
import servico.impl.ProdutoServicoImpl;


public class ServicoFactory {

	public static FuncionarioServico criarFuncionarioServico() {
		return new FuncionarioServicoImpl();
	}
	
	public static InsumoServico criarInsumoServico() {
		return new InsumoServicoImpl();
	}
	
	public static ProdutoServico criarProdutoServico() {
		return new ProdutoServicoImpl();
	}
	
	public static CompraServico criarCompraServico() {
		return new CompraServicoImpl();
	}
	
	public static PedidoServico criarPedidoServico() {
		return new PedidoServicoImpl();
	}
	


}
