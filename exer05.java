import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leitor = new Scanner (System.in);
		
		float x,y,z,a,b;
		int fis;
		
		System.out.println("Digite sua matrícula:");
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
		System.out.println("Sua média foi de "+b);
		
		if (b>=7)
		    System.out.println("O aluno referente á matrícula "+fis+" foi aprovado.");
		if (b>=3.5&&b<7)
			System.out.println("O aluno referente á matrícula "+fis+" ficou de recuperação.");
		if (b<3.5)
			System.out.println("O aluno referente á matrícula "+fis+" foi reprovado.");
	}

}
