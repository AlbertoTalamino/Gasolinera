/**
 * 
 */
package edu.gestionGasolinera.controlador;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import edu.gestionGasolinera.dal.RepostajeVehiculo;
import edu.gestionGasolinera.impl.Consultas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Talamino Clase que contiene la administracion de nuestra app
 */

@Controller
public class App {

	static Scanner sn = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Obtenemos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		// Añadimos a nuestra clase consulta el contexto
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//Metodo propio de la clase calendar con el cual obtenemos la fecha actual
		Calendar fch_actual = Calendar.getInstance();
		
		//Insert de prueba para conprobar que nuestro modelo se translada correctamente a la BBDD
		consulta.repostajeVehículo(new RepostajeVehiculo(" ", fch_actual, 1, fch_actual, 3, " ", " ", " "  ));

	
		//Menu principal (Uso por consola aunque imitaría el funcionamiento que se haría por vistas)
		int opcion;
		do {
			System.out.println("\n\t\t   MENU");
			System.out.println("\n\t\t1) Repostaje normal");
			System.out.println("\t\t2) Repostaje factura");
			System.out.println("\t\t3) Ver todos los repostajes");
			System.out.println("\t\t4) Importe total combustible vendido");
			System.out.println("\t\t5) Llenado de depósito");
			System.out.println("\t\t6) Eliminar último llenado de depósito");
			System.out.println("\t\t7) Ver todos los llenados de depósito");
			System.out.println("\n\t\t0) Salir");

			System.out.print("\n\t\tEscribe una de las opciones: ");
			opcion = sn.nextInt();

			switch (opcion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

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
