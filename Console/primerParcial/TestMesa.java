package primerParcial;

import java.util.Scanner;

public class TestMesa {
	public static void main(String[] args) {
		
		CalcularCosto rec = new CalcularCosto();
		
		//costo.area(base, altura)
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Introduce la base del rectangulo:");
		rec.setBase(entrada.nextInt());
		System.out.println("Introduce la altura del rectangulo");
		rec.setAltura(entrada.nextInt());
	   
		System.out.println(rec+"Area: "+rec.area(rec.altura,rec.base)+" Costo: "+rec.costo(rec.altura,rec.base));
		
	}
}
