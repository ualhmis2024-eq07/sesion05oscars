package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private Persona p1, p2, p3, p4, p5, p6, p7, p8;
	private Director d1;
	
	@BeforeEach
	public void setUp() {
		p1 = new Persona("Sara", "Femenino", null);
		p2 = new Persona("Eloy", "Masculino", "09/03/2003");
		p3 = new Persona("Mayca", "Femenino", "01/10/1970");
		p4 = new Persona(null, "Masculino", "09/03/2003");
		p5 = new Persona("Elio", "Masculino", "09/03/2003");
		p6 = new Persona("Eloy", null, "09/03/2003");
		p7 = new Persona("Eloy", "Femenino", "09/03/2003");
		p8 = new Persona("Eloy", "Masculino", "09/03/2003");
		d1 = new Director("Pedro Almodóvar", "Masculino", "25/09/1949");
	}

	@Test
	public void testGetNombre() {
		assertEquals(p1.getNombre(), "Sara");
	}
	
	@Test
	public void testGetSexo() {
		assertEquals(p1.getSexo(), "Femenino");
	}
	
	@Test
	public void testGetFechaNacimiento() {
		assertNull(p1.getFechaNacimiento());
	}
	
	@Test
	public void testHashCode() {
		Persona personaAux = new Persona(null, null, null);
		assertEquals(p2.hashCode(), p2.hashCode());
		assertNotEquals(p1.hashCode(), personaAux.hashCode());
	}
	
	@Test
	void testEqualsObject() {
		// Mismo objeto
        assertTrue(p1.equals(p1));
        
        // Objeto parametro null
        assertFalse(p1.equals(null));
        
        // Diferente tipo de objeto
        assertFalse(p1.equals(d1));
        
        // p1 fechaNacimiento null y p2 no
        assertFalse(p1.equals(p2));
        
        // p2 y p3 normal
        assertFalse(p2.equals(p3));
        
        //
        assertFalse(p4.equals(p2));
        
        //
        assertFalse(p2.equals(p5));
        
        //
        assertFalse(p6.equals(p2));
        
        //
        assertFalse(p2.equals(p7));
        
        //
        assertTrue(p2.equals(p8));
	}

}
