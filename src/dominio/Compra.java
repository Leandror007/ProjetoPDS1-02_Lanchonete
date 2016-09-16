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
@Table(name="compra")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codCompras;
	private String dsData;
	
	@ManyToOne
	@JoinColumn(name="funcionario")
	private Funcionario funcionario;
	
	
	public Compra() {
		
	}

	public Compra(Integer codCompras, String dsData, Funcionario funcionario) {
		super();
		this.codCompras = codCompras;
		this.dsData = dsData;
		this.funcionario = funcionario;
	}

	public Integer getCodCompras() {
		return codCompras;
	}

	public void setCodCompras(Integer codCompras) {
		this.codCompras = codCompras;
	}

	public String getDsData() {
		return dsData;
	}

	public void setDsData(String dsData) {
		this.dsData = dsData;
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
				+ ((codCompras == null) ? 0 : codCompras.hashCode());
		result = prime * result + ((dsData == null) ? 0 : dsData.hashCode());
		result = prime * result
				+ ((funcionario == null) ? 0 : funcionario.hashCode());
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
		Compra other = (Compra) obj;
		if (codCompras == null) {
			if (other.codCompras != null)
				return false;
		} else if (!codCompras.equals(other.codCompras))
			return false;
		if (dsData == null) {
			if (other.dsData != null)
				return false;
		} else if (!dsData.equals(other.dsData))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Compra [codCompras=" + codCompras + ", dsData=" + dsData
				+ ", funcionario=" + funcionario + "]";
	}

	
}
