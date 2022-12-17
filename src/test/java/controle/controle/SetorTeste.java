package controle.controle;

import org.junit.Test;

import dao.DaoGeneric;
import model.Setor;

public class SetorTeste {
	@Test
	public void salvaSetor() {// CRUD - CREATE
		DaoGeneric<Setor> daoGeneric = new DaoGeneric<Setor>();
		Setor setor = new Setor();
		setor.setDescricao("não tem uma descrição detalhada");
		setor.setDescricao("frnrorfnorfr");
		setor.setNome_produto("Tortas");
		daoGeneric.salvar(setor);
	}

	@Test
	public void pesquisaSetor() {// CRUD - READER
		DaoGeneric<Setor> daoGeneric = new DaoGeneric<Setor>();
		Setor setor = new Setor();
		setor.setCod(1L);
		setor = daoGeneric.pesquisar(setor);
		System.out.println(setor);
	}

	/*
	 * @Test
	 * public void alterarSetor() {//CRUD - UPDATE
	 * DaoGeneric<Setor> daoGeneric = new DaoGeneric<Setor>();
	 * Setor setor = new Setor();
	 * setor.setCod(1L);
	 * setor = daoGeneric.pesquisar(setor);
	 * 
	 * setor.setDescricao("feija tipo branco");
	 * daoGeneric.atualizar(setor);
	 * }
	 * 
	 * @Test
	 * public void excluirSetor() {//CRUD - DELETE
	 * DaoGeneric<Setor> daoGeneric = new DaoGeneric<Setor>();
	 * Setor setor = new Setor();
	 * setor.setCod(1L);
	 * setor = daoGeneric.pesquisar(setor);
	 * 
	 * daoGeneric.excluir(setor);
	 * }
	 */
}
