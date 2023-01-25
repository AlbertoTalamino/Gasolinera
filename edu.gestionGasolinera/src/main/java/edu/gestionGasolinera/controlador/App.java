/**
 * 
 */
package edu.gestionGasolinera.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import edu.gestionGasolinera.dal.RepostajeGasolinera;
import edu.gestionGasolinera.dal.RepostajeVehiculo;
import edu.gestionGasolinera.dtos.GasolineraDTO;
import edu.gestionGasolinera.dtos.ToDAOServicioImpl;
import edu.gestionGasolinera.dtos.ToDTOServicioImpl;
import edu.gestionGasolinera.dtos.VehiculoDTO;
import edu.gestionGasolinera.impl.ConsultasServicio;
import edu.gestionGasolinera.impl.ConsultasServicioImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Talamino Clase que contiene la administracion de nuestra app
 * 
 * Dudas:
 * 1. Xq se añade la clase ConsultasServicio en vez de ConsultasServicioImpl al contexto?
 * 2. Fallo en insert (No entiendo el error que me da)
 * 3. Pasar una lista de objetos DAO a una lista de Objetos DTO (Casting)
 * 4. Delete va de lujo pero ni yo se como funciona
 */

@Controller
public class App {

	//Declaramos el escaner que imitara el funcionamiento de un input
	private static Scanner sn = new Scanner(System.in);

	
	//Se instancian los métodos de conversión de DAOs <-> DTOs
	
	@Autowired
	private static ToDAOServicioImpl ToDAO;
	
	@Autowired
	private static ToDTOServicioImpl ToDTO;

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obtenemos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		// Añadimos a nuestra clase consulta el contexto
		ConsultasServicio consultas = (ConsultasServicio) context.getBean(ConsultasServicio.class);

	
		//Menu principal (Uso por consola aunque imitaría el funcionamiento que se haría por vistas)
		int opcion;
		do {
			System.out.println("\n\t\t   MENU");
			System.out.println("\n\t\t1) Repostaje normal");
			System.out.println("\t\t2) Repostaje factura");
			System.out.println("\t\t3) Ver todos los repostajes");
			System.out.println("\t\t4) Importe total combustible vendido");
			System.out.println("\t\t5) Llenado de deposito");
			System.out.println("\t\t6) Eliminar ultimo llenado de deposito");
			System.out.println("\t\t7) Ver todos los llenados de deposito");
			System.out.println("\n\t\t0) Salir");

			System.out.print("\n\t\tEscribe una de las opciones: ");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				
				//Se recogen los datos
				System.out.print("\n\t\tIngrese el importe: ");
				float importe_RN = sn.nextFloat();
				
				System.out.print("\n\t\tIngrese el tipo combustible: "); 
				String tipoCombustible_RN = sn.next();
			
				//Se declara e inicializa el DTO
				VehiculoDTO vehiculoDTO_RN = new VehiculoDTO(importe_RN, tipoCombustible_RN);
				
				//Se llama al metodo en cuestion para la consulta a la base de datos mediante la clase consulta
				consultas.repostajeVehículo(ToDAO.VehiculoToDAO(vehiculoDTO_RN)); //Se convierte de DTO a DAO 
				
				break;
				
			case 2:
				
				//Se recogen los datos
				System.out.print("\n\t\tIngrese el importe: ");
				float importe_RF = sn.nextFloat();
				
				System.out.print("\n\t\tIngrese el DNI: "); 
				String DNI_RF = sn.next();
				
				System.out.print("\n\t\tIngrese la matricula: "); 
				String matricula_RF = sn.next();
				
				System.out.print("\n\t\tIngrese el tipo combustible: "); 
				String tipoCombustible_RF = sn.next();
				
				
				//Se declara e inicializa el DTO
				VehiculoDTO vehiculoDTO_RF = new VehiculoDTO(importe_RF, DNI_RF, matricula_RF, tipoCombustible_RF);
				
				//Se llama al metodo en cuestion para la consulta a la base de datos mediante la clase consulta
				consultas.repostajeVehículo(ToDAO.VehiculoToDAO(vehiculoDTO_RF)); //Se convierte de DTO a DAO 
				
				break;
				
			case 3:
				
				List<RepostajeGasolinera> listRepostajeGasolinera =  consultas.verRepostajeGasolinera();
				
				//Hubiera que convertir la lista tipo DAO a tipo DTO 
				for (RepostajeGasolinera item: listRepostajeGasolinera) {
					System.out.println(item);
				}
				
				break;
				
			case 4:
				
				//No se hacer querys parametrizadas en HQL
				
				break;
				
			case 5:
				
				//Se recogen los datos
				System.out.print("\n\t\tLitros combustible: ");
				int litrosCombustible = sn.nextInt();
				
				System.out.print("\n\t\tIngrese el tipo combustible: "); 
				String tipoCombustible_G = sn.next();
				
				//Se declara e inicializa el DTO
				GasolineraDTO gasolineraDTO = new GasolineraDTO(litrosCombustible, tipoCombustible_G);
				
				//Se llama al metodo en cuestion para la consulta a la base de datos mediante la clase consulta
				consultas.repostajeGasolinera(ToDAO.GasolineraToDAO(gasolineraDTO)); //Se convierte de DTO a DAO 
				
				break;

			case 6:
				
				//Se recogen todos los repostages previos
				List<RepostajeGasolinera> listRepostajeGasolineraAux =  consultas.verRepostajeGasolinera();
				
				//Se calcula el ultimo elemento
				int elemento = listRepostajeGasolineraAux.size();
				
				consultas.eliminarRepostajeGasolinera(listRepostajeGasolineraAux.get(elemento-1));
				
				break;
				
			case 7:

				//No se hacer querys parametrizadas en HQL
				
				break;
				
			case 0:
				System.out.println("\n\t\tGracias por usar nuestra app");
				break;
			default:
				System.out.println("\n\t\tSolo números entre 0 y 7");
			}

		} while (opcion != 0);

	}

}
