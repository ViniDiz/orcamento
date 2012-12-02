package br.com.controlmais.orcamento.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.controlmais.orcamento.entity.IEntity;

@Repository("dao")
@Transactional
public class GenericDAO<E extends IEntity> implements IGenericDAO<E>{

	@Autowired
	private SessionFactory session;
	
	@Override
	public void salvar(E entity) {
		session.getCurrentSession().save(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> listar(E entity) {
		List<E> lista = session.getCurrentSession().createCriteria(entity.getClass()).list();
		return lista;
	}

	@Override
	public void alterar(E entity) {
		session.getCurrentSession().update(entity);
	}
	
	@Override
	public void remover(E entity) {
		session.getCurrentSession().delete(entity);
		
	}

}
