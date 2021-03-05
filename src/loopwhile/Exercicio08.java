package loopwhile;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		double quantidadeDeAlunosNaSala = 0;
		double mediaDoAluno = 0;
		double notaDoAluno = 0;
		int contador = 1;
		int mediaSuperior = 0;
		int mediaInferior = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor informe a quantidade de alunos: ");
		quantidadeDeAlunosNaSala = leitor.nextDouble();

		System.out.println("Por favor informe nota média: ");
		mediaDoAluno = leitor.nextDouble();

		while (contador <= quantidadeDeAlunosNaSala) {

			System.out.println("Por favor Informe a nota do aluno " + contador);
			notaDoAluno = leitor.nextDouble();

			if (notaDoAluno >= mediaDoAluno) {
				mediaSuperior++;

			} else {
				mediaInferior++;
			}

			contador++;

		}
		leitor.close();
		System.out.println("Aluno com nota igual ou superior a média: " + mediaSuperior);
		System.out.println("Alunos com nota menor que a média: " + mediaInferior);

	}

}
