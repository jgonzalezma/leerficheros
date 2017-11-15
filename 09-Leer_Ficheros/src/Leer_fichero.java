import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * leer un fichero
 */
public class Leer_fichero {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/mifichero.txt");
		Scanner scan = new Scanner(fichero);
		
		while(scan.hasNextLine()){
			String linea = scan.nextLine();
			System.out.println(linea);
		}
		
		String nombres = "juan aitor mikel josu iñigo eneko maria aintzane ane yaiza";
		String[] array_nombres = nombres.split(" ");
	}

}
