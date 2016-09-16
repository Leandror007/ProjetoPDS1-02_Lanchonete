package dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T23:47:13.257-0300")
@StaticMetamodel(ItemDePedido.class)
public class ItemDePedido_ {
	public static volatile SingularAttribute<ItemDePedido, Integer> codItemdepedido;
	public static volatile SingularAttribute<ItemDePedido, Integer> quantidade;
	public static volatile SingularAttribute<ItemDePedido, Pedido> pedido;
	public static volatile SingularAttribute<ItemDePedido, Produto> produto;
}
