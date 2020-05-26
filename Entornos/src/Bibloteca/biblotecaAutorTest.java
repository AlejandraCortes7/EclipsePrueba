package Bibloteca;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class biblotecaAutorTest {

	static ValidarDatos vd;

	@BeforeClass
	public static void iniciarObjeto()
	{
		vd = new ValidarDatos("CL01", "Odisea", "Homero");
	}
	
	@Test
	public void validarAutor()
	{
		System.out.println("Prueba de validar autor");
		boolean esperado=true;
		boolean resultado = vd.ValidarAutorCorrecto();
		assertEquals(esperado, resultado);
		
	}
}
