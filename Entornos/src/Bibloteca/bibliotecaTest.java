package Bibloteca;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class bibliotecaTest {

	static ValidarDatos vd;
	
	@BeforeClass
	public static void iniciarObjeto()
	{
		vd = new ValidarDatos("CL01", "Odisea", "Homero");
	}
	
	
	@Test
	public void validarRegistrarLibro()
	{
		System.out.println("Prueba de registrar libro");
		String esperado = "Registro correcto";
		String resultado=vd.RegistrarLibro();
		assertEquals(esperado, resultado);
	}
	
	

}