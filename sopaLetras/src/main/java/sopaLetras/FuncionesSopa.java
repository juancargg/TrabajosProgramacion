package sopaLetras;

import java.util.Random;

public class FuncionesSopa {

	public static char[][] creaSopa(byte nf, byte nc) {
		Random r = new Random();

		char[][] ret = new char[nf][nc];
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = (char) r.nextInt('a', ('z' + 1));
			}
		}
		return ret;
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}

	public static boolean insertaPalabra(char[][] matriz, String palabra, byte fil, byte col, byte direccion,
			boolean[][] matrizBoo) {

			// de izquierda a derecha
		if (direccion == 0) {
			for(byte i=0;i<palabra.length();i++) {
				if(matrizBoo[fil][col+i]==true&&matriz[fil][col+i]!=palabra.charAt(i)) {
					return false;	
				}	
			}
			if (col + palabra.length() - 1 < matriz[fil].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil][col + i] = palabra.charAt(i);
					matrizBoo[fil][col + i] = true;
				}
				return true;
				}
			}

			// de derecha a izquierda
			if (direccion == 1) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil][col-i]==true&&matriz[fil][col-i]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if (col - palabra.length() + 1 >= 0) {
					for (byte i = (byte) ((byte) palabra.length() - 1); i >= 0; i--) {
						matriz[fil][col - i] = palabra.charAt(i);
						matrizBoo[fil][col - i] = true;
					}
					return true;
				}
			}

			// de abajo a arriba
			if (direccion == 2) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil-i][col]==true&&matriz[fil-i][col]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if (fil - palabra.length() + 1 >= 0) {
					for (byte i = (byte) ((byte) palabra.length() - 1); i >= 0; i--) {
						matriz[fil - i][col] = palabra.charAt(i);
						matrizBoo[fil - i][col] = true;
					}
					return true;
				}
			}

			// de arriba a abajo
			if (direccion == 3) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil+i][col]==true&&matriz[fil+i][col]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if (fil + palabra.length() - 1 < matriz[col].length) {
					for (byte i = 0; i < palabra.length(); i++) {
						matriz[fil + i][col] = palabra.charAt(i);
						matrizBoo[fil + i][col] = true;
					}
					return true;
				}
			}

			// diagonal arriba derecha
			if (direccion == 4) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil-i][col+i]==true&&matriz[fil-i][col+i]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if ((col + palabra.length() - 1 < matriz[fil].length) && (fil - palabra.length() + 1 >= 0)) {
					for (byte i = 0; i < palabra.length(); i++) {
						matriz[fil - i][col + i] = palabra.charAt(i);
						matrizBoo[fil - i][col + i] = true;
					}
					return true;
				}
			}

			// diagonal arriba izquierda
			if (direccion == 5) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil-i][col-i]==true&&matriz[fil-i][col-i]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if ((col - palabra.length() + 1 >= 0) && (fil - palabra.length() + 1 >= 0)) {
					for (byte i = 0; i < palabra.length(); i++) {
						matriz[fil - i][col - i] = palabra.charAt(i);
						matrizBoo[fil - i][col - i] = true;
					}
					return true;
				}
			}

			// diagonal abajo derecha
			if (direccion == 6) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil+i][col+i]==true&&matriz[fil+i][col+i]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if ((col + palabra.length() - 1 < matriz[fil].length)
						&& (fil + palabra.length() - 1 < matriz[col].length)) {
					for (byte i = 0; i < palabra.length(); i++) {
						matriz[fil + i][col + i] = palabra.charAt(i);
						matrizBoo[fil + i][col + i] = true;
					}
					return true;
				}
			}

			// diagonal abajo izquierda
			if (direccion == 7) {
				for(byte i=0;i<palabra.length();i++) {
					if(matrizBoo[fil+i][col-i]==true&&matriz[fil+i][col-i]!=palabra.charAt(i)) {
						return false;	
					}	
				}
				if ((col - palabra.length() + 1 >= 0) && (fil + palabra.length() - 1 < matriz[col].length)) {
					for (byte i = 0; i < palabra.length(); i++) {
						matriz[fil + i][col - i] = palabra.charAt(i);
						matrizBoo[fil + i][col - i] = true;
					}
					return true;
				}
			}
			
		return false;

	}

	public static boolean[][] sopaBooleana(byte nf, byte nc) {
		boolean[][] ret = new boolean[nf][nc];
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = false;
			}
		}
		return ret;
	}

	public static String imprimeMatriz(boolean[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}
	
	public static String menuDireccion() {
		String ret="Dime la direccion en la que quieres colocar la palabra: \n"
				+ "\t 0-> la palabra se insertará en horizontal hacia adelante\n"
				+ "\t 1-> la palabra se insertará en horizontal hacia atrás\n"
				+ "\t 2-> la palabra se insertará en vertical hacia arriba\n"
				+ "\t 3-> la palabra se insertará en vertical hacia abajo\n"
				+ "\t 4-> la palabra se insertará en diagonal hacia arriba a la derecha\n"
				+ "\t 5-> la palabra se insertará en diagonal hacia arriba a la izquierda\n"
				+ "\t 6-> la palabra se insertará en diagonal hacia abajo a la derecha\n"
				+ "\t 7-> la palabra se insertará en diagonal hacia abajo a la izquierda";
		return ret;
	}

}//
