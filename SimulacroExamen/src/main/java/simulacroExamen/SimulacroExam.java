package simulacroExamen;

import java.util.Scanner;

public class SimulacroExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba su nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Genial, " + nombre + ". Ahora escribe tu año de nacimiento");
		short añoNacimiento = Short.parseShort(sc.nextLine());
	
		System.out.println("Wow, ¡UN DINOSAURIO! Es broma, no me suspendas...\n"
				+ " Por último dime tu peso(kg), por favor");
	
		float peso = Float.parseFloat(sc.nextLine());
	
		System.out.println("Hola " + nombre + ". Han pasado " + (2022-añoNacimiento) + " desde"
				+ " que naciste." );
		
		System.out.println("En " + (añoNacimiento+85) + " cumplirás 85 palos... ");
		
		float Jupiter = (float) (peso*2.5277f);
		float Venus = (float) (peso*0.9044f);
		float Urano = (float) (peso*0.8861f);
		float Marte = (float) (peso*0.3784f);
		float Mercurio = (float) (peso*0.3772f);
		float Saturno = (float) (peso*1.0645f);
		float Neptuno = (float) (peso*1.1369f);
		
		System.out.println("A continuación se te expondrá cual sería tu peso en cada uno de "
				+ "de los planetas: ");
		System.out.println("Tierra: " + peso + " Kg");
		System.out.println("Jupiter: " + Jupiter + " Kg");
		System.out.println("Venus: " + Venus + " Kg");
		System.out.println("Urano: " + Urano + " Kg");
		System.out.println("Marte: " + Marte + " Kg");
		System.out.println("Mercurio: " + Mercurio + " Kg");
		System.out.println("Saturno: " + Saturno + " Kg");
		System.out.println("Neptuno: " + Neptuno + " Kg");
		
		boolean raro = (Mercurio + Venus > Marte)||(Jupiter > peso + Marte);
		System.out.println("Es cierto la afirmación de Miguel? " + raro);
		
		
		
		
		
		

	}

}
