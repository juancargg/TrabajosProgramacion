package pruebaMatrices;

import java.util.Random;

public class FuncionesMatrices {

	public static char[][] creaSopa(byte nf, byte nc){
		char[][] ret= new char[nf][nc];
		Random r=new Random();
		for(byte i=0; i<ret.length;i++) {
			for(byte j=0; j<ret[i].length;j++) {
				ret[i][j]=(char)r.nextInt('a',('z'+1));
			}
		}
		
		return ret;
	}
	 
	public static String imprimeMatriz(char[][]matriz) {
		String ret="";
		for(byte i=0; i<matriz.length;i++) {
			for(byte j=0; j<matriz[i].length;j++) {
				ret+=matriz[i][j]+" ";
			}
			ret+="\n";
		}
		return ret;
	}
	
	public static boolean insertaPalabra
	(char[][] matriz, String palabra, byte fil, byte col) {
		if(col+palabra.length()-1>matriz[fil].length) {
			for(byte i=0; i<palabra.length();i++) {
			matriz[fil][col+i]=palabra.charAt(i);
		}
			return true;
		}
		return false;
		
	}
	
	
	
}//
