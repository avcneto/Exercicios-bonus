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

		System.out.println("A dura��o do filme � " + duracaoDoFilmeEmHoras + " hora");
		System.out.println("A dura��o do filme � " + duracaoDoFilmeEmSegundos + " segundos");

	}

}

// Vari�veis criadas: duracaoDoFilmeEmMinutos,  duracaoDoFilmeEmHoras, duracaoDoFilmeEmSegundos
// Dados digitados pelo usu�rio: 60
// Dados retornados pelo programa: A dura��o do filme � 1 hora
//Dados retornados pelo programa: A dura��o do filme � 3600 segundos