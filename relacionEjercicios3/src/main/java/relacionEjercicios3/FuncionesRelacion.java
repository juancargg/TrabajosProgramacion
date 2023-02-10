package relacionEjercicios3;

import java.util.Random;
import java.util.Scanner;


public class FuncionesRelacion {
	static Scanner sc = new Scanner(System.in);

	public static String primera(String original, String substring) {
		String ret = "";

		if (original.contains(substring)) {
			ret = "El substring está presente";
		} else {
			ret = "El substring no está presente";
		}

		return ret;
	}

	public static short cuentaLetras(String cosa, char nose) {
		short j = 0;
		for (byte i = 0; i < cosa.length(); i++) {
			if (cosa.charAt(i) == nose) {
				j++;
			}
		}

		return j;
	}

	public static String dibujarBarcos(byte nBarcos) {
		String ret = "";
		String arriba1 = "      /|";
		String arriba2 = "      \\|";
		String abajo1 = "-------|-------";
		String abajo2 = "\\-------------/";
		for (byte i = 0; i < nBarcos; i++) {
			ret += arriba1 + "       ";
		}
		ret += "\n";
		for (byte j = 0; j < nBarcos; j++) {
			ret += arriba2 + "       ";
		}
		ret += "\n";
		for (byte k = 0; k < nBarcos; k++) {
			ret += abajo1;
		}
		ret += "\n";
		for (byte l = 0; l < nBarcos; l++) {
			ret += abajo2;
		}
		return ret;
	}

	public static short loQueQueda(String orig, String substring) {

		if (orig.indexOf(substring) == -1) {
			return -1;
		} else {
			int pos = orig.indexOf(substring) + substring.length();
			return (short) (orig.substring(pos).length());
		}
	}

	public static char simboloAzar() {
		char[] simbolo = { '#', '$', '€', '@', '&' };

		Random r = new Random();

		byte n = (byte) r.nextInt(simbolo.length);

		return simbolo[n];
	}

	public static String patadizarRefrán(String refran) {
		String ret = "";

		if ((refran.indexOf(",") == -1) || (refran.indexOf(",") != refran.lastIndexOf(","))) {
			return null;
		} else {
			ret = FuncionesRelacion.simboloAzar()
					+ refran.replace(refran.substring(refran.indexOf(",") + 1), " patada en los huevos")
					+ FuncionesRelacion.simboloAzar();
		}
		return ret;
	}

	public static byte descifrarQuiero(String codigo) {
		byte le = 0;
		char contador = 0;
		char letra='a';
		for (byte i = 0; i < 127; i++) {
			contador++;
			for(byte j=0; j<codigo.length();j++) {
				letra=(char) (codigo.charAt(i)+contador);
				codigo+=letra;
				if(codigo.contains("Quiero")) {
					le=i;
				}
			}
			
		}
		return le;
	}
	
	public static String ciframiento(String str, byte n) {
		String ret="";
		for(byte i=0; i<str.length();i++) {
			ret+=(char) (str.charAt(i)+3);
		}
		return ret; 
	}
	
	public static String cifrado(String texto, byte cifrado, byte i) {
		String codi="";
		if(i<texto.length()) {
			codi+=(char)(texto.charAt(i)+cifrado);
			codi+=FuncionesRelacion.cifrado(texto, cifrado, (byte)(i+1));
		}
		return codi;
	}
	
	public static byte ejerNueve(byte n) {
		System.out.println("dime un numero de 0 al " + n);
		byte nElegido=Byte.parseByte(sc.nextLine());
		
		if(nElegido>n) {
			FuncionesRelacion.ejerNueve(n);
		}else {
			System.out.println("ok");
		}
		return nElegido;	
	}
	
	
	public static String descodificar(String codificado) {
		return codificado.replace("-", "a").replace("@", "p").replace("%", "b");
	}
	
	public static String ejerDoce(String frase, int n) {
		String ret="";
			if((n<frase.length())&&(frase.charAt(n)=='a'||frase.charAt(n)=='e'||frase.charAt(n)=='i'||frase.charAt(n)=='o'||
					frase.charAt(n)=='u')) {
				System.out.println(frase.charAt(n));
				FuncionesRelacion.ejerDoce(frase, n+1);	
	}else if((n<frase.length())&&(frase.charAt(n)!='a'||frase.charAt(n)!='e'||frase.charAt(n)!='i'||frase.charAt(n)!='o'||
			frase.charAt(n)!='u')) {
		FuncionesRelacion.ejerDoce(frase, n+1);	
	}
	return ret;
	}
	
	public static byte ejerTrece(byte n) {
		System.out.println("Numero entre 1-50");
		n=Byte.parseByte(sc.nextLine());
		if(n<1||n>50) {
			FuncionesRelacion.ejerTrece(n);
		}
		return n;
	}
	
	
	public static String imprimeArray(char[] c) {
		String ret="";
		
		for(byte i=0; i<c.length; i++) {
			ret+= c[i]+" ";
		}
		return ret;
	}
	
	
	
	public static String otroArray(float[] n) {
		String ret="";
		
		for(byte i=0;i<n.length;i++) {
			ret+=n[i]+" ";
		}
		return ret;
	}
	
	public static String otroArrayStr(String[] s) {
		String ret="";
		
		for(byte i=0;i<s.length;i++) {
			ret+=s[i]+" ";
		}
		return ret;
	}
	
	public static String refranAzar() {
		Random r = new Random();

		String[] refranes = { "Al mal tiempo, buena cara", "A palabras necias, oidos sordos",
				"A buen entendedor, pocas palabras bastan", "Al que madruga, dios le ayuda",
				"Al que a buen arbol se arrima, buena sombra le cobija", "No por mucho madrugar, amanecerá temprano",
				"Personas que duermen en el mismo colchon, se vuelven de la misma condicion",
				"La vida es una lenteja, o la tomas o la dejas", "Pan para hoy, hambre para mañana",
				"Cuando acaba la partida, rey y peon duerme en la misma caja" };

		byte numero = (byte) r.nextInt(refranes.length);

		return refranes[numero];
	}
	

}
