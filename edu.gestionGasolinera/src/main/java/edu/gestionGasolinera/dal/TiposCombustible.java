/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Talamino
 *
 * DAO para la entidad dlk_cat_TipoCombustibles
 */

@Entity
@Table(name = "dlk_tch_TiposCombustibles", schema = "dlk_gasolinera")
public class TiposCombustible {

	// Propiedades
	@Column(name = "md_uuid", nullable = false)
	String md_uuid;
	
	@Column(name = "md_fch", nullable = false)
	@Temporal(TemporalType.DATE) 
	Date md_fch;
	
	@Id
	@Column(name = "id_repostaje_gasolinera", nullable = false)
	int id_repostaje_gasolinera;
	
	@Column(name = "litros_combustible", nullable = false)
	int litros_combustible;
	   
	@Column(name = "tipo_combustible", nullable = false)
	@ManyToMany(mappedBy = "tipo_combustible")	 
	List<String> tipo_combustible;
	

	//Constructores
	
	/**
	 * Constructor normal
	 * @param md_uuid
	 * @param md_fch
	 * @param id_repostaje_gasolinera
	 * @param litros_combustible
	 * @param tipo_combustible
	 */
	public TiposCombustible(String md_uuid, Date md_fch, int id_repostaje_gasolinera, int litros_combustible,
			List<String> tipo_combustible) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_repostaje_gasolinera = id_repostaje_gasolinera;
		this.litros_combustible = litros_combustible;
		this.tipo_combustible = tipo_combustible;
	}

	/**
	 * Constructor vacío
	 */
	public TiposCombustible() {
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
	public int getId_repostaje_gasolinera() {
		return id_repostaje_gasolinera;
	}
	public void setId_repostaje_gasolinera(int id_repostaje_gasolinera) {
		this.id_repostaje_gasolinera = id_repostaje_gasolinera;
	}
	public int getLitros_combustible() {
		return litros_combustible;
	}
	public void setLitros_combustible(int litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	public List<String> getTipo_combustible() {
		return tipo_combustible;
	}
	public void setTipo_combustible(List<String> tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
	
	
	//ToString (Metodo que hace legible a la clase)
	@Override
	public String toString() {
		return "TiposCombustible [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostaje_gasolinera="
				+ id_repostaje_gasolinera + ", litros_combustible=" + litros_combustible + ", tipo_combustible="
				+ tipo_combustible + "]";
	}
	
}
