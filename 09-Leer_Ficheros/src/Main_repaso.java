		/*1- 	Dado un array de int-s sacar por pantalla los numeros
		 * 		mayores que 5 y mernores o iguales que 14
		 * 		y mayores o iguales que 20 menores o iguales que 30.
		 * 
		 *2-	Dado un array de String-s sacar por pantalla los que
		 *		empiezen con 'a' o tengan la 3. letra la 'a'
		 *
		 *3-	Programa que lea una cadena de caracteres del teclado 
		 *		y muestre sus siglas. Por ejemplo: tren articulado ligero 
		 *		goicoechea oriol TALGO 
		 */
public class Main_repaso {

	public static void main(String[] args) {
		int[] numbers = {1,3,23,34,53,21,22,6,14};
		ejercicio1(numbers);
	}
	static void ejercicio1(int[] numeros){
		for(int i=0; i < numeros.length; i++){
			if ((numeros[i] >5 && numeros[i] <= 14 || numeros[i] >= 20 && numeros[i] <= 30 )){
				System.out.println(numeros[i]);
			}
		}
	}
	
	static int[] ejercicio4(int divisor, int maximo){
		int[] multiplos;
		int indice = 0;
		for(int num = 1; num <= maximo; num++){
			if(num % divisor == 0){
				multiplos[indice] = num;
				indice++;
			}	
		}
	}
}
