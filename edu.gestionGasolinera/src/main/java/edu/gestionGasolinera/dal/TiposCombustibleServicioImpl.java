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
 *  *
 * Clase que implementa la interfaz TiposCombustibleServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 */

@Repository
public class TiposCombustibleServicioImpl implements TiposCombustibleServicio{

	@PersistenceContext
	private EntityManager em;
	
	public List<TiposCombustible> select() throws Exception{
		return em.createQuery("SELECT * FROM dlk_tch_TiposCombustibles").getResultList();
	}

	public void insert(TiposCombustible combustible) throws Exception{
		em.persist(combustible);
		em.clear();
		em.close();	
	}

	public void update(TiposCombustible combustible) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void delete(TiposCombustible combustible) throws Exception{
		em.remove(combustible);
		em.clear();
		em.close();
	}

}
