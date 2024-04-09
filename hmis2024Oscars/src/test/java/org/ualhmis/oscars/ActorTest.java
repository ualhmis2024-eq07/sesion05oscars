package org.ualhmis.oscars;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class ActorTest {
	
	private Actor actor;
	
	public void constructorActor() {
	String nombre = "Leonardo di Caprio";
	String sexo = "Masculino";
	String fechaNacimiento = "11/11/1974";
	
	
		Actor actor = new Actor(nombre, sexo, fechaNacimiento);
		
		 assertNotNull(actor);
	     assertEquals(nombre, actor.getNombre());
	     assertEquals(sexo, actor.getSexo());
	     assertEquals(fechaNacimiento, actor.getFechaNacimiento());
		
	}

}
