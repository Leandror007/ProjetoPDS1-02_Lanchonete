package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="itemdepedido")
public class ItemDePedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codItemdepedido;
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="pedido")
	private Pedido pedido;
	
	
	@ManyToOne
	@JoinColumn(name="produto")
	private Produto produto;

	public ItemDePedido() {
		super();
	}

	public ItemDePedido(Integer codItemdepedido, Integer quantidade,
			Pedido pedido, Produto produto) {
		super();
		this.codItemdepedido = codItemdepedido;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produto = produto;
	}

	public Integer getCodItemdepedido() {
		return codItemdepedido;
	}

	public void setCodItemdepedido(Integer codItemdepedido) {
		this.codItemdepedido = codItemdepedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codItemdepedido == null) ? 0 : codItemdepedido.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		ItemDePedido other = (ItemDePedido) obj;
		if (codItemdepedido == null) {
			if (other.codItemdepedido != null)
				return false;
		} else if (!codItemdepedido.equals(other.codItemdepedido))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemDePedido [codItemdepedido=" + codItemdepedido
				+ ", quantidade=" + quantidade + ", pedido=" + pedido
				+ ", produto=" + produto + "]";
	}
	
		
}
