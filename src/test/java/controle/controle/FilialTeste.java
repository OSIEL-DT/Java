package controle.controle;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.Filial;
import model.Setor;

@SuppressWarnings("unused")
public class FilialTeste {
	@Test
	public void salvaSetor() {
		DaoGeneric<Filial> daoGeneric = new DaoGeneric<Filial>();
		Filial Filial = new Filial();
		Filial.setDescricao("flnlenfler");
		Filial.setDescricao("elflerklf");
		Filial.setNome_loja("Bartenoys");
		daoGeneric.salvar(Filial);
}

}
