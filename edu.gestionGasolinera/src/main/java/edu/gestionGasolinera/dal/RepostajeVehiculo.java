/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Talamino
 *
 * DAO para la entidad dlk_tch_RepostageVehiculo
 */

@Entity
@Table(name="dlk_tch_RepostageVehiculo", schema="dlk_gasolinera")
public class RepostajeVehiculo {

	//Propiedades
	@Column(name="md_uuid", nullable=false)
	String md_uuid;
	@Column(name="md_fch", nullable=false)
	@Temporal(TemporalType.DATE) 
	Date md_fch;
	@Id
	@Column(name="id_repostage_vehiculo", nullable=false)
	int id_repostage_vehiculo;
	@Column(name="fecha_hora", nullable=false)
	@Temporal(TemporalType.DATE) 
	Date fecha_hora;
	@Column(name="importe", nullable=false)
	float importe;
	@Column(name="DNI", nullable=false, columnDefinition="00000000A")
	String DNI;
	@Column(name="matrícula", nullable=false, columnDefinition="000AAA")
	String matrícula;
	
	//Constructores
	
	/**
	 * Constructor normal
	 * @param md_uuid
	 * @param md_fch
	 * @param id_repostage_vehiculo
	 * @param fecha_hora
	 * @param importe
	 * @param dNI
	 * @param matrícula
	 * @param tipo_combustible
	 */
	public RepostajeVehiculo(String md_uuid, Date md_fch, int id_repostage_vehiculo, Date fecha_hora, float importe,
			String dNI, String matrícula) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_repostage_vehiculo = id_repostage_vehiculo;
		this.fecha_hora = fecha_hora;
		this.importe = importe;
		DNI = dNI;
		this.matrícula = matrícula;
	}

	/**
	 * Constructor vacío
	 */
	public RepostajeVehiculo() {
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



	//ToString (Metodo que hace legible a la clase)
	@Override
	public String toString() {
		return "RepostajeVehiculo [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostage_vehiculo="
				+ id_repostage_vehiculo + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", DNI=" + DNI
				+ ", matrícula=" + matrícula + "]";
	}

}
