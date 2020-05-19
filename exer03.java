import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		float s;
		
		System.out.println("Digite seu antigo salário :");
		s=leitor.nextFloat();
		
		if (s>=0 && s<=1000)
		System.out.println("Haverá 15% de aumento no seu salário, será: "+ (s+(s/100*15)));	
		if (s>=1000.01 && s<=2500)
			System.out.println("Haverá 7% de aumento no seu salário, será "+ (s+(s/100*7)));	
		if (s>2500)
			System.out.println("Não há mudança no seu salário.");	
	}

}
