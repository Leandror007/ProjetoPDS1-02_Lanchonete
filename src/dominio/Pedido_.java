package dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T23:47:13.260-0300")
@StaticMetamodel(Pedido.class)
public class Pedido_ {
	public static volatile SingularAttribute<Pedido, Integer> codPedido;
	public static volatile SingularAttribute<Pedido, String> datapedido;
	public static volatile SingularAttribute<Pedido, Funcionario> funcionario;
	public static volatile ListAttribute<Pedido, Produto> produtos;
}
