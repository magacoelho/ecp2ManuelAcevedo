package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    DecimalCollection  dc;
    
    @Before
    public void before() {
        dc = new DecimalCollection();
     
    }
	@Test
	public void testDecimalCollection() {
		//assertNotNull(dc.);
	   assertEquals(dc.size(), 0);
	}

	@Test
	public void testAdd() {
		dc.add(0.4);
		assertEquals(dc.size(), 1);
	}

	@Test
	public void testSize() {
		dc.add(0.2);
		dc.add(0.3);
		assertEquals(2,dc.size());
	}

	@Test
	public void testSum() {
		dc.add(0.2);
		dc.add(0.3);
		assertEquals( 0.5, dc.sum(), 10e-5);
	}

	@Test
	public void testHigher() {
		dc.add(0.9);
		dc.add(0.1);
		assertEquals(0.9, dc.higher(), 10e-5);
	}
	
	@Test
	public void menorColeccion() {
		DecimalCollection dc2 = new DecimalCollection();
		dc2.add(1.5);
		dc2.add(0.5);
		dc2.add(3.1);
		assertEquals(0.5, dc2.menorColeccion(), 10e-5);
	}

	
}
