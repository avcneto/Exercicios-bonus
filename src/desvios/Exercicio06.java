package desvios;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		double valorDaCompra;
		String cupomDeDesconto;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor digite o valor da compra: ");
		valorDaCompra = leitor.nextDouble();
		System.out.println("Caso tenha um cupom de desconto por favor inserir abaixo: ");
		cupomDeDesconto = leitor.next();
		leitor.close();

		if (cupomDeDesconto.equals("DIADEFESTA")) {
			valorDaCompra = (valorDaCompra - (valorDaCompra * 0.03));
			System.out.println("Desconto de 3% aplicado na sua compra");
			System.out.println("O valor total da compra é: " + valorDaCompra);
		} else {
			System.out.println("O valor total da compra é: " + valorDaCompra);

		}

	}

}

//Variáveis criadas: valorDaCompra, cupomDeDesconto
//Dados digitados pelo usuário: 100, DIADEFESTA
//Dados retornados pelo programa:Desconto de 3% aplicado a sua compra, O valor total da compra é: 97.0
//Tipo de desvio condicional usado:desvio simples