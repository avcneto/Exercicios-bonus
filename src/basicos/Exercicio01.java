package basicos;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int idade;
		int anoNascimento;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento:");
		anoNascimento = leitor.nextInt();
		leitor.close();

		idade = 2021 - anoNascimento;
		System.out.println("Sua idade no dia 31 de dezembro de 2021 é: " + idade);

	}

}

//Variaveis criadas: idade, anoNascimento
//Dados digitados pelo usuário: 1995
//Dados retornados pelo programa: 26