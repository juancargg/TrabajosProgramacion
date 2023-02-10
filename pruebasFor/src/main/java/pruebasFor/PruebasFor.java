package pruebasFor;

import java.util.Random;
import java.util.Scanner;

public class PruebasFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un texto, y le hacemos transformaciones en el programa");
		String texto = sc.nextLine();
		String codificado = "";
		byte opcion;
		
		do {
			System.out.println(FuncionesParaFor.imprimeMenu());
			
			opcion = Byte.parseByte(sc.nextLine());

			switch (opcion) {
			
			case 1:
				for (short i = (short) (texto.length() - 1); i >= 0; i--) {
					System.out.print(texto.charAt(i));
				}
				System.out.println();
				break;
				
			case 2:
				texto = texto.toUpperCase();
				System.out.println(texto);
				break;
			
			case 3:
				texto = texto.toLowerCase();
				System.out.println(texto);
				break;
			
			case 4:
				String resultado = "" + texto.toUpperCase().charAt(0);
				for (short i = 1; i < texto.length(); i++) {
					resultado += texto.toLowerCase().charAt(i);
				}
				System.out.println(resultado);
				break;
			
			case 5:
				String mimificado = "";
				for (short i = 0; i < texto.length(); i++) {
					mimificado += texto.charAt(i) + "mi";

					// Esto para que el "mi" se meta cada 2
					// mimificado+=texto.charAt(i)+(i%2==1?"mi":"");
				}
				
				System.out.println(mimificado);
				
				for(short i=0; i<mimificado.length();i+=3) {
					System.out.print(mimificado.charAt(i)); //el print imprime sin salto de línea el println sí hace salto de línea 
				}

				break;
			
			case 6:
				codificado = "";
				for (short i = 0; i < texto.length(); i++) {
					codificado += (char) (texto.charAt(i) + 8);
				}
				System.out.println(codificado);
				break;
			
			case 7:
				String original = "";
				for (short i = 0; i < codificado.length(); i++) {
					original += (char) (codificado.charAt(i) - 8);
				}
				System.out.println(original);
				break;

			case 8:
				String codificado2="";
				Random letraLoca = new Random();
				char letraRan;
				
				for (short i = 0; i < texto.length(); i++) {
					letraRan = (char) letraLoca.nextInt(97, 123);
					codificado2 += ""+(texto.charAt(i)+8)+letraRan;
				}
				
				System.out.println(codificado2);

				break;

			case 9:
				Random aleatorio = new Random();// fuera de los bucles siempre porque pueden salir los mismos numeros
				/*
				 * for(byte i=0;i<10;i++) { int nElegido=aleatorio.nextInt(-100,100);
				 * System.out.println(nElegido);
				 */ // saca numeros randoms

				int numeroElegido = aleatorio.nextInt(1, 11);
				System.out.println("He elegido un numero entre 1 y 10. Adivina cual");
				byte numeroEscogido;
				do {
					numeroEscogido = Byte.parseByte(sc.nextLine());
					if (numeroEscogido != numeroElegido) {
						System.out.println("Ese no era");
					}
				} while (numeroEscogido != numeroElegido);
				System.out.println("Has acertado!!");
				break;
			}

			System.out.println("\n Pulsa ENTER para continuar... ");
			sc.nextLine();

		} while (opcion != 0);

	}
}
