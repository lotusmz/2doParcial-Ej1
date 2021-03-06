package cr.ac.cenfotec.CribaEratostenes;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){

		if (tope >= 2){

			int dim = tope+1;
			boolean[] primo = new boolean[dim];
			int cuenta = 0;
			
			primo = llenarArreglo(primo,dim);
			primo = obtenerListaPrimo(primo, dim);
			cuenta = obtenerCantidadPrimos(primo, dim);		
						
			return listaDePrimos(primo, dim, cuenta);
			
		} else {
			return new int[0];
		}
	}		
	
	public static int[] listaDePrimos(boolean [] pPrimo, int pDim, int pCuenta) {
		
		int[] primos = new int[pCuenta];
		
		for (int i = 0,j=0; i < pDim; i++){
			if (pPrimo[i])
				primos[j++] = i;
				
		}
		return primos;
	}

	public static boolean[] llenarArreglo(boolean[] pPrimo, int pDim) {

		//Llena el arreglo con valores verdaderos
		for (int i = 0; i < pDim; i++){
			pPrimo[i] = true;
		}
		
		return pPrimo;
	}



	public static int obtenerCantidadPrimos(boolean[] pPrimo, int pDim) {
		int cuenta = 0;
		//Cuenta todos los numeros primos obtenidos
		for (int i = 0; i < pDim; i++){
			if (pPrimo[i])
				cuenta++;
		}
		return cuenta;
	}

	public static boolean[] obtenerListaPrimo(boolean[] pPrimo, int pDim) {
		
		int i,j ;
		
		//Se declara los primero dos indices del arreglo como No Primos
		pPrimo[0] = pPrimo[1] = false;
		
		//Si i es menor a la raiz cuadrada de dim + 1 se entra en la condici�n
		for (i = 2; i< Math.sqrt(pDim) + 1; i++){
			
			//i est� marcado como primo se entra en la condici�n
			if (pPrimo[i]){
				
				//Define los # que son multiplos del # primo como no primos
				for (j = 2*i; j < pDim; j+=i){

					pPrimo[j] = false;

				}
			}
		}
		
		return pPrimo;
	}
	
	
		
}