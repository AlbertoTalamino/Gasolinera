/**
 * 
 */
package edu.gestionGasolinera.dtos;

import org.springframework.stereotype.Service;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;

/**
 * @author Talamino
 * Implementación de la interfaz ToDAOServicio
 */

@Service
public class ToDAOServicioImpl implements ToDAOServicio{

	@Override
	public RepostajeGasolinera GasolineraToDAO(GasolineraDTO gasolineraDTO) {
		
		RepostajeGasolinera repostajeGasolinera = new RepostajeGasolinera();
		
		repostajeGasolinera.setMd_uuid(gasolineraDTO.getMd_uuid());
		repostajeGasolinera.setMd_fch(gasolineraDTO.getMd_fch());
		repostajeGasolinera.setLitros_combustible(gasolineraDTO.getLitros_combustible());
		repostajeGasolinera.setTipo_combustible_gasolinera(gasolineraDTO.getTipo_combustible_gasolinera());
		
		return repostajeGasolinera;
	}

	@Override
	public RepostajeVehiculo VehiculoToDAO(VehiculoDTO vehiculoDTO) {
		
		RepostajeVehiculo repostajeVehiculo = new RepostajeVehiculo();
		
		repostajeVehiculo.setMd_uuid(vehiculoDTO.getMd_uuid());
		repostajeVehiculo.setMd_fch(vehiculoDTO.getMd_fch());
		repostajeVehiculo.setFecha_hora(vehiculoDTO.getFecha_hora());
		repostajeVehiculo.setImporte(vehiculoDTO.getImporte());
		repostajeVehiculo.setDNI(vehiculoDTO.getDNI());
		repostajeVehiculo.setMatrícula(vehiculoDTO.getMatrícula());
		repostajeVehiculo.setTipo_combustible_vehiculo(vehiculoDTO.getTipo_combustible_vehiculo());
		
		return repostajeVehiculo;
	}

}
