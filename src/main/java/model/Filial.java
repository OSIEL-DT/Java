package model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.mapping.List;

import jakarta.persistence.OneToMany;

@SuppressWarnings("unused")
@Entity(name = "fiial")
public class Filial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(nullable = false) 
	private String nome_loja;

	@Column(nullable = false) 
	private String descricao;

	@Column(nullable = false) 
	private String valor;

	@OneToMany 
	private List produtodosetor;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome_loja() {
		return nome_loja;
	}

	public void setNome_loja(String nome_loja) {
		this.nome_loja = nome_loja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List getProdutodosetor() {
		return produtodosetor;
	}

	public void setProdutodosetor(List produtodosetor) {
		this.produtodosetor = produtodosetor;
	}

	@Override
	public String toString() {
		return "Filial [codigo=" + codigo + ", nome_loja=" + nome_loja + ", descricao=" + descricao + ", valor=" + valor
				+ ", produtodosetor=" + produtodosetor + ", getCodigo()=" + getCodigo() + ", getNome_loja()="
				+ getNome_loja() + ", getDescricao()=" + getDescricao() + ", getValor()=" + getValor()
				+ ", getProdutodosetor()=" + getProdutodosetor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, nome_loja, produtodosetor, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filial other = (Filial) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome_loja, other.nome_loja) && Objects.equals(produtodosetor, other.produtodosetor)
				&& Objects.equals(valor, other.valor);
	}
	
	
	
	

}
