package cr.ac.cenfotec.CribaEratostenesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.CribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {
	int dim = 21;
	boolean[] primos = new boolean[dim];;
	
	
	@Test
	public void testObtenerPrimos() {
		for (int i = 0; i < dim; i++){
			primos[i] = true;
		}		
			
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		assertEquals(false, primos[0]);
		assertEquals(false, primos[1]);
		assertEquals(true, primos[2]);
	}
	
	@Test
	public void testContadorPrimos(){
		for (int i = 0; i < dim; i++){
			primos[i] = true;
		}			
		
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		assertEquals(8, CribaEratostenes.obtenerCantidadPrimos(primos, dim));
	}
	
}
