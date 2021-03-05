import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		String nomeDoFuncionario;
		String setorDoFuncionario;
		int meioDetransporte;
		int ultimoDigitoDaPlacaDoVeiculo;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor informe o nome do funcionario: ");
		nomeDoFuncionario = leitor.next();
		System.out.println("Por favor informe o setor do funcionario: ");
		setorDoFuncionario = leitor.next();
		System.out.println("Por favor escolhar a forma de transporte: ");
		System.out.println("1 - Carro");
		System.out.println("2 - ônibus");

		meioDetransporte = leitor.nextInt();

		switch (meioDetransporte) {
		case 1:
			System.out.println("Por favor digite o ultimo digito da placa do seu veiculo: ");
			ultimoDigitoDaPlacaDoVeiculo = leitor.nextInt();
			if (ultimoDigitoDaPlacaDoVeiculo == 1 || ultimoDigitoDaPlacaDoVeiculo == 2) {
				System.out.println("Seu dia de rodízio é segunda \\o/");
			} else if (ultimoDigitoDaPlacaDoVeiculo == 3 || ultimoDigitoDaPlacaDoVeiculo == 4) {
				System.out.println("Seu dia de rodízio é terça \\o/");
			} else if (ultimoDigitoDaPlacaDoVeiculo == 5 || ultimoDigitoDaPlacaDoVeiculo == 6) {
				System.out.println("Seu dia de rodízio é quarta \\o/");
			} else if (ultimoDigitoDaPlacaDoVeiculo == 7 || ultimoDigitoDaPlacaDoVeiculo == 8) {
				System.out.println("Seu dia de rodízio é quinta \\o/");
			} else {
				System.out.println("Seu dia de rodízio é sexta \\o/");
			}
			break;
		case 2:
			System.out.println("rodízio não se aplica");
			break;
		}

		leitor.close();

	}

}

//http://www.cetsp.com.br/consultas/rodizio-municipal/como-funciona.aspx
