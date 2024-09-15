package curso_programacao;

public class Processamento_de_dados {
	
	public static void main (String[] args) {
		
		double  b, B, h, area;
		
		int y, z;
		double resultado;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		y = 5;
		z = 2;
		
		resultado =  (double) y / z; // casting
		
		System.out.println(resultado);
		
	}

}
