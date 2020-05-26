package PruebasUnitarias;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({//Hacer llamados a los hilos
	CalculadoraTest.class,
	CalculadoraParametrizadaTest.class,
	AssertTest.class

})
public class miSuite {
}
