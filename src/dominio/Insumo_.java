package dominio;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T23:47:13.255-0300")
@StaticMetamodel(Insumo.class)
public class Insumo_ {
	public static volatile SingularAttribute<Insumo, Integer> codInsumo;
	public static volatile SingularAttribute<Insumo, String> nome;
	public static volatile SingularAttribute<Insumo, String> unidadedemedida;
	public static volatile SingularAttribute<Insumo, BigDecimal> preco;
}
