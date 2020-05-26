package Bibloteca;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (value = Suite.class)
@Suite.SuiteClasses(
		{
			biblotecaCodigoTest.class,
			biblotecaTituloTest.class,
			biblotecaAutorTest.class,
			bibliotecaTest.class,
			
		})

public class suiteBibloteca {

}
