import java.util.Scanner;

public class Distancia2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double km, l, md;
		
		System.out.print("Digite a dist�ncia percorrida: ");
		km = in.nextDouble();
		System.out.print("Digite o total gasto de combust�vel: ");
		l = in.nextDouble();
		md = km/l;
		System.out.println();
		System.out.print("O consumo gasto de combust�vel foi em m�dia de "+ md);
		
		in.close();
	}
	
}
