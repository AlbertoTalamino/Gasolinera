/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.List;

/**
 * @author Talamino
 *
 * Interfaz que actúa sobre RepostageVehiculo
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * RepostageVehiculo, la implementación se define en RepostageVehiculoServicioImpl
 */
public interface RepostajeVehiculoServicio {

	/**
	 * Método que trae todos los registros de la tabla dlk_tch_RepostageVehiculo
	 * @return List<RepostajeVehiculo>
	 */
	public List<RepostajeVehiculo> select() throws Exception;
	
	/**
	 * Método que inserta un nuevo repostage en base de datos.
	 * @param repostaje
	 */
	public void insert(RepostajeVehiculo repostaje) throws Exception;
	
	/**
	 * Método que actualiza un repostage en base de datos.
	 * @param repostaje
	 */
	public void update(RepostajeVehiculo repostaje) throws Exception;
	
	/**
	 * Método que elimina un repostage en base de datos.
	 * @param repostaje
	 */
	public void delete(RepostajeVehiculo repostaje) throws Exception;
	
}
