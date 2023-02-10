package actividadYoutube;

import java.util.Scanner;

public class ActividadYoutube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char nuevoCanal;
		String nombreCanal;
		long suscriptores;
		short añoCreacion;
		short numeroVideos;
		short tiempoVideo;
		long suscriptoresTotales = 0;
		int canalesTotales = 0;
		boolean canalGrande = false;
		
		do {
			System.out.println("Escriba el nombre de su canal de Youtube");

			nombreCanal = sc.nextLine();

			System.out.println("Genial, escriba el número de suscriptores que tiene");

			suscriptores = Integer.parseInt(sc.nextLine());
			
			if(suscriptores >= 1000) {
				canalGrande=true;
			}

			/* System.out.println("Wow, vas camino del estrellato! En qué año creaste el canal?");

			 
			añoCreacion = Short.parseShort(sc.nextLine());

			System.out.println("Muy bien! y cuántos videos tienes subidos?");
			 
			numeroVideos = Short.parseShort(sc.nextLine());

			System.out.println(
					"Asombroso! Cuánto suelen durar tus vídeos? En minutos y pon un número entero sin decimales");
			 
			tiempoVideo = Short.parseShort(sc.nextLine());
			*/
			canalesTotales++;

			System.out.println("Gracias por su colaboración :)\n"
					+ "¿Quiere añadir otro canal? Ponga \"S\" para sí o \"N\" para no ");

			suscriptoresTotales = suscriptoresTotales + suscriptores;
			
			nuevoCanal = sc.nextLine().charAt(0);//esto es para que me coja el primer caracter que meta

		} while (nuevoCanal == 's' || nuevoCanal == 'S');

		float mediaSuscriptores = suscriptoresTotales*(1f)/canalesTotales*(1f);
		
		System.out.println("La media de los canales es: " + mediaSuscriptores);
		
		boolean esTrue = (suscriptoresTotales>1000000);
		
		System.out.println("Es cierto la afirmación de Miguel?" + esTrue );
		
		System.out.println("Hay un canal con 1.000 subs o mas?" + canalGrande );
		
		
	}

}
