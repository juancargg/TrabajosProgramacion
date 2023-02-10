package ejercicio8Tamagochi;

public class Funciones {
	public static String imprimirMenu(){
		byte raza=50;
		byte nombre=50;
		byte contador=0;
		byte hambre=50;
		byte sueño=50;
		byte diversion=50;
		byte higiene=50;
		
		return "El " + raza + " " + nombre 
				+"\n Quedan " + (20-contador) + " \"dias\" para que " + nombre + " muera de viejito." 
				+ "\n________________________"
				+ "\n Hambre - " + hambre
				+ "\n Sueño - " + sueño
				+ "\n Diversión - " + diversion
				+ "\n Higiene - "  + higiene
				+"\n________________________"
				+ "\n ELIGE UNA OPCIÓN:"
				+ "\n\t1 - Comer. "
				+ "\n\t2 - Dormir. "
				+ "\n\t3 - Jugar. "
				+ "\n\t4 - Limpiar"
				+ "\n\t5 - Matar al pequeño " + nombre;
	}
}
