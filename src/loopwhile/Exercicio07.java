package loopwhile;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		int quantidadeDeFeijao = 0;

		Scanner leitor = new Scanner(System.in);

		while (quantidadeDeFeijao < 1238) {
			System.out.println("Por favor digite a quantidade de feij�es: ");
			quantidadeDeFeijao = leitor.nextInt();

		}
		leitor.close();
	}
	
}

//Vari�veis criadas: quantidadeDeFeijao
//Dados digitados pelo usu�rio: 10
//Dados retornados pelo programa:Por favor digite a quantidade de feij�es: 
//Tipo de la�o de repeti��o usado:  while