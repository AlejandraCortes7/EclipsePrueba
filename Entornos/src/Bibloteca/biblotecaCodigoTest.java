package Bibloteca;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class biblotecaCodigoTest {

static ValidarDatos vd;
	
	@BeforeClass
	public static void iniciarObjeto()
	{
		vd = new ValidarDatos("CL01", "Odisea", "Homero");
	}
	@Test
	public void validarCodigo()
	{
		System.out.println("Prueba de validar código");
		boolean esperado=true;
		boolean resultado = vd.ValidarCodigoCorrecto();
		assertEquals(esperado, resultado);
		
	}
	
}
