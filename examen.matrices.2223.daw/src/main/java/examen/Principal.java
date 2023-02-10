package examen;

import java.util.Scanner;
/***
 * Primer examen del segundo trimestre donde practicamos matrices 
 * @author Juan Carlos Gomez
 *
 */
public class Principal {
/*** 
 * Clase donde se recoge el main del programa
 * @param args tiene dos valores que podrian haber sido usados pero no me ha dado tiempo
 */
	public static void main(String[] args) {
		// 👨 👩 🐴 🐹 Θ θ ϴ ෴ ෴ ◓
		Scanner sc=new Scanner(System.in);
		System.out.println("Situación inicial: ");
		String[][] iconosAula= {{"--","--","|  "," |","--","--"},
								{"--","👨","|  "," |","--","👨"},
								{"👨","👨","|  "," |","◓ ","◓ "},
								{"👨","👨","|  "," |","👨","👨"},
								{"👨","👨","|  "," |","👨","👨"},
								{"👨","--","|  "," |","👩","👩"},
								{"--","--","|🐴"," |","--","👨"},
								{"🖥","🗔","|  "," |"," "," "},
								{"🪑","⊡ ","|  "," |"," "," "}};
		String[][] nombresAula= {{"-","-","|  "," |","-","-"},
								 {"-","Cosmin","|  "," |","-","Alberto"},
								 {"Darío","José H","|  "," |","Irene","Naomi"},
								 {"Borja","Javi","|  "," |","José G","Nico"},
								 {"Sergio","CarlosC","|  "," |","Mario","Ricardo"},
								 {"CarlosR","-","|  "," |","Mónica","Mar"},
								 {"-","-","|🐴"," |","-","Alex. T"},
									{"🖥","🗔","|  "," |"," "," "},
									{"🪑","⊡ ","|  "," |"," "," "}};
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		Funciones.intercambiarPosiciones(nombresAula, (byte)2, (byte)0, (byte)1, (byte)0);
		Funciones.intercambiarPosiciones(iconosAula, (byte)2, (byte)0, (byte)1, (byte)0);
		
		System.out.println("Cambios: \n" +Funciones.imprimeAula(iconosAula, nombresAula));
	
		System.out.println(Funciones.posicionAleatoriaMatriz((byte)5, (byte)11));
		
		System.out.println(Funciones.buscarCaballo(iconosAula));
		
		System.out.println("Dime cuántos cambios quieres que haga el caballo");
		
		byte nCambios=Byte.parseByte(sc.nextLine());
		Funciones.intercambiarAlumnos(iconosAula, nombresAula, nCambios);
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		
		
	}
	
} 
