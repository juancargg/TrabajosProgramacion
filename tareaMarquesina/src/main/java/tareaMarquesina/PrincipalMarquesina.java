package tareaMarquesina;
/***
 * Se ha creado el programa para simular la accion de una marquesina, donde las letras van pasando
 * de izquierda a derecha 
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class PrincipalMarquesina {
/***
 * Funcion que recoge el main
 * @param args no se introduce ningun parametro por args 
 */
	public static void main(String[] args) {
		char [] marquesina=new char [12];
		String mensaje="Mira cómo mola esto, una marquesina!";

		for(byte i=0; i<mensaje.length();i++) {
			for(byte j=0; j<marquesina.length-1;j++) {
				marquesina[j]=marquesina[j+1];
			}
			marquesina[marquesina.length-1]=mensaje.charAt(i);
			System.out.print(FuncionesMarquesina.imprimeArray(marquesina)+"\n");
			
		}
		
		
		
		
		
	}//

}
