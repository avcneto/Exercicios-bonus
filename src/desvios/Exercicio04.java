package desvios;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		double distanciaDoInimigo;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor digite a distancia do seu inimigo: ");
		distanciaDoInimigo = leitor.nextDouble();
		leitor.close();

		if (distanciaDoInimigo >= 70) {
			System.out.println("ATIVADO");
		} else {
			System.out.println("DESATIVADO");
		}

	}

}

//Vari�veis criadas: distanciaDoInimigo 
//Dados digitados pelo usu�rio: 80
//Dados retornados pelo programa: Ativado
//Tipo de desvio condicional usado: desvio simples