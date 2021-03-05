package basicos;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int duracaoDoFilmeEmMinutos = 0;
		int duracaoDoFilmeEmHoras = 0;
		int duracaoDoFilmeEmSegundos = 0;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite o tempo de um filme em minutos:");
		duracaoDoFilmeEmMinutos = leitor.nextInt();
		leitor.close();

		duracaoDoFilmeEmHoras = duracaoDoFilmeEmMinutos / 60;
		duracaoDoFilmeEmSegundos = duracaoDoFilmeEmMinutos * 60;

		System.out.println("A duração do filme é " + duracaoDoFilmeEmHoras + " hora");
		System.out.println("A duração do filme é " + duracaoDoFilmeEmSegundos + " segundos");

	}

}

// Variáveis criadas: duracaoDoFilmeEmMinutos,  duracaoDoFilmeEmHoras, duracaoDoFilmeEmSegundos
// Dados digitados pelo usuário: 60
// Dados retornados pelo programa: A duração do filme é 1 hora
//Dados retornados pelo programa: A duração do filme é 3600 segundos