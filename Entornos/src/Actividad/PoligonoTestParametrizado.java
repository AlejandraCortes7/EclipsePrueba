package Actividad;

import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Actividad.Poligono;
@RunWith( value = Parameterized.class)

public class PoligonoTestParametrizado {
	
	@Parameters
	public static Iterable <Object[]> getDatos(){
		ArrayList <Object[]> obj = new ArrayList<>();
		
		obj.add(new Object [] {8.2,5.4,44.8});
		obj.add(new Object [] {3.6,9.2,25.6});
		obj.add(new Object [] {8.2,211.24});
		obj.add(new Object [] {8,9,36});
		
		return obj;
	}
	
	private int baseint, alturaint;
	private double base, altura , radio, esperado;
	
	public PoligonoTestParametrizado(int baseint, int alturaint,double base, double altura, double radio, double esperado) {
		this.baseint = baseint;
		this.alturaint = alturaint;
		this.base = base;
		this.altura = altura;
		this.radio = radio;
		this.esperado = esperado;
	}
	static Poligono poli;
	
	@BeforeClass
	public static void beforeclass() {

		poli = new Poligono();
	}
	@Test
	public void testCalcularAreaRectangulo(double base, double altura, double esperado) {
		
		System.out.println("test AreaRectngulo");
		double resultado = poli.calcular_area_rectangulo(base,altura);
		assertEquals(esperado, resultado, 1);
	}
	@Test
	public void testCalcularPerimetroRectangulo(double base, double altura,double esperado) {
		 
		System.out.println("Calculamos el perimetro del rectangulo");
		double resultado = poli.calcular_perimetro_rectangulo(base, altura);//2*base + 2*altura;
		assertEquals(esperado, resultado, 1);
		System.out.println("El perimetro del rectangulo es: "+ esperado);
	}
	@Test
	public void testCalcularAreaCirculo() {
		 
		System.out.println("Calculamos el area del circulo");
		double resultado = poli.calcular_area_circulo( radio);// Math.PI*Math.pow(radio, 2)
		assertEquals(esperado, resultado, 1);
		System.out.println("El area del circulo es: "+ esperado);
	}
	
	@Test
	public void testCalcularAreaTringulo() {
		 
		System.out.println("Calculamos el area del tringulo ");
		int resultado = poli.calcular_area_triangulo(baseint, alturaint);// (base * altura)/2
		assertEquals(esperado, resultado, 1);
		System.out.println("El area del Tringulo es: "+ esperado);
	}

}
