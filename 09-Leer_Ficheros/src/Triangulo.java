
public class Triangulo {

	public static void main(String[] args) {
		int imprimible;
		int num = 100;
		for(int i = 1; i <= num; i++){
			imprimible = i;
			for(int j = 0; j < i; j++){
				System.out.print(imprimible + "\t");
				imprimible = imprimible - (i-1);
			}
			System.out.print("\n");
		}

	}

}
