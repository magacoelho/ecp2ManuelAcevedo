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
	  public void testDdecimal() {
		    assertEquals(0.6666666666666667,fr.decimal(), 0.01);
		}

}
