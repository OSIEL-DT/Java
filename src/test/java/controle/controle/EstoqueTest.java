package controle.controle;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import dao.DaoGeneric;
import model.Estoque;
import model.Setor;

@SuppressWarnings("unused")
public class EstoqueTest {

	@Test
	public void salvaFuncionario() {//CRUD - CREATE
		
		DaoGeneric<Estoque> daoGeneric = new DaoGeneric<Estoque>();
		Estoque estoque = new Estoque();
		System.out.println(estoque);
		
		//criando um setor em branco
		DaoGeneric<Estoque> daoGenericEstoque = new DaoGeneric<Estoque>();
		Estoque Estoque = new Estoque();
		System.out.println(Estoque);
		
	
		Estoque.setCodigo(52L);
		System.out.println(Estoque);
		
		
		Estoque = daoGenericEstoque.pesquisar(Estoque);
		System.out.println(Estoque);
		
		
		estoque.setValor(258);
		estoque.setNome_produto("feijao");
		estoque.setDescricao("dnencle");
		estoque.setValor(25215);
		
		estoque.setordoproduto(Estoque);
		System.out.println(estoque);
		daoGeneric.salvar(estoque);
	}
}
