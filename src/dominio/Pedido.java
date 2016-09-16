package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPedido;
	private String datapedido;
	
	@ManyToOne
	@JoinColumn(name="funcionario")
	private Funcionario funcionario;
	

	@OneToMany(mappedBy="pedido")
	private List<Produto> produtos;
	
	
	public Pedido() {
		super();
		produtos = new ArrayList<>();
	}

	public Pedido(Integer codPedido, String datapedido, Funcionario funcionario) {
		super();
		this.codPedido = codPedido;
		this.datapedido = datapedido;
		this.funcionario = funcionario;
	
	}

	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public String getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(String datapedido) {
		this.datapedido = datapedido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPedido == null) ? 0 : codPedido.hashCode());
		result = prime * result
				+ ((datapedido == null) ? 0 : datapedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		if (datapedido == null) {
			if (other.datapedido != null)
				return false;
		} else if (!datapedido.equals(other.datapedido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", datapedido=" + datapedido
				+ ", funcionario=" + funcionario + "]";
	}
	
	
}
