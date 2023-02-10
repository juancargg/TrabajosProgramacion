package queVieneLaPelona;

import java.util.Random;
import java.util.Scanner;

public class PrincipalPelona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		char teclaIzda;
		char teclaDcha;
		
		if(args.length<1) {
			teclaIzda = 'a';
		}else {
			teclaIzda=args[0].charAt(0);
		}
		
		if(args.length<2) {
			teclaDcha = 'd';
		}else {
			teclaDcha = args[1].charAt(0);
		}

		System.out.println("⚰️⚰️⚰️⚰️⚰️ Que viene la pelonaaaa ⚰️⚰️⚰️⚰️⚰️");
		

		byte tamaño;

		do {

			System.out.println("Dime tamaño del tablero ( 5 - 15 )");

			tamaño = Byte.parseByte(sc.nextLine());

		} while (tamaño < 5 || tamaño > 15);

		// Pido el nº de muertes objetivo

		System.out.println("¿A cuántas personas quieres sacar de este plano de existencia?");

		byte muertesObjetivo = Byte.parseByte(sc.nextLine());

		byte contadorMuertes = 0;

		// generamos el tablero con el tamaño dado

		String[] tablero = FuncionesPelona.generaTablero(tamaño);

		// El segundo tablero tumbas, va a servir para colocar las tumbas

		// en las posiciones en las que se vayan produciendo las muertes.

		String[] tumbas = FuncionesPelona.generaTablero(tamaño);

		byte posCalavera = FuncionesPelona.colocaElemento(tablero, '☠');

		byte posCondenado = FuncionesPelona.colocaElemento(tablero, 'ඞ');

		System.out.println(FuncionesPelona.imprimeTablero(tablero, tumbas));

		short contadorTurnos = 0;

		// bucle de juego

		for (; muertesObjetivo > contadorMuertes; contadorTurnos++) {

			// 1 - obtener las entradas

			byte direccionMovimiento = 0;

			System.out.println("¿A dónde quieres moverte? ( Izquierda - " + teclaIzda +

					" / Derecha - " + teclaDcha + " )");

			char direccion = sc.nextLine().charAt(0);
			

			if (direccion == teclaIzda) {

				if (posCalavera != 0) {

					direccionMovimiento = -1;

				} else {

					direccionMovimiento = (byte) (tablero.length - 1);

				}

			} else if (direccion == teclaDcha) {

				if (posCalavera != tablero.length - 1) {

					direccionMovimiento = 1;

				} else {

					direccionMovimiento = (byte) (posCalavera * -1);

				}

			}

			// 2 - Calcular las consecuencias

			// 2.1 - La calavera se mueve

			tablero[posCalavera] = "_";

			posCalavera += direccionMovimiento;

			tablero[posCalavera] = "☠";

			// 2.2 - Si la muerte pilla al condenado, el condenado la espicha

			
			if (posCalavera == posCondenado) {

				contadorMuertes++;

				tumbas[posCalavera] = "⚰️";

				if (contadorMuertes < muertesObjetivo) {

					posCondenado = FuncionesPelona.colocaElemento(tablero, 'ඞ');

				}

			}
			// Movimiento del Among us
			int posAmong=r.nextInt(2);
			byte dirMov = 0;
			//Mientras no se haya matado a la mitad de los amongus que se mueva aleatoriamente
			if(contadorMuertes<(muertesObjetivo/2)) {
				if (posAmong == 0) {

					if (posCondenado != 0) {

						dirMov = -1;

					} else {

						dirMov = (byte) (tablero.length - 1);

					}
				}else if (posAmong == 1) {

					if (posCondenado != tablero.length - 1) {

						dirMov = 1;

					} else {

						dirMov = (byte) (posCondenado * -1);

					}

				}
				tablero[posCondenado] = "_";

				posCondenado += dirMov;
				
				//si se mueve para el mismo sitio que esta la calvera, se muere

				if (posCondenado==posCalavera) {

					contadorMuertes++;

					tumbas[posCondenado] = "⚰️";

					if (contadorMuertes < muertesObjetivo) {

						posCondenado = FuncionesPelona.colocaElemento(tablero, 'ඞ');

					}

				}else{
					tablero[posCondenado] = "ඞ";
				}
			} else {//para cuanto ya se haya matado a la mitad de los amongus para que se muevan al mismo lugar que la calavera
				//siempre y cuando el amongus no este en una tumba
				if (direccion == teclaIzda && (tablero[posCondenado]!="⚰️")) {

					if (posCondenado != 0) {

						direccionMovimiento = -1;

					} else {

						direccionMovimiento = (byte) (tablero.length - 1);

					}

				} else if (direccion == teclaDcha && (tablero[posCondenado]!="⚰️")) {

					if (posCondenado != tablero.length - 1) {

						direccionMovimiento = 1;

					} else {

						direccionMovimiento = (byte) (posCondenado * -1);

					}

				}
				tablero[posCondenado] = "_";

				posCondenado += direccionMovimiento;

				if (posCondenado==posCalavera) {

					contadorMuertes++;

					tumbas[posCondenado] = "⚰️";

					if (contadorMuertes < muertesObjetivo) {

						posCondenado = FuncionesPelona.colocaElemento(tablero, 'ඞ');

					}

				}else {
					tablero[posCondenado] = "ඞ";
				}
			}
			
				
			// 3 - Imprimir la siguiente imagen

			System.out.println("\n\nMuertes: " + contadorMuertes + "/" + muertesObjetivo);

			System.out.println(FuncionesPelona.imprimeTablero(tablero, tumbas));

		}
		
		

		System.out.println("⚰️⚰️⚰️⚰️⚰️ Mwahahahahaha ⚰️⚰️⚰️⚰️⚰️");// ☗

		System.out.println("Has cosechado " + contadorMuertes + " almas...");

		System.out.println("Has tardado " + contadorTurnos +

				" turnos, en un tablero de tamaño " + tablero.length);

	}

}

