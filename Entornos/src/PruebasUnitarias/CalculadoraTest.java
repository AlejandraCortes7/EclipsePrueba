package PruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeClass");
		calc = new Calculadora();
	}
	@AfterClass
	
	public static void afterClass() { //Necesita ser Static
		System.out.println("afterClass");
		calc = new Calculadora();	
	}
	
	@Before
	public void before() {
		System.out.println("metodo before");
		//calc = new Calculadora();
	}
	
	@After  
	public void After() {
		System.out.println("metodo after");
		calc.clear();
	}
	
	@Test
	public void testSuma() {
	 
		//Calculadora calc = new Calculadora();
		System.out.println("test sumar");
		int resultado = calc.sumar(10, 5);
		int esperado = 15; // 10 + 5 = 15
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		
		//Calculadora calc = new Calculadora();
		System.out.println("test restar");
		int resultado = calc.restar(24, 5);
		int esperado = 19; // 24 - 5 = 19
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDivision(){//division sin errores
		System.out.println("testDivision");
		int resultado = calc.dividir(5,2);
		int esperado = 2;
		assertEquals(esperado, resultado);
		
	}
	@Test(expected = ArithmeticException.class)
	public void testDivision2(){
		System.out.println("testDivision2");
		int resultado = calc.dividir(5,0);
		
		
	}
	@Test (timeout = 3000 )
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
	
	
}
