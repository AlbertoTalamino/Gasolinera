/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Calendar;

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
	Calendar md_fch;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_repostaje_gasolinera", nullable=false)
	int id_repostaje_gasolinera;
	
	@Column(name="litros_combustible", nullable=false)
	int litros_combustible;
	
	@Column(name="tipo_combustible", nullable=false)
	String tipo_combustible_gasolinera;


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
	public int getId_repostage() {
		return id_repostaje_gasolinera;
	}
	public void setId_repostage(int id_repostage) {
		this.id_repostaje_gasolinera = id_repostage;
	}
	public int getLitros_combustible() {
		return litros_combustible;
	}
	public void setLitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	public String getTipo_combustible_gasolinera() {
		return tipo_combustible_gasolinera;
	}
	public void setTipo_combustible_gasolinera(String tipo_combustible_gasolinera) {
		this.tipo_combustible_gasolinera = tipo_combustible_gasolinera;
	}


}
