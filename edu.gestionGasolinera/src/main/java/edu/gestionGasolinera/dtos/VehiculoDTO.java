/**
 * 
 */
package edu.gestionGasolinera.dtos;

import java.util.Calendar;
import java.util.List;

import edu.gestionGasolinera.dal.RepostajeVehiculo;



/**
 * @author Talamino Clase que contiene en forma de DTO la entidad
 *         dlk_tch_RepostageVehiculo
 */
public class VehiculoDTO {
	
	//Propiedades
	String md_uuid;
	Calendar md_fch;
	int id_repostage_vehiculo;
	Calendar fecha_hora;	
	float importe;	
	String DNI;	
	String matrícula;	
	String tipo_combustible_vehiculo;
	
	/**
	 * Construtor Normal (Con Factura)
	 * @param importe
	 * @param dNI
	 * @param matrícula
	 * @param tipo_combustible_vehiculo
	 */
	public VehiculoDTO(float importe, String dNI, String matrícula, String tipo_combustible_vehiculo) {
		super();
		this.md_uuid = RandomValue();
		this.md_fch = Calendar.getInstance();
		this.fecha_hora = Calendar.getInstance();;
		this.importe = importe;
		DNI = dNI;
		this.matrícula = matrícula;
		this.tipo_combustible_vehiculo = tipo_combustible_vehiculo;
	}
	
	/**
	 * Construtor Normal (Sin Factura)
	 * @param importe
	 * @param tipo_combustible_vehiculo
	 */
	public VehiculoDTO(float importe, String tipo_combustible_vehiculo) {
		super();
		this.md_uuid = RandomValue();
		this.md_fch = Calendar.getInstance();
		this.fecha_hora = Calendar.getInstance();;
		this.importe = importe;
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

	public Calendar getMd_fch() {
		return md_fch;
	}

	public void setMd_fch(Calendar md_fch) {
		this.md_fch = md_fch;
	}

	public int getId_repostage_vehiculo() {
		return id_repostage_vehiculo;
	}

	public void setId_repostage_vehiculo(int id_repostage_vehiculo) {
		this.id_repostage_vehiculo = id_repostage_vehiculo;
	}

	public Calendar getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Calendar fecha_hora) {
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

	public String getTipo_combustible_vehiculo() {
		return tipo_combustible_vehiculo;
	}

	public void setTipo_combustible_vehiculo(String tipo_combustible_vehiculo) {
		this.tipo_combustible_vehiculo = tipo_combustible_vehiculo;
	}

	//ToString metodo que hace legible a la clase
	@Override
	public String toString() {
		return "VehiculoDTO [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostage_vehiculo="
				+ id_repostage_vehiculo + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", DNI=" + DNI
				+ ", matrícula=" + matrícula + ", tipo_combustible_vehiculo=" + tipo_combustible_vehiculo + "]";
	}

	//Método que genera un valor aleatorio para el campo MdUuid       
    String RandomValue()
    {
    	int random = (int)Math.floor(Math.random()*10+1);
        return ("AS" + random);
    }
	
}
