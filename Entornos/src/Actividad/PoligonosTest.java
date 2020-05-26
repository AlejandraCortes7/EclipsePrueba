package Actividad;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PoligonosTest {
	static Poligono poli;

	@BeforeClass
	public static void beforeclass() {
		
		poli = new Poligono();
		
	}
	@Test
	public void testCalcularAreaRectangulo() {
		 
		System.out.println("Calculamos el area del Rectngulo");
		double resultado = poli.calcular_area_rectangulo(8.2,5.4);// base * altura;
		double esperado= 44.28;
		assertEquals(esperado, resultado, 1);
		System.out.println("El area del rectangulo es: "+ esperado);
	}
	@Test
	public void testCalcularPerimetroRectangulo() {
		
		System.out.println("Calculamos el perimetro del rectangulo");
		double resultado = poli.calcular_perimetro_rectangulo(3.6,9.2);//2*base + 2*altura;
		double esperado= 25.6;
		assertEquals(esperado, resultado, 1);
		System.out.println("El perimetro del rectangulo es: "+ esperado);
	}
	@Test
	public void testCalcularAreaCirculo() {
		 
		System.out.println("Calculamos el area del circulo");
		double resultado = poli.calcular_area_circulo(8.2);// Math.PI*Math.pow(radio, 2)
		double esperado= 211.24;
		assertEquals(esperado, resultado, 1);
		System.out.println("El area del circulo es: "+ esperado);
	}
	
	@Test
	public void testCalcularAreaTringulo() {
		 
		System.out.println("Calculamos el area del tringulo ");
		int resultado = poli.calcular_area_triangulo(8, 9);// (base * altura)/2
		int esperado= 36;
		assertEquals(esperado, resultado, 1);
		System.out.println("El area del Tringulo es: "+ esperado);
	}
	
	

}
