package pruebasIf;

import java.util.Scanner;

public class PruebasIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char genero='x'; 
		while(genero!='h' && genero!='m' && genero!='n') {
			System.out.println("Escribe h si eres hombre, m si eres mujer o n si eres genero neutro");
			genero = scan.nextLine().charAt(0);
		}
		

		switch (genero) {
		case 'H':
		case 'h':
			System.out.println("Bienvenido al programa");
			break;

		case 'M':
		case 'm':
			System.out.println("Bienvenida al programa");
			break;

		case 'N':
		case 'n':
			System.out.println("Bienvenide al programa");
			break;

		default:
			System.out.println("Debes elegir entre h, m o n");
			break;
		}

		// boolean esHombre = scan.nextLine().equals("h");
		/*
		 * if(scan.nextLine().equals("h")) { esHombre = true; } else { esHombre = false;
		 * }
		 */

		System.out.println("Escribe una palabra que no sea \"cermuzo\"");
		String palabra = scan.nextLine();

		if (palabra.length() > 8) {
			System.out.println("No me gustan las palabras tan largas");
		} else if (palabra.equals("cermuzo") || palabra.equals("Cermuzo")) {
			System.out.println("Te he dicho que no me pongas cermuzo, " + "so cermuz"
					+ (genero == 'h' ? "o" : (genero == 'm' ? "a" : "e")));
		}

		System.out.println("Bienvenid" + (genero == 'h' ? "o" : (genero == 'm' ? "a" : "e")) + ", "
				+ "Has puesto la palabra: " + palabra + ", ¿que quieres hacer con ella?"
				+ "\n\t1 - Invertir las palabras" + "\n\t2 - Codificar la palabra");

		byte opcion = Byte.parseByte(scan.nextLine());

		switch (opcion) {
		case 1:
			System.out.println("Aqui le pondre la palabra al reves");
			break;

		case 2:
			System.out.println("Aqui codificare la palabra");
			break;

		default:
			System.out.println("Debiste elegir 1 o 2");
			break;
		}

	}
}
