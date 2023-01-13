/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	Date md_fch;
	@Id
	@Column(name="id_repostaje_gasolinera", nullable=false)
	int id_repostaje_gasolinera;
	@Column(name="litros_combustible", nullable=false)
	int litros_combustible;
	@Column(name="tipo_combustible", nullable=false)
	String tipo_combustible;
	
	
	//Constructores
	public RepostajeGasolinera(String md_uuid, Date md_fch, int id_repostaje_gasolinera, int litros_combustible,
			String tipo_combustible) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_repostaje_gasolinera = id_repostaje_gasolinera;
		this.litros_combustible = litros_combustible;
		this.tipo_combustible = tipo_combustible;
	}
	
	public RepostajeGasolinera() {
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
	public String getTipo_combustible() {
		return tipo_combustible;
	}
	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}

	
	@Override
	public String toString() {
		return "RepostageGasolinera [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostage=" + id_repostaje_gasolinera
				+ ", litros_combustible=" + litros_combustible + ", tipo_combustible=" + tipo_combustible + "]";
	}

	
}
