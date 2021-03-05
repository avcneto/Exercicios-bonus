package loopwhile;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		int quantidadeDeFeijao = 0;

		Scanner leitor = new Scanner(System.in);

		while (quantidadeDeFeijao < 1238) {
			System.out.println("Por favor digite a quantidade de feijões: ");
			quantidadeDeFeijao = leitor.nextInt();

		}
		leitor.close();
	}
	
}

//Variáveis criadas: quantidadeDeFeijao
//Dados digitados pelo usuário: 10
//Dados retornados pelo programa:Por favor digite a quantidade de feijões: 
//Tipo de laço de repetição usado:  while