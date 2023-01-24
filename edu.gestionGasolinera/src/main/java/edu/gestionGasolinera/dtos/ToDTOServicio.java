/**
 * 
 */
package edu.gestionGasolinera.dtos;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Talamino
 * Interfaz con los metodos que pasan de DAO a DTO
 */
public interface ToDTOServicio {

	/*
	 * Paso de DAO a DTO (RepostajeGasolinera -> GasolineraDTO)
	 * @param repostajeGasolinera
	 * @return
	 */
	public GasolineraDTO RepostajeGasolineraToDTO(RepostajeGasolinera repostajeGasolinera);
	
	
	/*
	 * Paso de DAO a DTO (RepostajeVehiculo -> VehiculoDTO)
	 * @param repostajeVehiculo
	 * @return
	 */
	public VehiculoDTO RepostajeVehiculoToDTO(RepostajeVehiculo repostajeVehiculo);
}
