/**
 * 
 */
package edu.gestionGasolinera.controlador;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

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

		/*
		 * // Creamos el DTO dto.NotaEv evDTO = new dto.NotaEv("JUF··", 8, "PR");
		 * 
		 * // Consulta y paso de DTO a DAO
		 * consulta.insertarUnPedido(toDAO.DTONotaEvToDAO.convert(evDTO));
		 * 
		 * System.out.println(consulta.Evaluacion());
		 */

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

			System.out.print("\n\tEscribe una de las opciones: ");
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
				System.out.println("Gracias por usar nuestra app");
				break;
			default:
				System.out.println("Solo números entre 0 y 7");
			}

		} while (opcion != 0);

	}

}
