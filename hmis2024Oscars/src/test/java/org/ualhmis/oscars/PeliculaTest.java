package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PeliculaTest {
	
	private Pelicula pelicula;
	
	@BeforeEach
	public void setUp() {
		pelicula = new Pelicula("Titanic", new Director("James Cameron", "masculino", "16/08/1954"));
	}
	
	@Test
	public void testGetTitulo() {
		assertEquals(pelicula.getTitulo(), "Titanic");
	}
	
	@Test
	public void testGetDirector() {
		assertNotNull(pelicula.getDirector());
	}
	
	@Test
	public void testGetActorProtagonista() {
		assertNull(pelicula.getActorProtagonista());
	}
	
	@Test
	public void testSetActorProtagonista() {
		pelicula.setActorProtagonista(new Actor("Leonardo DiCaprio", "masculino", "11/11/1974"));
		assertNotNull(pelicula.getActorProtagonista());
	}
	
	@Test
	public void testGetActrizProtagonista() {
		assertNull(pelicula.getActrizProtagonista());
	}
	
	@Test
	public void testSetActrizProtagonista() {
		pelicula.setActrizProtagonista(new Actriz("Kate Winslet", "Femenino", null));
		assertNotNull(pelicula.getActrizProtagonista());
	}
	
	@Test
	public void testGetActoresSecundarios() {
		assertTrue(pelicula.getActoresSecundarios().isEmpty());
	}
	
	@Test
	public void testGetActoricesSecundarios() {
		assertTrue(pelicula.getActricesSecundarias().isEmpty());
	}
	
	@Test
	public void testAddActorSecundario() {
		pelicula.addActorSecundario(new Actor("Billy Zane", "Masculino", "24/02/1966"));
		assertNotNull(pelicula.getActoresSecundarios());
	}
	
	@Test
	public void testAddActrizSecundaria() {
		pelicula.addActrizSecundaria(new Actriz("Frances Fisher", "Femenino", "11/05/1952"));
		assertNotNull(pelicula.getActoresSecundarios());
	}
	
}
