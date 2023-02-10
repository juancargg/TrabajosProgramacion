package sopaLetras;

import java.util.Scanner;

public class PrincipalSopa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//Creacion de la sopa de letras totalmente aleatoria
		System.out.println("De cuantas filas quieres la sopa?");
		byte nFilas=Byte.parseByte(sc.nextLine());
		System.out.println("De cuantas columnas quieres la sopa?");
		byte nColumnas=Byte.parseByte(sc.nextLine());
		char[][] sopa=FuncionesSopa.creaSopa(nFilas, nColumnas);
		System.out.println(FuncionesSopa.imprimeMatriz(sopa));
		
	//creacion matriz boolean
		boolean [][] palabraAqui=FuncionesSopa.sopaBooleana(nFilas, nColumnas);
		System.out.println(FuncionesSopa.imprimeMatriz(palabraAqui));
	
		//introducimos una palabra
	
		System.out.println("¿Cuántas palabras quieres introducir?");
		byte nPalabras=Byte.parseByte(sc.nextLine());
		
		
		boolean puedoSeguir=false;
		byte contadorPalabras=1;
		do {
			System.out.println(FuncionesSopa.imprimeMatriz(sopa));
			System.out.println("Dime una palabra que quieras insertar en la sopa "+contadorPalabras+"/"+nPalabras);
			String palabra=sc.nextLine();
			System.out.println(FuncionesSopa.menuDireccion());
			byte direccion=Byte.parseByte(sc.nextLine());
			
			System.out.println("Dime la fila donde quieres insertar la palabra");
			byte filaInsercion=Byte.parseByte(sc.nextLine());
			System.out.println("Dime la columna donde quieres insertar la palabra");
			byte columnaInsercion=Byte.parseByte(sc.nextLine());
			
			puedoSeguir=FuncionesSopa.insertaPalabra(sopa, palabra, filaInsercion, columnaInsercion, direccion, palabraAqui);
			if(!puedoSeguir) {
				System.out.println("La palabra no cabe ahí. Pon otra.");
				contadorPalabras--;
			}
			contadorPalabras++;
		}while(!puedoSeguir||contadorPalabras<=nPalabras);
		
		
		
		System.out.println(FuncionesSopa.imprimeMatriz(sopa));
		System.out.println(FuncionesSopa.imprimeMatriz(palabraAqui));
	
	}//
}
