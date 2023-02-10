package tercerExamenProgramacion;

import java.util.Random;
import java.util.Scanner;
/**
 * Clase que contiene el main y donde se ejecuta todo el programa
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class Main {
	/**
	 * funcion main donde se recoge todo el examen
	 * @param args aun no sabemos para que sirve, asi que es magia
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//------------------------EJERCICIO 1------------------------
		System.out.println("Dame el numero que quieras");
		int n=Integer.parseInt(sc.nextLine());
		byte[] numeros = new byte[n];
		
		//------------------------EJERCICIO 2------------------------
		Random r = new Random();
		
		for(byte i=0; i<numeros.length;i++) {
			byte nAleatorio= (byte) r.nextInt(32, 127);
			numeros[i]=nAleatorio;
			System.out.println("Numero ramdon en la posicion "+i+"="+numeros[i]);
		}
		//------------------------EJERCICIO 3------------------------

		char[] letras= new char[n];
		
		//------------------------EJERCICIO 4------------------------
		
		for(byte i=0; i<letras.length;i++) {
			letras[i]+=(char) numeros[i];
			System.out.println("Caracter de "+numeros[i]+": "+letras[i]);
		}
		
		//------------------------EJERCICIO 5------------------------
		
		String frase="";
		for(byte i=0; i<letras.length;i++) {
			frase+=letras[i];
		}
		System.out.println("Todo concatenado: "+frase);
		
		//------------------------EJERCICIO 6------------------------
		
		System.out.println("Frase con las vocales minusculas: "
		+frase.replace('A', 'a').replace('E', 'e').replace('I', 'i').replace('O', 'o').replace('U', 'u'));
		
		//------------------------EJERCICIO 7------------------------
		int pos=0;
		int posFinal=0;
		do{
			System.out.println("Dame dos numeros");
			pos=Integer.parseInt(sc.nextLine());
			posFinal=Integer.parseInt(sc.nextLine());
			
		}while((pos<0 || pos>n)||(posFinal<0 || posFinal>n));
		
		System.out.println(frase.substring(pos, posFinal));
	
		//------------------------EJERCICIO 8------------------------
		int contador=0;
		for(byte i=0; i<frase.length();i++) {
			if((frase.charAt(i)<65||frase.charAt(i)>90)&&(frase.charAt(i)<97||frase.charAt(i)>122)) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" caracteres que no son letras");
	
	//------------------------EJERCICIO 9------------------------
	
	System.out.println("Con la funcion recursiva sale: "+Funciones.cuentaNoLetras(frase, 0));
	
	
	}

}
