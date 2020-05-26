package PruebasUnitarias;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith( value = Parameterized.class)

public class CalculadoraParametrizadaTest {
	
	@Parameters
	public static Iterable <Object[]> getDatos(){
		ArrayList <Object[]> obj = new ArrayList<>();
		
		obj.add(new Object [] {3,1,4});
		obj.add(new Object [] {5,7,12});
		obj.add(new Object [] {-3,-5,-8});
		obj.add(new Object [] {8,9,17});
		return obj;
	}
	
	private int a, b , esperado;
	
	public CalculadoraParametrizadaTest(int a, int b, int esperado) {
		this.a = a;
		this.b = b;
		this.esperado = esperado;
	}
	
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar( a , b);// 5, 10   
		assertEquals(esperado, resultado); 	
	}

}
