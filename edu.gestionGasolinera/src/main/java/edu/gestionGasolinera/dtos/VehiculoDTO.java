/**
 * 
 */
package edu.gestionGasolinera.dtos;

import java.util.Date;
import java.util.List;

import edu.gestionGasolinera.dal.RepostajeVehiculo;



/**
 * @author Talamino Clase que contiene en forma de DTO la entidad
 *         dlk_tch_RepostageVehiculo
 */
public class VehiculoDTO {
	
	//Propiedades
	String md_uuid;
	Date md_fch;
	int id_repostage_vehiculo;
	Date fecha_hora;	
	float importe;	
	String DNI;	
	String matrícula;	
	int tipo_combustible_vehiculo;
	
	/**
	 * Construtor Normal
	 * @param md_uuid
	 * @param md_fch
	 * @param id_repostage_vehiculo
	 * @param fecha_hora
	 * @param importe
	 * @param dNI
	 * @param matrícula
	 * @param tipo_combustible_vehiculo
	 */
	public VehiculoDTO(String md_uuid, Date md_fch, int id_repostage_vehiculo, Date fecha_hora, float importe,
			String dNI, String matrícula, int tipo_combustible_vehiculo) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_repostage_vehiculo = id_repostage_vehiculo;
		this.fecha_hora = fecha_hora;
		this.importe = importe;
		DNI = dNI;
		this.matrícula = matrícula;
		this.tipo_combustible_vehiculo = tipo_combustible_vehiculo;
	}
	
	
	/**
	 * Construtor Vacío
	 */
	public VehiculoDTO() {
		super();
	}


	//GETTERS AND SETTERS
	public String getMd_uuid() {
		return md_uuid;
	}


	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Date getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_repostage_vehiculo() {
		return id_repostage_vehiculo;
	}

	public void setId_repostage_vehiculo(int id_repostage_vehiculo) {
		this.id_repostage_vehiculo = id_repostage_vehiculo;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getMatrícula() {
		return matrícula;
	}

	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}

	public int getTipo_combustible_vehiculo() {
		return tipo_combustible_vehiculo;
	}

	public void setTipo_combustible_vehiculo(int tipo_combustible_vehiculo) {
		this.tipo_combustible_vehiculo = tipo_combustible_vehiculo;
	}

	//ToString metodo que hace legible a la clase
	@Override
	public String toString() {
		return "VehiculoDTO [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostage_vehiculo="
				+ id_repostage_vehiculo + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", DNI=" + DNI
				+ ", matrícula=" + matrícula + ", tipo_combustible_vehiculo=" + tipo_combustible_vehiculo + "]";
	}

	
}
