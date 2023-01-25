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
 * Clase que implementa la interfaz RepostageVehiculoServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 */

@Repository
public class RepostajeVehiculoServicioImpl implements RepostajeVehiculoServicio{

	@PersistenceContext
	private EntityManager em;
	
	public List<RepostajeVehiculo> select() throws Exception{
		return em.createQuery("SELECT repostajeVehiculo FROM RepostajeVehiculo repostajeVehiculo").getResultList();
	}

	public void insert(RepostajeVehiculo repostaje) throws Exception{
		em.merge(repostaje);	
		em.clear();
		em.close();
	}

	public void update(RepostajeVehiculo repostaje) throws Exception{
		// TODO Auto-generated method stub
		
	}

	public void delete(RepostajeVehiculo repostaje) throws Exception{
		em.remove(em.contains(repostaje) ? repostaje : em.merge(repostaje));
		em.clear();
		em.close();
	}

	

}
