import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		float s;
		
		System.out.println("Digite seu antigo sal�rio :");
		s=leitor.nextFloat();
		
		if (s>=0 && s<=1000)
		System.out.println("Haver� 15% de aumento no seu sal�rio, ser�: "+ (s+(s/100*15)));	
		if (s>=1000.01 && s<=2500)
			System.out.println("Haver� 7% de aumento no seu sal�rio, ser� "+ (s+(s/100*7)));	
		if (s>2500)
			System.out.println("N�o h� mudan�a no seu sal�rio.");	
	}

}
