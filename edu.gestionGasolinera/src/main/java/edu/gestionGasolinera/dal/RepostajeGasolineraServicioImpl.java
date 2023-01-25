/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;



/**
 * @author Talamino
 *
 * Clase que implementa la interfaz RepostageGasolineraServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 */

@Repository
public class RepostajeGasolineraServicioImpl implements RepostajeGasolineraServicio{

	@PersistenceContext
	private EntityManager em;
	
	public List<RepostajeGasolinera> select() throws Exception{
		return em.createQuery("SELECT repostajeGasolinera FROM RepostajeGasolinera repostajeGasolinera").getResultList();
	}

	public void insert(RepostajeGasolinera repostaje) throws Exception{
		em.persist(repostaje);	
		em.clear();
		em.close();
	}

	public void update(RepostajeGasolinera repostaje) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void delete(RepostajeGasolinera repostaje) throws Exception{
		em.remove(em.contains(repostaje) ? repostaje : em.merge(repostaje));
		em.clear();
		em.close();	
	}



}
