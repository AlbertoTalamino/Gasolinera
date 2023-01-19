/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Talamino
 * 
 * DAO para la entidad dlk_tch_RepostageGasolinera
 */

@Entity
@Table(name="dlk_tch_RepostajeGasolinera", schema="dlk_gasolinera")
public class RepostajeGasolinera {

	//Propiedades
	@Column(name="md_uuid", nullable=false)
	String md_uuid;
	
	@Column(name="md_fch", nullable=false)
	@Temporal(TemporalType.DATE) 
	Date md_fch;
	
	@Id
	@Column(name="id_repostaje_gasolinera", nullable=false)
	int id_repostaje_gasolinera;
	
	@Column(name="litros_combustible", nullable=false)
	int litros_combustible;
	
	@ManyToOne
    @JoinColumn(name = "combustible_gasolinera_id")
	TiposCombustible tipo_combustible;


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
	public int getId_repostage() {
		return id_repostaje_gasolinera;
	}
	public void setId_repostage(int id_repostage) {
		this.id_repostaje_gasolinera = id_repostage;
	}
	public int getLitros() {
		return litros_combustible;
	}
	public void setLitros(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}


	//ToString (Metodo que hace legible a la clase)
	@Override
	public String toString() {
		return "RepostageGasolinera [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostage=" + id_repostaje_gasolinera
				+ ", litros_combustible=" + litros_combustible + "]";
	}

	
}
