/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	Calendar md_fch;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_repostaje_gasolinera", nullable = false)
	int id_repostaje_gasolinera;
	
	@Column(name = "litros_combustible", nullable = false)
	int litros_combustible;
	   
	//@Column(name = "tipo_combustible", nullable = false)
	@OneToMany()
	List<RepostajeGasolinera> repostaje_gasolinera;
	
	@OneToMany() 
	List<RepostajeVehiculo> repostaje_vehiculo;
	
	

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
	
	
	
}
