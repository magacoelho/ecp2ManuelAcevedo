package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	 private  Fraction fr;
	  @Before
	  public void before() {
	        fr = new Fraction(2, 3);
	    }
	  @Test
	  public void testFractionIntInt(){
		    assertEquals(2,fr.getNumerator());
	        assertEquals(3, fr.getDenominator());
		  
	  }
	  
	  @Test
	  public void testFraction(){
		  fr= new Fraction();
		  assertEquals(1, fr.getNumerator());
		  assertEquals(1, fr.getDenominator());
	  }
	  @Test
	  public void testDecimal() {
		    assertEquals(0.6666666666666667,fr.decimal(), 10e-10);
		}
	  
	  @Test
	  public void testIsEquivalente(){
		  assertTrue(fr.isEquivalente(new Fraction(1,2), new Fraction(2,4)));
	  }

}
