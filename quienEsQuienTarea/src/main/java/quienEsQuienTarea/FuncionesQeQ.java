package quienEsQuienTarea;
/***
 * Aqui encontramos las funciones del programa
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class FuncionesQeQ {
/***
 * Esta funcion sirve para buscar los personajes con las caracteristicas que queremos. Si la tiene guarda su nombre en un String, si no la tiene iguala el nombre a "Null"
 * @param personas array con todas las caracteristicas de cada personaje
 * @param nombres array con los nombres de todos los personajes
 * @param caract String que mete el usuario por teclado. Hace referencia a una caracteristica que esta buscando 
 * @return Devuelve un String con todos los nombres de los personajes (separados por "," y un espacio) que si tienen la caracteristica que el usuario ha pedido
 */
	static public String buscaCaracteristicaSi(String[] personas, String[] nombres, String caract) {
		String ret="";
		for(byte i=0;i<personas.length;i++) {
			if(personas[i].contains(caract)) {
				ret+=nombres[i]+", ";
			}else {
				nombres[i]=null;
			}
		}
		
		return ret;
	}
/***
 * Esta funcion sirve para buscar los personajes que no tienen la caracteristica que queremos. Si no la tiene guarda su nombre en un String, si la tiene iguala el nombre a "Null"
 * @param personas array con todas las caracteristicas de cada personaje
 * @param nombres array con los nombres de todos los personajes
 * @param caract String que mete el usuario por teclado. Hace referencia a una caracteristica que no quiere que tenga el personaje 
 * @return Devuelve un String con todos los nombres de los personajes (separados por "," y un espacio) que no tienen la caracteristica que el usuario ha pedido
 */
	static public String buscaCaracteristicaNo(String[] personas, String[] nombres, String caract) {
		String ret="";
		for(byte i=0;i<personas.length;i++) {
			if(personas[i].contains(caract)) {
				nombres[i]=null;
				
			}else {
				ret+=nombres[i]+", ";
			}
		}
		
		return ret;
	}

	/***
	 * Funcion que sirve para mostrar los nombres de los persoanjes que pueden seguir jugando, separados por "," y un espacio. Si el nombre es igual a NULL lo ignora. 
	 * @param nombres array con todos los nombres de los personajes
	 * @return devuelve un String con todos los nombres diferentes a null. Se ha usado substring para ignorar la "," y un espacio. Al final se le ha añadido un punto
	 */
	static public String presentacionNombres(String[]nombres) {
		String ret="";
		for(byte i=0;i<nombres.length;i++) {
			if(nombres[i]!=null) {
				ret+=nombres[i]+", ";
			}
		}
		return ret.substring(0, ret.length()-2)+".";
	}
	
	
}//
