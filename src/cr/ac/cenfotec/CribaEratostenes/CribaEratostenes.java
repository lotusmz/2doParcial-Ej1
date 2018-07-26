package cr.ac.cenfotec.CribaEratostenes;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){
		int i,j ;
		if (tope >= 2){
			int dim = tope+1;
			
			//Crea un arreglo de booleanos
			boolean[] primo = new boolean[dim];
			
			//Llena el arreglo con valores verdaderos
			for (i = 0; i < dim; i++){
				primo[i] = true;
			}
			
			//Se declara los primero dos indices del arreglo se como No Primos
			primo[0] = primo[1] = false;
			
			//Si i es menor a la raiz cuadrada de dim + 1 se entra en la condición
			for (i = 2; i< Math.sqrt(dim) + 1; i++){
				
				//i está marcado como primo se entra en la condición
				if (primo[i]){
					
					//Define a todos los multiplos de 2 como No primos
					for (j = 2*i; j < dim; j+=i){

						primo[j] = false;

					}
				}
			}
			int cuenta = 0;
			//Cuenta todos los numeros primos obtenidos
			for (i = 0; i < dim; i++){
				if (primo[i])
					cuenta++;
			}
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
		
}