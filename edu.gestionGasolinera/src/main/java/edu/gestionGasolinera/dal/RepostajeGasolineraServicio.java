/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.List;

/**
 * @author Talamino
 *
 * Interfaz que actúa sobre RepostageGasolinera
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * RepostageGasolinera, la implementación se define en RepostageGasolineraServicioImpl
 */
public interface RepostajeGasolineraServicio {

	/**
	 * Método que trae todos los registros de la tabla dlk_tch_RepostajeGasolinera
	 * @return List<RepostajeGasolinera>
	 */
	public List<RepostajeGasolinera> select() throws Exception;
	
	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 * @throws Exception 
	 */
	public void insert(RepostajeGasolinera repostaje) throws Exception;
	
	/**
	 * Método que actualiza un repostage en base de datos.
	 * @param repostaje
	 */
	public void update(RepostajeGasolinera repostaje) throws Exception;
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void delete(RepostajeGasolinera repostaje) throws Exception;
	
	
}
