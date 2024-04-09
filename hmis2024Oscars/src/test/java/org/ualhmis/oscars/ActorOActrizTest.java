package org.ualhmis.oscars;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class ActorOActrizTest {
	
private ActorOActriz actorOActriz;
	
	public void constructorActorOActriz() {
	String nombre = "Leonardo di Caprio";
	String sexo = "Masculino";
	String fechaNacimiento = "11/11/1974";
	
	
		ActorOActriz actorOactriz = new ActorOActriz(nombre, sexo, fechaNacimiento);
		
		 assertNotNull(actorOActriz);
	     assertEquals(nombre, actorOActriz.getNombre());
	     assertEquals(sexo, actorOActriz.getSexo());
	     assertEquals(fechaNacimiento, actorOActriz.getFechaNacimiento());
	}
}
