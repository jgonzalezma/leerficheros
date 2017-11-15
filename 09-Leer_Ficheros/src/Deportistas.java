/*
 * Lee nombres de deportistas desde un fichero y los guarda en una matriz N*2.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Deportistas {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:/Josu/Programación/deportistas.txt");
		Scanner scan = new Scanner(f);
		int cont = 0;
		String [][] matriz = new String [cont][2];
		String linea;
		while(scan.hasNextLine()){
			linea = scan.nextLine();
			cont++;
		}
		
		for(int i = 0; i < matriz.length; i++){
			
		}

	}

}
