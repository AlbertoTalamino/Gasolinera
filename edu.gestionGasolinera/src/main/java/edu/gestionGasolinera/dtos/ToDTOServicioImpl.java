/**
 * 
 */
package edu.gestionGasolinera.dtos;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Talamino
 * Implementación de la interfaz ToDTOServicio
 */
public class ToDTOServicioImpl implements ToDTOServicio{

	@Override
	public GasolineraDTO RepostajeGasolineraToDTO(RepostajeGasolinera repostajeGasolinera) {
		
		GasolineraDTO gasolineraDTO = new GasolineraDTO();
		
		gasolineraDTO.setMd_uuid(repostajeGasolinera.getMd_uuid());
		gasolineraDTO.setMd_fch(repostajeGasolinera.getMd_fch());
		gasolineraDTO.setLitros_combustible(repostajeGasolinera.getLitros_combustible());
		gasolineraDTO.setTipo_combustible_gasolinera(repostajeGasolinera.getTipo_combustible_gasolinera());
		
		return gasolineraDTO;
	}

	@Override
	public VehiculoDTO RepostajeVehiculoToDTO(RepostajeVehiculo repostajeVehiculo) {

		VehiculoDTO vehiculoDTO = new VehiculoDTO();
		
		vehiculoDTO.setMd_uuid(repostajeVehiculo.getMd_uuid());
		vehiculoDTO.setMd_fch(repostajeVehiculo.getMd_fch());
		vehiculoDTO.setFecha_hora(repostajeVehiculo.getFecha_hora());
		vehiculoDTO.setImporte(repostajeVehiculo.getImporte());
		vehiculoDTO.setDNI(repostajeVehiculo.getDNI());
		vehiculoDTO.setMatrícula(repostajeVehiculo.getMatrícula());
		vehiculoDTO.setTipo_combustible_vehiculo(repostajeVehiculo.getTipo_combustible_vehiculo());
		
		return vehiculoDTO;
	}

}
