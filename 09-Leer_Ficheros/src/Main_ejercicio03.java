import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_ejercicio03 {
/*
 * Menu con funciones
 * teniendo articulo.txt
 * 1- contar palabras
 * 2- contar cuantas veces aparece una palabra introducida por teclado
 * 3- contar cuantas veces aparece la vocal 'a'
 * 4- introducir un numero por teclado y que saque la suma del mismo con sus inferiores
 * 5- introducir un numero por teclado y sacar por pantalla los multiplos de 5 inferiores
 * 6- utilizad funciones para que el main quede mejor estructurado y simple
 */
	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/Josu/Programación/articulo.txt");
		Scanner lector = new Scanner(fichero);
		int opcion;
		Scanner opcion1 = new Scanner(System.in);
		Scanner lectorT = new Scanner(System.in);
		final int contar_palabras = 1;
		final int palabra_exacta = 2;
		final int vocal_a = 3;
		final int suma_nums = 4;
		final int mult_5 = 5;
		final int salir = 6;
		do{
			//Hacer el menu
			System.out.println("---MENU---");
			System.out.println("1-Contar palabras");
			System.out.println("2-Contar cuanatas veces aparece una palabra");
			System.out.println("3-Contar vocal a");
			System.out.println("4-Introducir numero y que saque suma con sus inferiores");
			System.out.println("5-Introducir numero y sacar sus multiplos de 5 inferiores");
			System.out.println("6-Salir");
			opcion = Integer.parseInt(opcion1.nextLine());
			//Opciones del menu
		switch(opcion){
		case contar_palabras:
			System.out.println("Hay "+contarPalabras(lector)+" palabras");
		break;
			
		case palabra_exacta:
			System.out.println("La palabra que has buscado esta " +contarPalabraExacta(lector)+ " veces");
		break;
		
		case vocal_a:
			System.out.println("La vocal a esta "+contarVocales(lector)+" veces");
		break;
		
		case suma_nums:
			System.out.println("La suma es: "+ numeroSuma(lectorT));
			
		break;
		
		case mult_5:
			lector = new Scanner(fichero);
			
		break;
		
		case salir:
			System.out.println("Fin del programa");
		break;
		
		default:
			System.out.println("Error 404");
		break;
		
		}
		}while(opcion != 6);
			
		
}
	static int contarPalabras(Scanner fichero){
	String [] matriz;
	String palabra;
	int contador = 0;
	while(fichero.hasNextLine()){
		palabra = fichero.nextLine();
		matriz = palabra.split(" ");
		
		for(int i=0; i < matriz.length; i++){
			contador++;
			
		}
	}
	return contador;}
	
	static int contarPalabraExacta(Scanner fichero){
		String [] matriz;
		String palabra, texto;
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mete una palabra y te lo contare :)");
		palabra = scan.nextLine();
		
		while(fichero.hasNextLine()){
			texto = fichero.nextLine();
			texto.toLowerCase();
			matriz = texto.split(palabra);
			if(matriz.length > 2){
			for(int i=0; i < matriz.length; i++){
				contador++;
			}}
		}
		
		return contador;
	}
	
	static int contarVocales(Scanner fichero){
		int contador = 0;
		String vocal;
		vocal = fichero.nextLine();
		for(int i=0; i < vocal.length(); i++){
			if(vocal.charAt(i) == 'a' || vocal.charAt(i) == 'A'){
			contador++;}
		}
		return contador;
	}
	
	static int numeroSuma(Scanner lectorT){
		int numero = 0, numinf, resultado = 0;
		System.out.print("Introduce un numero");
		numero = Integer.parseInt(lectorT.nextLine());
		if(numero > 0){
			for(int i=0; i < numero;i++){
				resultado = resultado+i;
				resultado++;
			}
		}else{
			System.out.println("Tienes que introducir un numero valido");
		}
		return resultado;
		
	}
	
	static int multiplosDeCinco(Scanner lectorT){
		int numero = 0, resultado = 0;
		System.out.println("Introduce un numero");
		numero = Integer.parseInt(lectorT.nextLine());
		if(numero > 0){
			for(int i=0; i < numero;i++){
				
			}
			
		}return resultado;
	}
}

