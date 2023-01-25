/**
 * 
 */
package edu.gestionGasolinera.dtos;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Talamino
 * Interfaz con los metodos que pasan de DTO a DAO
 */
public interface ToDAOServicio {

	/*
	 * Paso de DTO a DAO (GasolineraDTO -> RepostajeGasolinera)
	 * @param gasolineraDTO
	 * @return
	 */
	public RepostajeGasolinera GasolineraToDAO(GasolineraDTO gasolineraDTO);
		
	/*
	 * Paso de DTO a DAO (VehiculoDTO -> RepostajeVehiculo)
	 * @param vehiculoDTO
	 * @return
	 */
	public RepostajeVehiculo VehiculoToDAO(VehiculoDTO vehiculoDTO);
	
	
	
}
