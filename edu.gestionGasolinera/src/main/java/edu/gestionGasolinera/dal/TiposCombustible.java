/**
 * 
 */
package edu.gestionGasolinera.dal;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Talamino
 *
 *         DAO para la entidad dlk_cat_TipoCombustibles
 */

@Entity
@Table(name = "dlk_tch_RepostageGasolinera", schema = "dlk_gasolinera")
public class TiposCombustible {

	// Propiedades
	@Column(name = "md_uuid", nullable = false)
	String md_uuid;
	@Column(name = "md_fch", nullable = false)
	Timestamp md_fch;
	@Id
	@Column(name = "id_repostaje_gasolinera", nullable = false)
	int id_repostaje_gasolinera;
	@Column(name = "litros_combustible", nullable = false)
	int litros_combustible;
	@Column(name = "tipo_combustible", nullable = false)
	String tipo_combustible;

}
