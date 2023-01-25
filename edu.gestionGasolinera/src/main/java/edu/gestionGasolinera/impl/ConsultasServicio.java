/**
 * 
 */
package edu.gestionGasolinera.impl;

import java.util.List;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Talamino
 * Consultas: Interfaz que define los métodos específicos de consulta sobre base de datos.
 */
public interface ConsultasServicio {

	// Repostage Gasolinera
	
	/**
	 * repostajeGasolinera: Inserta en base de datos un nuevo repostaje de tipo gasolinera
	 * @param rg
	 * @return true si la inserción en base de datos ha sido correcta, false en caso contrario
	 */
	public void repostajeGasolinera(RepostajeGasolinera rg);
	
	/**
	 * verRepostajeGasolinera: Hace un select completo de la tabla dlk_tch_repostajegasolinera
	 * @return una lista de tipo RepostajeGasolinera
	 */
	public List<RepostajeGasolinera> verRepostajeGasolinera();
	
	/**
	 * eliminarRepostajeGasolinera: Elimina en base de datos un registro de tipo gasolinera
	 * @param rg
	 * @return true si el borrado en base de datos ha sido correcto, false en caso contrario
	 */
	public void eliminarRepostajeGasolinera(RepostajeGasolinera rg);
	
	
	
	// Repostage Vehículo
	
	/**
	 * repostajeVehículo: Inserta en base de datos un nuevo repostaje de tipo vehiculo
	 * @param rv
	 * @return true si la inserción en base de datos ha sido correcta, false en caso contrario
	 */
	public void repostajeVehículo(RepostajeVehiculo rv);
	
	/**
	 * verRepostajeVehículo: Hace un select completo de la tabla dlk_tch_repostajevehiculo
	 * @return una lista de tipo RepostajeVehiculo
	 */
	public List<RepostajeVehiculo> verRepostajeVehículo();
	
	/**
	 * eliminarRepostajeVehículo: Elimina en base de datos un registro de tipo vehiculo
	 * @param rv
	 * @return true si el borrado en base de datos ha sido correcto, false en caso contrario
	 */
	public void eliminarRepostajeVehículo(RepostajeVehiculo rv);
}
