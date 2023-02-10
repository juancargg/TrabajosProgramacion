package queVieneLaPelona;

import java.util.Random;

public class FuncionesPelona {
	/**
	 * 
	 * función que dado un tamaño, crea un array de ese tamaño, con todas las
	 * 
	 * posiciones rellenas con el string "_"
	 *
	 * 
	 * 
	 * @param tamaño tamaño del array
	 * 
	 * @return null si el tamaño no está entre 5 y 15, un array del tamaño indicado
	 * 
	 *         con todas sus posiciones rellenas con "_" en caso contrario.
	 * 
	 */

	public static String[] generaTablero(byte tamaño) {

		if (tamaño < 5 || tamaño > 15) {

			return null;

		}

		String[] ret = new String[tamaño];

		for (byte i = 0; i < ret.length; i++) {

			ret[i] = "_";

		}

		return ret;

	}

	// Sortea una posición aleatoria del array (entre 0 y tablero.length-1).

	// Comprueba que en esa posición hay un "_". Si no es así, sortea otra vez

	// la posición las veces que haga falta hasta que el valor sorteado caiga en

	// una posición que contiene "_".

	// Una vez obtenida una posición válida, coloca el elemento en esa posición

	// sorteada del tablero

	public static byte colocaElemento(String[] tablero, char elemento) { // ☠

		Random r = new Random();

		byte posicion = (byte) r.nextInt(tablero.length);

		if (!tablero[posicion].equals("_")) {

			posicion = colocaElemento(tablero, elemento);

		} else {

			tablero[posicion] = "" + elemento;

		}

		return posicion;

	}

	public static String imprimeTablero(String[] tablero, String[] tumbas) {

		String ret = "| ";

		for (byte i = 0; i < tablero.length - 1; i++) {

			if (tablero[i].equals("_")) {

				ret += tumbas[i] + "\t";

			} else {

				ret += tablero[i] + "\t";

			}

		}

		ret +=

				(tablero[tablero.length - 1].equals("_") ?

						tumbas[tumbas.length - 1] :

						tablero[tablero.length - 1])

						+ (tablero.length > 11 ? " " : "") + " |\n| ";

		for (byte i = 0; i < tablero.length - 1; i++) {

			ret += i + "\t";

		}

		return ret + (tablero.length - 1) + (!tablero[tablero.length - 1].equals("_") ? " " : "")

				+ " |";

	}

}
