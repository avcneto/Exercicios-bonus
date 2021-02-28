import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int a, b;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor digite o primeiro valor: ");
		a = leitor.nextInt();
		System.out.println("Por favor difite o segundo valor: ");
		b = leitor.nextInt();
		leitor.close();

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("O primeiro valor é: " + a);
		System.out.println("O segundo valor é : " + b);

	}

}
//Variáveis criadas: A, B
//Dados digitados pelo usuário: 10, 20
//Dados retornados pelo programa: 20, 10