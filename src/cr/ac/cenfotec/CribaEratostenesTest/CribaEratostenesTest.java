package cr.ac.cenfotec.CribaEratostenesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.CribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {
	int dim = 21;
	boolean[] primos = new boolean[dim];
	
	@Test
	public void testLlenarArreglo(){

		primos = CribaEratostenes.llenarArreglo(primos, dim);
		assertEquals(true, primos[0]);
		assertEquals(true, primos[5]);
		assertEquals(true, primos[10]);
		assertEquals(true, primos[15]);
		assertEquals(true, primos[20]);
	}
	
	@Test
	public void testObtenerPrimos() {
		
		primos = CribaEratostenes.llenarArreglo(primos, dim);	
			
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		assertEquals(false, primos[0]);
		assertEquals(false, primos[1]);
		assertEquals(true, primos[2]);
	}
	
	@Test
	public void testContadorPrimos(){
		primos = CribaEratostenes.llenarArreglo(primos, dim);		
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		assertEquals(8, CribaEratostenes.obtenerCantidadPrimos(primos, dim));
	}
	
	@Test
	public void testListaPrimos(){
		int cuenta = 0;			
		
		primos = CribaEratostenes.llenarArreglo(primos, dim);
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		cuenta = CribaEratostenes.obtenerCantidadPrimos(primos, dim);
		int[] lPrimos = new int[cuenta];
		lPrimos = CribaEratostenes.listaDePrimos(primos, dim, cuenta);
		
		assertEquals(true, lPrimos[0]);
		
	}

}
