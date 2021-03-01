import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int valora, valorb, valorc, valord, diferenca;
		
		valora = sc.nextInt();
		valorb = sc.nextInt();
		valorc = sc.nextInt();
		valord = sc.nextInt();
		
		diferenca = valora*valorb - valorc*valord;
		System.out.println("A diferença é: " + diferenca);
		
		sc.close();

	}

}
