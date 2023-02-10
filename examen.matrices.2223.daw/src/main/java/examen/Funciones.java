package examen;
import java.util.Random;
/***
 *  Clase donde recogemos las funciones que son usadas en el main. Entre ellas encontramos funcion para imprimir arrays, intercambiar posiciones, dar posiciones aleatorias, buscar elementos dentro de un array y mover un elemento dentro del array.
 * @author Juan Carlos Gomez
 *
 */
public class Funciones {
	/***
	 * Funcion que imprime un array, en este caso imprimimos la distribucion de la clase, tanto con iconos como con nombres
	 * @param iconos Array bidimensional de string donde se encuentra la distribucion de la calse con iconos
	 * @param nombres Array bidimensional de string donde se encuentra la distribucion de la calse con los nombres
	 * @return Devuelve un string con los iconos y los nombres
	 */
	public static String imprimeAula(String[][] iconos,String[][] nombres) {
		String ret="";
		for(byte i=0;i<iconos.length;i++) {
			for(byte j=0;j<iconos[i].length;j++) {
				ret+=iconos[i][j];
			}
			ret+="\t---->\t";
			for(byte j=0;j<nombres[i].length;j++) {
				ret+=nombres[i][j]+(nombres[i][j].equals("|  ")||nombres[i][j].equals("|🐴")?"":"\t");
			}
			ret+="\n";
		}
		return ret;
	}
	
	/***
	 * Funcion que sirve para intercambiar posiciones dentro de un array
	 * @param matriz Array bidimensional de string, podemos meter tanto la matriz con los nombres como con los iconos
	 * @param fila1 byte con la fila que queramos
	 * @param columna1 byte con la columna que queramos
	 * @param fila2 byte con la fila que queramos
	 * @param columna2 byte con la columna que queramos
	 */
	public static void intercambiarPosiciones(String matriz[][], byte fila1, byte columna1, byte fila2, byte columna2){
		String copia[][]=new String[matriz.length][matriz.length];
		for(byte i=0; i<matriz.length;i++) {
			for(byte j=0;j<matriz[i].length;j++) {
				copia[i][j]=matriz[i][j];
			}
		}
		
		System.out.println("prueba: "+ matriz[fila1][columna1]);
		matriz[fila1][columna1]=copia[fila2][columna2];
		matriz[fila2][columna2]=copia[fila1][columna1];
		
	}
	
	/***
	 * Funcion que nos devuelve dos numeros aleatorios en forma de string y separados por coma
	 * @param tamañoFilas byte con el tamaño que queramos 
	 * @param tamañoColumnas byte con el tamaño que queramos
	 * @return devuelve dos numeros aleatorios en forma de string y separados por coma
	 */
	public static String posicionAleatoriaMatriz(byte tamañoFilas, byte tamañoColumnas) {
		Random r=new Random();
		byte fila=(byte) r.nextInt(0, tamañoFilas-1);
		byte columna= (byte) r.nextInt(0, tamañoColumnas-1);
		String ret=fila+", "+columna;
		return ret;
	}
	
	
	/***
	 * Funcion que guarda en un string el resultado de usar la funcion posicionAleatoriaMatriz y quedandose solo con la parte de la coma hacia delante
	 * @param iconos array bidimensional con la distribucion de la clase con iconos
	 * @param nombres array bidimensional con la distribucion de la clase con nombres
	 * @param veces es un byte que representa el numero de veces que queremos que se repita esta operacion 
	 */
	public static void intercambiarAlumnos(String[][] iconos,String[][] nombres, byte veces) {
		for(byte i=0; i<veces;i++) {
			String[] resultado=Funciones.posicionAleatoriaMatriz((byte)iconos.length, (byte)iconos[i].length).split(",");
		}
	}
	 /***
	  * Funcion que busca el elemento del caballo 
	  * @param matriz array bidimensional. podemos usar cualquiera de las dos matrices principales del programa
	  * @return byte con el numero de la fila donde se encuentra, o -1 en caso  de no encontrarlo
	  */
	public static byte buscarCaballo(String matriz[][]) {
		
		for(byte i=0; i<matriz.length;i++) {
			for(byte j=0; j<matriz[i].length;j++) {
			if(matriz[i][j]=="🐴") {
				return i;
				}
			}
		}
		return -1;
	}
	
	public static boolean moverCaballo(String[][] iconos,String[][] nombres, byte direccion) {
		byte posCaballo=Funciones.buscarCaballo(nombres);
		if(direccion==1) {
			Funciones.intercambiarPosiciones(nombres, (byte)posCaballo, (byte)2, (byte)(posCaballo+1), (byte)2);
			Funciones.intercambiarPosiciones(iconos, (byte)posCaballo, (byte)2, (byte)(posCaballo+1), (byte)2);
		}else if(direccion==-1) {
			Funciones.intercambiarPosiciones(nombres, (byte)posCaballo, (byte)2, (byte)(posCaballo-1), (byte)2);
			Funciones.intercambiarPosiciones(iconos, (byte)posCaballo, (byte)2, (byte)(posCaballo-1), (byte)2);
		}else {
			Funciones.moverCaballo(iconos, nombres, direccion);
		}
		
		if((iconos[0][2]=="🐴")||(iconos[iconos.length-1][2]=="🐴")) {
			return true;
		}
		return false;
	}
	
}//
