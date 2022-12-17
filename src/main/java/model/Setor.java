package model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "setor")
public class Setor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cod;

	@Column(nullable = false) 
	private String nome_produto;

	@Column(nullable = false) 
	private String descricao;

	@Column(nullable = false) 
	private String loja;

	@OneToMany 
	private List<Estoque> produtodosetor; 

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public List<Estoque> getProdutodosetor() {
		return produtodosetor;
	}

	public void setProdutodosetor(List<Estoque> produtodosetor) {
		this.produtodosetor = produtodosetor;
	}

	@Override
	public String toString() {
		return "Setor [cod=" + cod + ", nome_produto=" + nome_produto + ", descricao=" + descricao + ", email=" + loja
				+ ", produtodosetor=" + produtodosetor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, descricao, loja, produtodosetor, nome_produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setor other = (Setor) obj;
		return Objects.equals(cod, other.cod) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(loja, other.loja) && Objects.equals(produtodosetor, other.produtodosetor)
				&& Objects.equals(nome_produto, other.nome_produto);
	}
}
