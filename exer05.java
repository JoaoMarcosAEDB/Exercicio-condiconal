import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		float x,y,z,a,b;
		int fis;
		
		System.out.println("Digite sua matr�cula:");
		fis=leitor.nextInt();
		System.out.println(" Digite sua primeira notas:");
		x=leitor.nextFloat();
		System.out.println(" Digite sua segunda nota:");
		y=leitor.nextFloat();
		System.out.println(" Digite sua terceira nota:");
		z=leitor.nextFloat();
		System.out.println(" Digite sua quarta nota:");
		a=leitor.nextFloat();
		b=((x+y+z+a)/4);
		System.out.println("Sua m�dia foi de "+b);
		
		if (b>=7)
		    System.out.println("O aluno referente � matr�cula "+fis+" foi aprovado.");
		if (b>=3.5&&b<7)
			System.out.println("O aluno referente � matr�cula "+fis+" ficou de recupera��o.");
		if (b<3.5)
			System.out.println("O aluno referente � matr�cula "+fis+" foi reprovado.");
	}

}
