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
	public List<RepostajeGasolinera> select();
	
	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 */
	public void insert(RepostajeGasolinera repostaje);
	
	/**
	 * Método que actualiza un repostage en base de datos.
	 * @param repostaje
	 */
	public void update(RepostajeGasolinera repostaje);
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void delete(RepostajeGasolinera repostaje);
	
	
}
