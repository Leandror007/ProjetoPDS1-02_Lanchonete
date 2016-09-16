package dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-09-15T23:47:13.252-0300")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ {
	public static volatile SingularAttribute<Funcionario, Integer> codFuncionario;
	public static volatile SingularAttribute<Funcionario, String> nmFuncinario;
	public static volatile SingularAttribute<Funcionario, String> dataNascimento;
	public static volatile SingularAttribute<Funcionario, String> dsEndereco;
	public static volatile SingularAttribute<Funcionario, String> dsTelefone;
	public static volatile SingularAttribute<Funcionario, String> dsLogin;
	public static volatile SingularAttribute<Funcionario, String> dsSenha;
	public static volatile ListAttribute<Funcionario, Compra> compra;
	public static volatile ListAttribute<Funcionario, Pedido> pedido;
}
