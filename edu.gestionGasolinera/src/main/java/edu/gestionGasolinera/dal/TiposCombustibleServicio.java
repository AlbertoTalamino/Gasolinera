/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.List;

/**
 * @author Talamino
 *
 * Interfaz que actúa sobre TiposCombustible
 * Tan solo se define la signatura de los métodos que actuarán sobre
 * RepostageGasolinera, la implementación se define en TiposCombustibleServicioImpl
 */
public interface TiposCombustibleServicio {

	/**
	 * Método que trae todos los registros de la tabla dlk_tch_TiposCombustibles
	 * @return List<TiposCombustible>
	 */
	public List<TiposCombustible> select() throws Exception;
	
	/**
	 * Método que inserta un nuevo combustible en base de datos.
	 * @param combustible
	 */
	public void insert(TiposCombustible combustible) throws Exception;
	
	/**
	 * Método que actualiza un combustible en base de datos.
	 * @param combustible
	 */
	public void update(TiposCombustible combustible) throws Exception;
	
	/**
	 * Método que elimina un combustible en base de datos.
	 * @param combustible
	 */
	public void delete(TiposCombustible combustible) throws Exception;
	
}
