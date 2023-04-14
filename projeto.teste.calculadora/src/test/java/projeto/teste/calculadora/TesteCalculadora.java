package projeto.teste.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TesteCalculadora {
	
	

	  @Test
	  public void testSoma() {
	    assertEquals(4, Calculadora.soma(2, 2));
	    assertEquals(-3, Calculadora.soma(-1, -2));
	  }

	  @Test
	  public void testSubtrai() {
	    assertEquals(1, Calculadora.subtrai(3, 2));
	    assertEquals(-5, Calculadora.subtrai(-3, 2));
	  }

	  @Test
	  public void testMultiplica() {
	    assertEquals(6, Calculadora.multiplica(2, 3));
	    assertEquals(-6, Calculadora.multiplica(2, -3));
	  }

	  @Test
	  public void testDivide() {
	    assertEquals(2, Calculadora.divide(4, 2));
	    assertEquals(-2, Calculadora.divide(4, -2));
	    assertThrows(IllegalArgumentException.class, () -> Calculadora.divide(4, 0));
	  }
	}



