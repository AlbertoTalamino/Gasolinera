/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Talamino
 *
 * DAO para la entidad dlk_tch_RepostageVehiculo
 */

@Entity
@Table(name="dlk_tch_RepostajeVehiculo", schema="dlk_gasolinera")
public class RepostajeVehiculo {

	//Propiedades
	@Column(name="md_uuid", nullable=false)
	String md_uuid;
	
	@Column(name="md_fch", nullable=false)
	@Temporal(TemporalType.DATE) 
	Calendar md_fch;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_repostage_vehiculo", nullable=false)
	int id_repostage_vehiculo;
	
	@Column(name="fecha_hora", nullable=false)
	@Temporal(TemporalType.DATE) 
	Calendar fecha_hora;
	
	@Column(name="importe", nullable=false) 
	float importe;
	
	@Column(name="DNI", nullable=false)
	String DNI;
	
	@Column(name="matrícula", nullable=false)
	String matrícula;
	
	@Column(name="tipo_combustible", nullable=false)
	String tipo_combustible_vehiculo;
	
	

	public RepostajeVehiculo(String md_uuid, Calendar md_fch, int id_repostage_vehiculo, Calendar fecha_hora, float importe,
			String dNI, String matrícula, String tipo_combustible_vehiculo) {
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
	

}
