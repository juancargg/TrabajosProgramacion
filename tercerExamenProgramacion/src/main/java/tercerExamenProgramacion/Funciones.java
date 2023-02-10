package tercerExamenProgramacion;
/**
 * Clase que contiene la unica funcion del examen, donde hacemos unaa funcion recursiva que cuenta los caracteres que no son letras de un string
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class Funciones {
/**
 * Funcion recursiva para contar los caracteres que no son letras de un string
 * @param frase String que le pasamos
 * @param i int que nos va a servir como contador para poner fin a la funcion recursiva cuando alcance el tamaño de la frase
 * @return le vamos a devolver un int que en este caso se llama contador con el numero de caracteres que ha contado gracias a los ifs
 */
	public static int cuentaNoLetras(String frase, int i) {
		int contador=0;
		
		if (i < frase.length()) {

			if ((frase.charAt(i) < 65 || frase.charAt(i) > 90) && (frase.charAt(i) < 97 || frase.charAt(i) > 122)) {
				contador++;
				return contador+=Funciones.cuentaNoLetras(frase, (i + 1));
				
				
			} else {
				return Funciones.cuentaNoLetras(frase, (i + 1));
			}
		}
		
		return contador;
	}
}
