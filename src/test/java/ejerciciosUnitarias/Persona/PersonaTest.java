package ejerciciosUnitarias.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	private static Persona persona;

	@BeforeEach
	public void init() {
		persona = new Persona("Persona1", 20, 'H', 80, 2.1);
	}

	@Test
	public void CalculoIMC() {
		assertEquals(persona.INFRAPESO, persona.calcularIMC());

		persona.setPeso(95);
		assertEquals(persona.PESO_IDEAL, persona.calcularIMC());

		persona.setPeso(200);
		assertEquals(persona.SOBREPESO, persona.calcularIMC());
	}

	@Test
	public void esMayorDeEdad() {
		assertEquals(persona.esMayorDeEdad(), true);

		persona.setEdad(10);
		assertEquals(persona.esMayorDeEdad(), false);
	}

	@AfterEach
	public static void finish() {
		persona = null;
	}

}