package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import hibernate.HibernateUtil;

public class DaoGeneric<E> {
	private EntityManager entityManager = HibernateUtil.getEntityManager();

	
	public void salvar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade);
		transaction.commit();
	}

	
	public E pesquisar(E entidade) {
		Object id = HibernateUtil.getPrimaryKey(entidade);
		@SuppressWarnings("unchecked")
		E e = (E) entityManager.find(entidade.getClass(), id);
		return e;
	}


	public E atualizar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		E entidadeAtualizada = entityManager.merge(entidade);
		transaction.commit();
		return entidadeAtualizada;
	}

	
	public void excluir(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(entidade);
		transaction.commit();
	}

}
