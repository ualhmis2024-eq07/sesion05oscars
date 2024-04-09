package org.ualhmis.oscars;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class ActrizTest {
	
	private Actriz actriz;
	
	public void constructorActriz() {
	String nombre = "Kate winslet";
	String sexo = "Femenino";
	String fechaNacimiento = "05/10/1975";
	
	
		Actriz actriz = new Actriz(nombre, sexo, fechaNacimiento);
		
		 assertNotNull(actriz);
	     assertEquals(nombre, actriz.getNombre());
	     assertEquals(sexo, actriz.getSexo());
	     assertEquals(fechaNacimiento, actriz.getFechaNacimiento());
		
	}
}
