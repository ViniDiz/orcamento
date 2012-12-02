package br.com.controlmais.orcamento.persistence;

import java.util.List;

import br.com.controlmais.orcamento.entity.IEntity;

public interface IGenericDAO<E extends IEntity> {

	public void salvar(E entity);
	public List<E> listar(E entity);
	public void alterar(E entity);
	public void remover(E entity);
}
