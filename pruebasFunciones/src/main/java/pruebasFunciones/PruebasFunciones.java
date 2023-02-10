package pruebasFunciones;

import java.util.Scanner;
/**
 * Clase principal que contiene el main
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class PruebasFunciones {

	/**
	 * funcion main para hacer pruebas
	 * @param args sin uso
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*ElOtroArchivo.miPrimeraFuncion();
		int numero0y30 =ElOtroArchivo.numeroAleatorio(0, 30);
		System.out.println(numero0y30);
		
		int numero50y80 =ElOtroArchivo.numeroAleatorio(50, 80);
		System.out.println(numero50y80);
		
		int numero100=ElOtroArchivo.numeroAleatorio(100);
		System.out.println(numero100);*/
		/*
		 /'''\
		( o o )
		 \ - /
		 /___\*/
		/*System.out.println("Cuantas caras quieres?");
		byte nCaras=Byte.parseByte(sc.nextLine());*/
		
		/*System.out.println("Dime el caracter que quieres para los ojos");
		char ojos=sc.nextLine().charAt(0);
		
		System.out.println("Dime el caracter que quieres para la boca");
		char boca=sc.nextLine().charAt(0);*/
		
		/*
		//---------------------------PELO--------------------------------
		System.out.println(ElOtroArchivo.imprimeTrozo("pelo", nCaras));
		
		//---------------------------OJOS--------------------------------
		System.out.println(ElOtroArchivo.imprimeTrozo("ojos", nCaras));
		
		//---------------------------BOCA--------------------------------
		System.out.println(ElOtroArchivo.imprimeTrozo("boca", nCaras));
		
		//---------------------------CUELLO------------------------------
		System.out.println(ElOtroArchivo.imprimeTrozo("cuello", nCaras));
*/
		
		System.out.println("Anchura maxima");
		byte anchuraMaxima=sc.nextByte();
		System.out.println(ElOtroArchivo.imprimeRombo(anchuraMaxima));
	}
	

}
