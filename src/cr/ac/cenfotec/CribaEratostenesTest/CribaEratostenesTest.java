package cr.ac.cenfotec.CribaEratostenesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.CribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {
	CribaEratostenes nuevaCriba = new CribaEratostenes();
	boolean[] primos;
	int dim = 21;
	
	@Test
	public void testObtenerPrimos() {
		
		primos = new boolean[dim];
		
		for (int i = 0; i < dim; i++){
			primos[i] = true;
		}		
				
		primos = CribaEratostenes.obtenerListaPrimo(primos, dim);
		assertEquals(false, primos[0]);
		assertEquals(false, primos[1]);
		assertEquals(true, primos[2]);
	}

}
