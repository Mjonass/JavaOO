package matematica;

public class Retangulo {
	private static double ladoH;
	private static double ladoV;
	
	public static double getLadoH() {
		return ladoH;
	}

	public static void setLadoH(double ladoH) {
		Retangulo.ladoH = ladoH;
	}

	public static double getLadoV() {
		return ladoV;
	}

	public static void setLadoV(double ladoV) {
		Retangulo.ladoV = ladoV;
	}

	public static void definirLados(double ladoH, double ladoV) {
		setLadoV(ladoV);
		setLadoH(ladoH);
	}
	
	public static double area() {
		return getLadoV() * getLadoH();
	}
	
	public static double perimetro() {
		return (getLadoV()*2) + (getLadoH()*2);
	}
}
