import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre");
		//Creamos un objeto para leer del teclado
		Scanner lector = new Scanner(System.in);
		//Leemos del teclado
		String nombre;
		nombre = lector.nextLine();
		System.out.println("Escribe tu apellido1");
		String apellido1;
		apellido1 = lector.nextLine();
		System.out.println("Escribe tu apellido2");
		String apellido2;
		apellido2 = lector.nextLine();
		System.out.println("Hola"+" "+apellido1+" "+apellido2+" "+nombre);
		System.out.println("Escribe tu edad");
		//si es mayor o menor de edad
		int edad = lector.nextInt();
		if (edad >= 18){
			System.out.println("Eres mayor de edad :)");
		} else {
			System.out.println("No eres mayor de edad :(");
		}
			
		}
	}

