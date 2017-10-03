import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		System.out.println("Escribe numero a");
		Scanner lector = new Scanner(System.in);
		int numero1 = lector.nextInt();
		System.out.println("Escribe numero b");
		int numero2 = lector.nextInt();
		if (numero1 > numero2){
			System.out.println("A es mayor que B");
		}
		else if(numero1 < numero2) {
			System.out.println("B es mayor que A");
		}
		else {
			System.out.println("A es igual que B");
		}
		}
		}

