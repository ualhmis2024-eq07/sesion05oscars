package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PremioTest {
	
	private Premio premio;
	
	@BeforeEach
	public void setUp() {
		premio = new Premio("Oscars");
	}
	
	@Test
	public void testGetNombre() {
		assertEquals(premio.getNombre(), "Oscars");
	}
	
	@Test
	public void testGetNominadas() {
		assertTrue(premio.getNominadas().isEmpty());
	}
	
	@Test
	public void testGetGanadora() {
		assertNull(premio.getGanadora());
	}
	
	@Test
	public void testAddNominada() {
		premio.addNominada(new Pelicula("Titanic", new Director("James Cameron", "masculino", "16/08/1954")));
		assertFalse(premio.getNominadas().isEmpty());
	}
	
	@Test 
	public void testSetGanadora() {
		Pelicula pelicula = new Pelicula("Memento", new Director("Christopher Nolan", "masculino", "30/07/1970"));
		premio.setGanadora(pelicula);
		assertEquals(premio.getGanadora(), pelicula);
	}
	
}
