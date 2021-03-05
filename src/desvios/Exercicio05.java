package desvios;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		double lixo01, lixo02, lixo03;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor digite o valor do primeiro lixo: ");
		lixo01 = leitor.nextDouble();
		System.out.println("Por favor digite o valor do segundo lixo: ");
		lixo02 = leitor.nextDouble();
		System.out.println("Por favor digite o valor do terceiro lixo: ");
		lixo03 = leitor.nextDouble();
		leitor.close();

		if (lixo01 < lixo02 && lixo01 < lixo03) {
			System.out.println("O lixo de numero 1 é o lixo de menor peso ");
		} else if (lixo02 < lixo01 && lixo02 < lixo03) {
			System.out.println("O lixo de numero 2 é o lixo de menor peso");
		} else {
			System.out.println("O lixo de numero 3 é o lixo de menor peso");
		}

	}

}

//Variáveis criadas: lixo01, lixo02, lixo03
//Dados digitados pelo usuário: 30, 20, 10
//Dados retornados pelo programa: O lixo de numero 3 é o lixo de menor peso
//Tipo de desvio condicional usado: desvio encadeado