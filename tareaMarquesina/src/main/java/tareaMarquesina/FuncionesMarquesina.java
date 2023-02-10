package tareaMarquesina;
/***
 * Clase que recoge la unica funcion del programa
 * @author Juan Carlos Gomez Guiterrez
 *
 */
public class FuncionesMarquesina {
/***
 * Esta funcion se usa para convertir un array en un string y asi poder imprimirlo por pantalla
 * @param caracter array de char por el que entra cada caracter del array y se concatena en un string
 * @return String con todos los caracteres del array concatenados. Al principio y al final se les ha añadido "|"
 */
	public static String imprimeArray(char[]caracter) {
		String ret="|";
		for(char elemento :caracter) {
			ret+=elemento;
		}
		return ret+"|";
	}
}
