package ar.edu.unlp.objetos.uno.ej19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	
	Archivo ejemplo1, ejemplo2, ejemplo3;

	@BeforeEach
	void setUp() throws Exception {
		ejemplo1 = new ExtensionDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura"));
		ejemplo2 = new ExtensionDecorator(new CreacionDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura")));
		ejemplo3 = new ExtensionDecorator(new PermisosDecorator(new EspacioDecorator(new FileOO2("Lucas", ".py", "284 MB", "Lectura"))));
	}

	@Test
	void testPrettyPrint() {
		assertEquals(ejemplo1.prettyPrint(),"Lucas - .py");
		assertEquals(ejemplo2.prettyPrint(),"Lucas - "+ejemplo2.getFechaCreacion()+ " - .py");
		assertEquals(ejemplo3.prettyPrint(),"Lucas - 284 MB - Lectura - .py");
	}

}
