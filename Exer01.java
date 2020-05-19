import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um número e veja se ele está entre 20 e 90:");
		x = leitor.nextInt();
		
		if  (x>=20 && x<=90)
		System.out.println("Está entre 20 e 90");
		
		else 
		System.out.println("É menor que 20 ou maior que 90");
	}

}
