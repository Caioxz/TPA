import java.util.Scanner;

public class DobroTriplo {
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double i, db, tp;
		
		System.out.print("Digite um valor: ");
		i = in.nextDouble();
		db = i * 2;
		tp = i * 3;
		System.out.println();
		System.out.println("O dobro desse valor é "+ db);
		System.out.println("O triplo desse valor é "+ tp);
		
		in.close();
		
	}
}
