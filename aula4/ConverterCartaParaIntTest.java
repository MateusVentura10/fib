import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterCartaParaIntTest {

	@Test
	void test() {
		ConverterCartaParaInt vCarta = new ConverterCartaParaInt();
		int resultado = vCarta.converteCartaParaInt("A");
		assertEquals(1, resultado);
	}


	@Test
	void test2() {
		ConverterCartaParaInt vCarta = new ConverterCartaParaInt();
		int resultado = vCarta.converteCartaParaInt("J");
		assertEquals(11, resultado);
	}

	@Test
	void test3() {
		ConverterCartaParaInt vCarta = new ConverterCartaParaInt();
		int resultado = vCarta.converteCartaParaInt("8");
		assertEquals(8, resultado);
	}


	@Test
	void test4(){
		ConverterCartaParaInt vCarta = new ConverterCartaParaInt();
		int resultado = vCarta.converteCartaParaInt("k");
		assertEquals(13, resultado);
	}

}
