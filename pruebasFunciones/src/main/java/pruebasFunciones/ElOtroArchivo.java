package pruebasFunciones;

import java.util.Random;



/**
 * Clase que contiene funciones de ejemplo preparadas para generar numeros aleatorios,
 * ver si un numero es primo y dibujar caras con algunos caracteres decididos aleatoriamente
 * @author Juan Carlos Gómez Gutiérrez
 * @author Miguel Páramos
 * @version 1;
 * @since 1;
 * 
 */
public class ElOtroArchivo {
	
	/**
	 * Funcion que hace un sysout que dice hola
	 */
	public static void miPrimeraFuncion() {

		System.out.println("Hola desde la función");
	}

	/**
	 * Funcion que devuelve un número entero aleatorio entre mínimo(incluido) y máximo(excluido).
	 * El mínimo tiene que ser obligatoriamente más pequeño que el máximo.
	 * @param minimo número entero que es el más pequeño que aleatoriamente podría salir. Tiene que ser más pequeño que máximo.
	 * @param maximo número entero que es una unidad más grande que el que aleatoriamente puede salir.
	 * @return número entero aleatorio entre minimo(incluido) y maximo(excluido).
	 */
	public static int numeroAleatorio(int minimo, int maximo) {
		Random r = new Random();
		return r.nextInt(minimo, maximo);
	}

	
	/**
	 * Funcion que devuelve un entero aleatorio entre 0(incluido) y maximo(excluido).
	 * @param maximo numero una unidad mayor que el mayor numero que podria salir aleatoriamente
	 * @return  numero entero aleatorio entre 0(incluido) y maximo(excluido).
	 */
	public static int numeroAleatorio(int maximo) { // dos funciones se pueden llamar igual pero los parametros tienen
													// que ser diferentes
		Random r = new Random();
		return r.nextInt(maximo);
	}

	
	
	public static short suma(byte n1, byte n2) {
		short resultado = (short) (n1 + n2);
		return resultado;
	}

	
	
	public static String imprimeTrozo(String trozo, byte nVeces) {
		String ret = "";
		for (byte i = 0; i < nVeces; i++) {
			/*----------Para el pelo--------*/
			if(trozo.equals("pelo")) {
				ret+=ElOtroArchivo.dibujaPelo();
				/*--------Para los ojos--------*/
				}else if(trozo.equals("ojos")){
					ret+=ElOtroArchivo.dibujaOjos();
					/*--------Para la boca-----------*/
					}else if(trozo.equals("boca")) {
						ret+=ElOtroArchivo.dibujaBoca();
						/*--------Para el cuello-----------*/
						}else if(trozo.equals("cuello")) {
						ret+=" /___\\ ";
							}else {
								ret+="algo fallo";
							}
			}
		return ret;
	}
		
		

	public static String sustituir(String trozo, char paraSustituir, char sustituto) {
		return trozo.replace(paraSustituir, sustituto);
	}
	
	
	//__________________________________FUNCION PELO______________________________________
	public static String dibujaPelo() {
		Random r=new Random();
		String pelo= "";
		switch(r.nextInt(4)) {
		case 0:
			pelo=" /'''\\ ";
			break;
		case 1:
			pelo=" /***\\ ";
			break;
		case 2:
			pelo=" @@@@@ ";	
			break;
		case 3:
			pelo=" /|||\\ ";
			break;
		}
		return pelo;
	}
	
	//__________________________________FUNCION OJOS______________________________________
	public static String dibujaOjos() {
		Random r=new Random();
		String ojos= "";
		switch(r.nextInt(4)) {
		case 0:
			ojos="( o o )";
			break;
		case 1:
			ojos="( x x )";
			break;
		case 2:
			ojos="( - o )";	
			break;
		case 3:
			ojos="( - - )";
			break;
		}
		return ojos;
	}
	
	//__________________________________FUNCION BOCA______________________________________
	public static String dibujaBoca() {
		Random r=new Random();
		String boca= "";
		switch(r.nextInt(4)) {
		case 0:
			boca=" \\ - / ";
			break;
		case 1:
			boca=" \\ V / ";
			break;
		case 2:
			boca=" \\ x / ";	
			break;
		case 3:
			boca=" \\ O / ";
			break;
		}
		return boca;
	}
	/*-----------------------------PISTA LAPIDA---------------------------------------*/
	
	public static String imprimeRombo(byte anchuraMaxima) {
		String ret="|";
		boolean longitudPar= anchuraMaxima%2==0;
		for(byte i=0; i<anchuraMaxima/2-("DEP".length()/2+(longitudPar?1:0));i++) {
			ret+=" ";
		}
		ret+="DEP";
		for(byte i=0; i<anchuraMaxima-2-"DEP".length()/2;i++) {
			ret+=" ";
		}
		ret+="|";
		
		ret+="\n<";
		for(byte i=0; i<anchuraMaxima;i++) {
			ret+="-";
		}
		ret+=">\n";
		return ret;
	}
	
	
	public static boolean esPrimo(long numero) {
		for(long i=2;i<=numero/2;i++) {
			if(numero%2==0) {
				return false;	
			}
		}
		return true;
	}
	
	
	
}
