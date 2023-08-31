package com.example.tarefa08;

import com.example.tarefa08.service.ReciboService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class ApplicationTests {

	@Test
	void testMedia() {
		ReciboService reciboService = new ReciboService();
		List<Double> numeros = new ArrayList<>();
		numeros.add(20D);  numeros.add(9D);  numeros.add(110D);  numeros.add(88D);
		numeros.add(10D);  numeros.add(20D);  numeros.add(1D);  numeros.add(33D);
		numeros.add(30D);  numeros.add(10D);  numeros.add(5D);  numeros.add(19D);
		numeros.add(50D);  numeros.add(12D);  numeros.add(8D);  numeros.add(24D);
		numeros.add(100D);  numeros.add(0D);  numeros.add(9D);  numeros.add(13D);

		var media = reciboService.media(numeros);
		Assert.assertEquals(28.55, media, 0.01);
	}

	@Test
	void testMediana(){
		ReciboService reciboService = new ReciboService();
		List<Double> numeros = new ArrayList<>();
		numeros.add(20D);  numeros.add(9D);  numeros.add(110D);  numeros.add(88D);
		numeros.add(10D);  numeros.add(20D);  numeros.add(1D);  numeros.add(33D);
		numeros.add(30D);  numeros.add(10D);  numeros.add(5D);  numeros.add(19D);
		numeros.add(50D);  numeros.add(12D);  numeros.add(8D);  numeros.add(24D);
		numeros.add(100D);  numeros.add(0D);  numeros.add(9D);  numeros.add(13D);

		var mediana = reciboService.mediana(numeros);
		Assert.assertEquals(16,mediana,0.01);
	}

	@Test
	void testDesvioPadrao(){
		ReciboService reciboService = new ReciboService();
		List<Double> numeros = new ArrayList<>();
		numeros.add(20D);  numeros.add(9D);  numeros.add(110D);  numeros.add(88D);
		numeros.add(10D);  numeros.add(20D);  numeros.add(1D);  numeros.add(33D);
		numeros.add(30D);  numeros.add(10D);  numeros.add(5D);  numeros.add(19D);
		numeros.add(50D);  numeros.add(12D);  numeros.add(8D);  numeros.add(24D);
		numeros.add(100D);  numeros.add(0D);  numeros.add(9D);  numeros.add(13D);

		var desvioPadrao = reciboService.desvioPadrao(numeros);
		Assert.assertEquals(32.04,desvioPadrao,0.1);
	}

	@Test
	void testValorMenor(){
		ReciboService reciboService = new ReciboService();
		List<Double> numeros = new ArrayList<>();
		numeros.add(20D);  numeros.add(9D);  numeros.add(110D);  numeros.add(88D);
		numeros.add(10D);  numeros.add(20D);  numeros.add(1D);  numeros.add(33D);
		numeros.add(30D);  numeros.add(10D);  numeros.add(5D);  numeros.add(19D);
		numeros.add(50D);  numeros.add(12D);  numeros.add(8D);  numeros.add(24D);
		numeros.add(100D);  numeros.add(0D);  numeros.add(9D);  numeros.add(13D);

		var menorNumero = reciboService.valorMenor(numeros);
		Assert.assertEquals(0,menorNumero,0.01);
	}

	@Test
	void testValorMaior(){
		ReciboService reciboService = new ReciboService();
		List<Double> numeros = new ArrayList<>();
		numeros.add(20D);  numeros.add(9D);  numeros.add(110D);  numeros.add(88D);
		numeros.add(10D);  numeros.add(20D);  numeros.add(1D);  numeros.add(33D);
		numeros.add(30D);  numeros.add(10D);  numeros.add(5D);  numeros.add(19D);
		numeros.add(50D);  numeros.add(12D);  numeros.add(8D);  numeros.add(24D);
		numeros.add(100D);  numeros.add(0D);  numeros.add(9D);  numeros.add(13D);

		var menorNumero = reciboService.valorMaior(numeros);
		Assert.assertEquals(110,menorNumero,0.01);
	}

}
