import java.util.Scanner;

public class Compras {
	public static void main(String[] args) {
		double vc,vcd,vp;
		int pq;
		
		Scanner in= new Scanner(System.in);
		System.out.print("Digite o valor da compra: ");
		vc= in.nextDouble();
		System.out.print("Digite a quantidade de presta��es: ");
		pq= in.nextInt();
		vcd= vc * 10/ 100;
		vp= vcd/ pq;
		System.out.print("O valor das presta��es � "+ vp);
		
		in.close();
		
		
		
	}

}
