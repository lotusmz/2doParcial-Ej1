package cr.ac.cenfotec.CribaEratostenes;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){
		int i,j ;
		if (tope >= 2){
			int dim = tope+1;
			
			//Crea un arreglo de booleanos
			boolean[] primo = new boolean[dim];
			
			primo = llenarArreglo(primo,dim);
		
			primo = obtenerListaPrimo(primo, dim);
			
			int cuenta = 0;
			cuenta = obtenerCantidadPrimos(primo, dim);
			
			//Se crea un arreglo con la cantidad de #'s primos obtenidos
			int[] primos = new int[cuenta];
			
			//
			for (i = 0,j=0; i < dim; i++){
				if (primo[i])
					primos[j++] = 1;
			}
			
			return primos;
		} else {
			return new int[0];
		}
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
		
		//Si i es menor a la raiz cuadrada de dim + 1 se entra en la condición
		for (i = 2; i< Math.sqrt(pDim) + 1; i++){
			
			//i está marcado como primo se entra en la condición
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