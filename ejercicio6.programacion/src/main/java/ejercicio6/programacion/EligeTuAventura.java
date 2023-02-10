package ejercicio6.programacion;

import java.util.Scanner;

public class EligeTuAventura {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Estamos en CENEC un pacifico dia de clase. "
				+ "\n Y de repente, cae del tragaluz una jirafa con gafas de sol y manos, "
				+ "\n una botella de vodka en una mano y una bandurria en la otra. "
				+ "\n ¿Como reaccionas? "
				+ "\n\t1 - Decirle : ¡Vamonos de fiesta!"
				+ "\n\t2 - Intentas robarle el vodka"
				+ "\n\t3 - Pegarle con la bandurria en la cabeza");
		System.out.println("Escribe 1, 2 o 3 segun la opcion que quieras elegir");
		byte opcionElegida = Byte.parseByte(sc.nextLine());
		
					/*OPCIÓN 1*/
		if (opcionElegida==1){
			System.out.println("Jirafa: ¿De fiesta? Me acabo de caer por un tragaluz,\r\n"
					+ "\r\n"
					+ "Estoy molida. Claro, ves una jirafa con vodka y te quieres ir de fiesta,\r\n"
					+ "\r\n"
					+ "pero nadie pregunta cómo está la jirafa después de caerse.\r\n"
					+ "\r\n"
					+ "¿Qué haces?"
					+ "\n\t1 - Decirle: Jirafa tia, lo siento ¿Estás bien?"
					+ "\n\t2 - Decirle: ¿Y tu me has preguntado como estoy yo? Porque yo necesito irme de fiesta."
					+ "\n Escribe 1 o 2 segun la opcion que quieras elegir.");
			byte opcionElegida1 =Byte.parseByte(sc.nextLine());
			
					/*OPCIÓN 1.1*/
			if (opcionElegida1==1) {
				System.out.println("Jirafa: \"¿Puedes llamar a una ambulancia?");
			
					/*OPCIÓN 1.2*/
			} else if (opcionElegida1==2) {
				System.out.println("Jirafa: \"Pues toma el vodka y vete, y te tira el vodka a la cara. "
						+ "\n Te vas de fiesta con la nariz rota por un vodkazo.");
					/*POR SI METE OTRO NÚMERO*/
			}else {
				System.out.println("Comando Erróneo. Pruebe de nuevo.");
			}
		
		        	
			        /*OPCIÓN 2*/
		} else if (opcionElegida==2) {
			System.out.println("La jirafa se da cuenta he intenta ponerse de pie pero no puede,"
					+ "y comienza a gritar tu nombre"
					+ "\r\n"
					+ "¿Qué haces?"
					+ "\n\t1 - Le arrancas la botella de sus manos y sales corriendo."
					+ "\n\t2 - Le preguntas que por qué sabe tu nombre"
					+ "\n Escribe 1 o 2 segun la opcion que quieras elegir.");
			byte opcionElegida2 = Byte.parseByte(sc.nextLine());
			
				/*OPCIÓN 2.1*/
			if (opcionElegida2==1){
				System.out.println("Acabas de robar a una pobre y desvalida jirafa... Que mala persona.");
			
				/*OPCIÓN 2.2*/
			} else if (opcionElegida2==2) {
				System.out.println("Jirafa: Porque... yo soy tu padre");
			
				/*POR SI METE OTRO NÚMERO*/
			}else {
				System.out.println("Comando Erróneo. Pruebe de nuevo.");
			}
			
		 	        /*OPCIÓN 3*/
		} else if (opcionElegida==3) {
			System.out.println("Miguel te ha pillado pegando a su mascota y te ha expulsado de CENEC");
		} 
		
		/*POR SI METE OTRO NÚMERO*/
			else {
			System.out.println("Comando Erróneo. Pruebe de nuevo.");
		}

	}

}
