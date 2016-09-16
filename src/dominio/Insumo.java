package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="insumo")
public class Insumo  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codInsumo;
	private String nome;
	private String unidadedemedida;
	private BigDecimal preco;
	
	
	public Integer getCodInsumo() {
		return codInsumo;
	}
	public void setCodInsumo(Integer codInsumo) {
		this.codInsumo = codInsumo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidadedemedida() {
		return unidadedemedida;
	}
	public void setUnidadedemedida(String unidadedemedida) {
		this.unidadedemedida = unidadedemedida;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codInsumo == null) ? 0 : codInsumo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result
				+ ((unidadedemedida == null) ? 0 : unidadedemedida.hashCode());
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
		Insumo other = (Insumo) obj;
		if (codInsumo == null) {
			if (other.codInsumo != null)
				return false;
		} else if (!codInsumo.equals(other.codInsumo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (unidadedemedida == null) {
			if (other.unidadedemedida != null)
				return false;
		} else if (!unidadedemedida.equals(other.unidadedemedida))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Insumo [codInsumo=" + codInsumo + ", nome=" + nome
				+ ", unidadedemedida=" + unidadedemedida + ", preco=" + preco
				+ "]";
	}
	
			
}
