package actividad.juegos.matematicos;

import java.util.Scanner;

public class TareaJuegosMatematicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//PARTE 1		

		System.out.println("Dime un número");
		int numeroBase = Integer.parseInt(sc.next());

		System.out.println(numeroBase * 3);
		int resultado = numeroBase * 3;

		System.out.println(resultado + 6);
		resultado = resultado + 6;

		System.out.println(resultado / 3);
		resultado = resultado / 3;

		System.out.println(resultado - numeroBase);
		resultado = resultado - numeroBase;

		boolean rFinal = resultado == 2;
		System.out.println("¿El resultado es 2? " + rFinal);

//PARTE 2		

		System.out.println("Dime tu fecha de nacimiento");
		short fechaNacimiento = Short.parseShort(sc.next());
		boolean esPar = fechaNacimiento % 2 == 0 || fechaNacimiento < 1992;
		System.out.println("¿Es un año par o tiene más de 30 años? " + esPar);

//PARTE 3		

		System.out.println("Dime tu talla de pie");
		byte talla = Byte.parseByte(sc.next());

		System.out.println(talla * 5);
		short resultadoTalla = (short) (talla * 5);

		System.out.println(resultadoTalla + 50);
		resultadoTalla = (short) (resultadoTalla + 50);

		System.out.println(resultadoTalla * 20);
		resultadoTalla = (short)(resultadoTalla * 20);

		System.out.println(resultadoTalla + 1022);
		resultadoTalla = (short) (resultadoTalla + 1022);

		System.out.println(resultadoTalla - fechaNacimiento);
		short resultadoF = (short) (resultadoTalla - fechaNacimiento);

		boolean parteFinal = (resultadoF / 1000 > 1 & resultadoF / 10000 < 1) && (resultadoF / 100 == talla)
				&& (resultadoF % 100 == (2022 - fechaNacimiento));
		System.out.println("¿Ocurren todas las condiciones? " + parteFinal);
	}

}
