package asistente.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import asistente.clase.Asistente;

public class RF00Tests {

	public final static String USUARIO = "delucas"; 
	
	Asistente jenkins;
	
	@Before
	public void setup() {
		jenkins = new Asistente("delucas", "jenkins");
	}
	
	@Test
	public void sinsentido() {
		String[] mensajes = {
				"Este mensaje no tiene sentido @jenkins"
		};
		for (String mensaje : mensajes) {
			Assert.assertEquals(
					"Disculpa... no entiendo el pedido, @delucas �podr�as repetirlo?",
					jenkins.escuchar(mensaje)
			);
		}
	}
	
	@Test
	public void sinDirigidoAsistente() {
		String[] mensajes = {
				"Este mensaje no tiene sentido"
		};
		for (String mensaje : mensajes) {
			Assert.assertEquals(
					"Te est�s dirigiendo a m�, @delucas?. Me llamo @jenkins.",
					jenkins.escuchar(mensaje)
			);
		}
	}

}
