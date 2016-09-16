package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codFuncionario;
	
	private String nmFuncinario;
	private String dataNascimento;
	private String dsEndereco;
	private String dsTelefone;
	private String dsLogin;
	private String dsSenha;
	

	@OneToMany(mappedBy="funcionario")
	private List<Compra> compra;
	
	@OneToMany(mappedBy="funcionario")
	private List<Pedido> pedido;
	
	public Funcionario() {
		compra = new ArrayList<>();
		pedido = new ArrayList<>();
	}
	

	
	public Funcionario(Integer codFuncionario, String nmFuncinario,	String dataNascimento, String dsEndereco, String dsTelefone,
			String dsLogin, String dsSenha, List<Compra> compra) {
		super();
		this.codFuncionario = codFuncionario;
		this.nmFuncinario = nmFuncinario;
		this.dataNascimento = dataNascimento;
		this.dsEndereco = dsEndereco;
		this.dsTelefone = dsTelefone;
		this.dsLogin = dsLogin;
		this.dsSenha = dsSenha;
		this.compra = compra;
	}



	public Integer getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(Integer codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public String getNmFuncinario() {
		return nmFuncinario;
	}
	public void setNmFuncinario(String nmFuncinario) {
		this.nmFuncinario = nmFuncinario;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDsEndereco() {
		return dsEndereco;
	}
	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}
	public String getDsTelefone() {
		return dsTelefone;
	}
	public void setDsTelefone(String dsTelefone) {
		this.dsTelefone = dsTelefone;
	}
	public String getDsLogin() {
		return dsLogin;
	}
	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
	}
	public String getDsSenha() {
		return dsSenha;
	}
	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codFuncionario == null) ? 0 : codFuncionario.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((dsEndereco == null) ? 0 : dsEndereco.hashCode());
		result = prime * result + ((dsLogin == null) ? 0 : dsLogin.hashCode());
		result = prime * result + ((dsSenha == null) ? 0 : dsSenha.hashCode());
		result = prime * result
				+ ((dsTelefone == null) ? 0 : dsTelefone.hashCode());
		result = prime * result
				+ ((nmFuncinario == null) ? 0 : nmFuncinario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (codFuncionario == null) {
			if (other.codFuncionario != null)
				return false;
		} else if (!codFuncionario.equals(other.codFuncionario))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (dsEndereco == null) {
			if (other.dsEndereco != null)
				return false;
		} else if (!dsEndereco.equals(other.dsEndereco))
			return false;
		if (dsLogin == null) {
			if (other.dsLogin != null)
				return false;
		} else if (!dsLogin.equals(other.dsLogin))
			return false;
		if (dsSenha == null) {
			if (other.dsSenha != null)
				return false;
		} else if (!dsSenha.equals(other.dsSenha))
			return false;
		if (dsTelefone == null) {
			if (other.dsTelefone != null)
				return false;
		} else if (!dsTelefone.equals(other.dsTelefone))
			return false;
		if (nmFuncinario == null) {
			if (other.nmFuncinario != null)
				return false;
		} else if (!nmFuncinario.equals(other.nmFuncinario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [codFuncionario=" + codFuncionario
				+ ", nmFuncinario=" + nmFuncinario + ", dataNascimento="
				+ dataNascimento + ", dsEndereco=" + dsEndereco
				+ ", dsTelefone=" + dsTelefone + ", dsLogin=" + dsLogin
				+ ", dsSenha=" + dsSenha + "]";
	}
	
		
}
