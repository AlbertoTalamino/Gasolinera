/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Talamino
 *
 * DAO para la entidad dlk_tch_RepostageVehiculo
 */

@Entity
@Table(name="dlk_tch_RepostageGasolinera", schema="dlk_gasolinera")
public class RepostajeVehiculo {

	//Propiedades
	@Column(name="md_uuid", nullable=false)
	String md_uuid;
	@Column(name="md_fch", nullable=false)
	Date md_fch;
	@Id
	@Column(name="id_repostage_vehiculo", nullable=false)
	int id_repostage_vehiculo;
	@Column(name="fecha_hora", nullable=false)
	Date fecha_hora;
	@Column(name="importe", nullable=false)
	float importe;
	@Column(name="DNI", nullable=false)
	String DNI;
	@Column(name="matrícula", nullable=false, columnDefinition="0000AAA")
	String matrícula;
	@Column(name="tipo_combustible", nullable=false, columnDefinition="0000AAA")
	String tipo_combustible;
	
}
