package org.ualhmis.oscars;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class DirectorTest {
	
private Director director;
	
	public void constructorDirector() {
	String nombre = "James Cameron";
	String sexo = "Masculino";
	String fechaNacimiento = "16/08/1954";
	
	
		Director director = new Director(nombre, sexo, fechaNacimiento);
		
		 assertNotNull(director);
	     assertEquals(nombre, director.getNombre());
	     assertEquals(sexo, director.getSexo());
	     assertEquals(fechaNacimiento, director.getFechaNacimiento());
	
	}
}
