package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class GestorPremiosTest {
	
	private GestorPremios gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorPremios();
    }

    @Test
    public void testCrearPremio() {
        gestor.crearPremio("Mejor película");
        assertNotNull(gestor.getPremios().get("Mejor película"));
    }

    @Test
    public void testNominarPeliculaExistente() {
        Pelicula pelicula = new Pelicula("Titanic", new Director("James Cameron", "masculino", "13/08/1954"));
        gestor.crearPremio("Mejor película");
        gestor.nominarPelicula("Mejor película", pelicula);
        assertTrue(gestor.getPremios().get("Mejor película").getNominadas().contains(pelicula));
    }

    @Test
    public void testNominarPeliculaNoExistente() {
        Pelicula pelicula = new Pelicula("Titanic", new Director("James Cameron", "masculino", "13/08/1954"));
        gestor.nominarPelicula("Mejor película", pelicula);
        assertNull(gestor.getPremios().get("Mejor película"));
    }

    @Test
    public void testAsignarGanadoraExistente() {
        Pelicula pelicula = new Pelicula("Titanic", new Director("James Cameron", "masculino", "13/08/1954"));
        gestor.crearPremio("Mejor película");
        gestor.nominarPelicula("Mejor película", pelicula);
        gestor.asignarGanadora("Mejor película", pelicula);
        assertEquals(pelicula, gestor.getPremios().get("Mejor película").getGanadora());
    }

    @Test
    public void testAsignarGanadoraNoExistente() {
        Pelicula pelicula = new Pelicula("Titanic", new Director("James Cameron", "masculino", "13/08/1954"));
        gestor.asignarGanadora("Mejor película", pelicula);
        assertNull(gestor.getPremios().get("Mejor película"));
    }
	
	
}
