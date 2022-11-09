import java.util.Scanner;

public class Distancia2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double km, l, md;
		
		System.out.print("Digite a distância percorrida: ");
		km = in.nextDouble();
		System.out.print("Digite o total gasto de combustível: ");
		l = in.nextDouble();
		md = km/l;
		System.out.println();
		System.out.print("O consumo gasto de combustível foi em média de "+ md);
		
		in.close();
	}
	
}
