package ar.edu.unlp.info.oo1.ej01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario usu1;
	Tweet tw1, tw2;
	Retweet rt1, rt2;
	Red x;

	@BeforeEach
	void setUp() throws Exception {
		x = new Red("X");
		usu1 = x.crearUsuario("Lucas");
		tw1 = new Tweet("Hola");
		tw2 = new Tweet("Chau");
	}

	@Test
	void testTwittear() {
		usu1.twittear("");
		assertEquals(usu1.getTweets().size(), 0);
		// 129 caracteres
		usu1.twittear("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		assertEquals(usu1.getTweets().size(), 0);
		usu1.twittear("Hola");
		assertEquals(usu1.getTweets().size(), 1);
		usu1.twittear("a");
		// 128 caracteres
		assertEquals(usu1.getTweets().size(), 2);
		usu1.twittear("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		assertEquals(usu1.getTweets().size(), 3);
		
	}

	@Test
	void testDarRt() {
		usu1.darRt(tw1);
		assertEquals(usu1.getPublicaciones().size(), 1);
		usu1.darRt(tw2);
		assertEquals(usu1.getPublicaciones().size(), 2);
	}

	@Test
	void testEliminarTweets() {
		usu1.twittear("Hola");
		usu1.darRt(tw1);
		usu1.darRt(tw2);
		usu1.eliminarTweets();
		assertEquals(usu1.getPublicaciones().size(), 0);
		
	}

}
