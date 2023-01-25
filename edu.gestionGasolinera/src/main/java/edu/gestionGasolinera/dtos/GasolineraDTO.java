/**
 * 
 */
package edu.gestionGasolinera.dtos;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Talamino Clase que contiene en forma de DTO la entidad
 *         dlk_tch_RepostajeGasolinera
 */
public class GasolineraDTO {

	// Propiedades
	String md_uuid;
	Calendar md_fch;
	int id_repostaje_gasolinera;
	int litros_combustible;
	String tipo_combustible_gasolinera;
	
	
	/**
	 * Constructor Normal
	 * @param md_uuid
	 * @param md_fch
	 * @param id_repostaje_gasolinera
	 * @param litros_combustible
	 * @param tipo_combustible_gasolinera
	 */
	public GasolineraDTO(int litros_combustible, String tipo_combustible_gasolinera) {
		super();
		this.md_uuid = RandomValue();
		this.md_fch = Calendar.getInstance();;
		this.litros_combustible = litros_combustible;
		this.tipo_combustible_gasolinera = tipo_combustible_gasolinera;
	}


	/**
	 * Constructor Vacío
	 */
	public GasolineraDTO() {
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


	public String getTipo_combustible_gasolinera() {
		return tipo_combustible_gasolinera;
	}


	public void setTipo_combustible_gasolinera(String tipo_combustible_gasolinera) {
		this.tipo_combustible_gasolinera = tipo_combustible_gasolinera;
	}
	
	
	//ToString metodo que hace legible a la clase
	@Override
	public String toString() {
		return "GasolineraDTO [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_repostaje_gasolinera="
				+ id_repostaje_gasolinera + ", litros_combustible=" + litros_combustible
				+ ", tipo_combustible_gasolinera=" + tipo_combustible_gasolinera + "]";
	}


	//Método que genera un valor aleatorio para el campo MdUuid       
    String RandomValue()
    {
    	int random = (int)Math.floor(Math.random()*10+1);
        return ("AS" + random);
    }
	
	
}
