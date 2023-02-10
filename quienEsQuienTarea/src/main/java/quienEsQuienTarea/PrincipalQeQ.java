package quienEsQuienTarea;

import java.util.Scanner;
/***
 * Se ha realizado el juego de quien es quien, donde primero elegimos si buscamos que 
 * el personaje tenga una caracteristica o no, despues decidimos la caracteristica que estamos 
 * buscando que tenga (o que no tenga) el personaje, y por ultimo, eliminamos los personajes que 
 * cuadren (o que no cuadren) con la descripcion. Solo puede quedar un personaje.  
 * @author Juan Carlos Gomez Gutierrez
 *
 */
public class PrincipalQeQ {
/***
 * Clase donde se encuentra el main del programa
 * @param args De momento no se ha introducido ningun parametro por args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String marta = ("gafas|sombrero|mujer|pelorubio|ojosmarrones");
		String andres = ("barba|hombre|pelomoreno|ojosverdes");
		String sofia = ("collar|mujer|pelomoreno|ojosverdes");
		String samuel = ("gafas|hombre|sombrero|pelorubio|ojosmarrones");
		String laura = ("gafas|collar|mujer|pelomoreno|ojosverdes");
		String anselmo = ("hombre|gafas|barba|pelorubio|ojosazules");
		String elvira = ("mujer|collar|sombrero|pelomoreno|ojosazules");

		String[] caracteristicas = { marta, andres, sofia, samuel, laura, anselmo, elvira };
		String[] nombres = { "Marta", "Andrés", "Sofía", "Samuel", "Laura", "Anselmo", "Elvira" };
		char decision;
		String caract;
		byte contador = 7;

		System.out.println("La persona que buscas puede ser: " + FuncionesQeQ.presentacionNombres(nombres));

		while (contador > 1) { //el contador es para ver cuantos personajes son NULL, si son menor que uno significa que ya no quedan personajes
			contador = 7;
			for (byte i = 0; i < nombres.length; i++) {
				if (nombres[i] == null) {
					contador = (byte) (contador - 1);
				}
			}
			if (contador < 1) {
				System.out.println("No hay personajes con esas caracteristicas");
			} else if (contador == 1) {
				System.out.println("Siiiiii! El personaje era: " + FuncionesQeQ.presentacionNombres(nombres));
			} else {

				do {
					System.out.println("La característica que vas a indicar, ¿quieres que la tenga o que no?(Si/No)");
					decision = sc.nextLine().toLowerCase().charAt(0);
				} while (decision != 's' && decision != 'n');

				if (decision == 's') {
					do{
						System.out.println("¿Qué característica buscas?");
						caract = sc.nextLine().toLowerCase();
					}while((!caract.equals("gafas"))&&(!caract.equals("sombrero"))
							&&(!caract.equals("mujer"))&&(!caract.equals("pelorubio"))
							&&(!caract.equals("ojosmarrones"))&&(!caract.equals("ojosazules"))
							&&(!caract.equals("barba"))&&(!caract.equals("hombre"))
							&&(!caract.equals("pelomoreno"))&&(!caract.equals("ojosverdes"))
							&&(!caract.equals("collar")));
					
					FuncionesQeQ.buscaCaracteristicaSi(caracteristicas, nombres, caract);
					System.out.println("La persona que buscas puede ser: " + FuncionesQeQ.presentacionNombres(nombres));
				} else {
					do{
						System.out.println("¿Qué característica quieres que no tenga?");
						caract = sc.nextLine().toLowerCase();
					}while((!caract.equals("gafas"))&&(!caract.equals("sombrero"))
							&&(!caract.equals("mujer"))&&(!caract.equals("pelorubio"))
							&&(!caract.equals("ojosmarrones"))&&(!caract.equals("ojosazules"))
							&&(!caract.equals("barba"))&&(!caract.equals("hombre"))
							&&(!caract.equals("pelomoreno"))&&(!caract.equals("ojosverdes"))
							&&(!caract.equals("collar")));
					FuncionesQeQ.buscaCaracteristicaNo(caracteristicas, nombres, caract);
					System.out.println("La persona que buscas puede ser: " + FuncionesQeQ.presentacionNombres(nombres));
				}
			}
		}

	}//

}



