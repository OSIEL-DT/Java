package model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Estoque")
public class Estoque {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(nullable = false) 
	private String nome_produto;

	@Column(nullable = false) 
	private int contidade;

	@Column(nullable = false) 
	private String descricao;

	@Column(nullable = false) 
	private int valor;

	@ManyToOne(optional = true, fetch = FetchType.EAGER) 
	private Setor setordoproduto;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public int getContidade() {
		return contidade;
	}

	public void setContidade(int contidade) {
		this.contidade = contidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Setor getSetordofuncionario() {
		return setordoproduto;
	}

	public void setSetordofuncionario(Setor setordofuncionario) {
		this.setordoproduto = setordofuncionario;
	}

	@Override
	public String toString() {
		return "Estoque [codigo=" + codigo + ", nome_produto=" + nome_produto + ", contidade=" + contidade + ", descricao=" + descricao
				+ ", valor=" + valor + ", setordofuncionario=" + setordoproduto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, contidade, descricao, nome_produto, valor, setordoproduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(codigo, other.codigo) && contidade == other.contidade && Objects.equals(descricao, other.descricao)
				&& Objects.equals(nome_produto, other.nome_produto) && Objects.equals(valor, other.valor)
				&& Objects.equals(setordoproduto, other.setordoproduto);
	}

	public void setValor(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setordoproduto(Estoque estoque) {
		// TODO Auto-generated method stub
		
	}

}
