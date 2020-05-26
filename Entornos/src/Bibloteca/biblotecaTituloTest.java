package Bibloteca;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class biblotecaTituloTest {

static ValidarDatos vd;
	
	@BeforeClass
	public static void iniciarObjeto()
	{
		vd = new ValidarDatos("CL01", "Odisea", "Homero");
	}
	
	
	@Test
	public void validarTitulo()
	{
		System.out.println("Prueba de validar título");
		boolean esperado=true;
		boolean resultado = vd.ValidarTituloCorrecto();
		assertEquals(esperado, resultado);
		
	}
	

}
