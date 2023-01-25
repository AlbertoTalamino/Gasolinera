/**
 * 
 */
package edu.gestionGasolinera.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeGasolineraServicioImpl;
import edu.gestionGasolinera.dal.RepostajeVehiculo;
import edu.gestionGasolinera.dal.RepostajeVehiculoServicioImpl;
import edu.gestionGasolinera.dal.TiposCombustibleServicioImpl;

/**
 * @author Talamino Clase que agrupa las transacaciones contra base de datos.
 */

@Service
public class ConsultasServicioImpl implements ConsultasServicio{

	// Repostage Gasolinera

	@Autowired
	private RepostajeGasolineraServicioImpl psi1;

	@Transactional
	public void repostajeGasolinera(RepostajeGasolinera rg) {
		
		try {
			psi1.insert(rg);
			System.out.println("Registro guardado correctamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public List<RepostajeGasolinera> verRepostajeGasolinera() {
		try {
			return psi1.select();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	public void eliminarRepostajeGasolinera(RepostajeGasolinera rg) {
		try {
			psi1.delete(rg);
			System.out.println("Registro eliminado correctamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Repostage Vehículo

	@Autowired
	private RepostajeVehiculoServicioImpl psi2;

	@Transactional
	public void repostajeVehículo(RepostajeVehiculo rv) {
		try {
			psi2.insert(rv);
			System.out.println("Registro guardado correctamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public List<RepostajeVehiculo> verRepostajeVehículo() {
		
		try {
			return psi2.select();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Transactional
	public void eliminarRepostajeVehículo(RepostajeVehiculo rv) {
		try {
			psi2.delete(rv);
			System.out.println("Registro eliminado correctamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
