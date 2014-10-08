package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
     private User user;
     @Before
	  public void before() {
	        user = new User(1,"MANUEL", "ACEVEDO");
	    }
	@Test
	public void testUser() {
	
		assertEquals(1, user.getNumber());
		assertEquals("Manuel", user.getName());
		assertEquals("Acevedo", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		
		assertEquals("Manuel Acevedo", user.fullName());
		
	}

	@Test
	public void testInitials() {
		assertEquals("M.", user.initials());
	
	}
	
	@Test
	public void testNomMayuscula(){
		assertEquals("MANUEL", user.nomMayuscula());
	}

}
