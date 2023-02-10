package pruebaMatrices;

import java.util.Scanner;

public class PrincipalMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	/*	byte numero=5;
		byte[] array=new byte[4];
		byte[] array1= {4, -3, 12,44};
		
		byte [][] matriz= new byte[3][4];//el primer numero son las filas y el segundo las columnas
		byte[][] matriz1= {{5,3,22},{-12,77,1}};
		byte [][][] matrizGrande=new byte[3][2][2];//le puedes poner todas las dimensiones que quieras
		byte[][][] matrizGrande1= {
				{{1,2},{3,4}},
				{{5,6},{7,8}},
				{{9,10},{11,12}}
				};
		
		for(byte i=0;i<matriz1.length;i++){//primero se recorren las filas
			for(byte j=0; j<matriz1[i].length;j++) {
				System.out.print(matriz1[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(byte i=0;i<matriz1.length;i++){//para imprimirlo al reves
			for(byte j=(byte)(matriz1[i].length-1); j>=0;j--) {
				System.out.print(matriz1[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		//Generacion de la matriz
		System.out.println("De cuantas filas quieres la sopa?");
		byte nFilas=Byte.parseByte(sc.nextLine());
		System.out.println("De cuantas columnas quieres la sopa?");
		byte nColumnas=Byte.parseByte(sc.nextLine());
		
		char[][] sopa=FuncionesMatrices.creaSopa(nFilas, nColumnas);
	//	System.out.println(FuncionesMatrices.imprimeMatriz(sopa));
		
		//insercion de la palabra
		boolean puedoSeguir=false;
		do {
			System.out.println("Dime una palabra que quieras insertar en la sopa");
			String palabra=sc.nextLine();
			System.out.println("Dime la fila donde quieres insertar la palabra");
			byte filaInsercion=Byte.parseByte(sc.nextLine());
			System.out.println("Dime la columna donde quieres insertar la palabra");
			byte columnaInsercion=Byte.parseByte(sc.nextLine());
			puedoSeguir=FuncionesMatrices.insertaPalabra(sopa, palabra, filaInsercion, columnaInsercion);
			if(!puedoSeguir) {
				System.out.println("La palabra no cabe ahi. Pon otra.");
			}
		}while(!puedoSeguir);
		
		System.out.println(FuncionesMatrices.imprimeMatriz(sopa));
		
		
	}//

}
