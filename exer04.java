import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		int x,y,z;
		
		System.out.println("Escreva o tamanho dos lados do seu triângulo para saber seu tipo:");
		x=leitor.nextInt();
		y=leitor.nextInt();
		z=leitor.nextInt();
		
		if (x==y&&y==z)
			System.out.println("Triângulo equilátero.");
		if (x==y&&y!=z)
			System.out.println("Triângulo isósceles.");
		if (x!=y&&y!=z&&x!=z)
			System.out.println("Triângulo escaleno.");
	}

}
