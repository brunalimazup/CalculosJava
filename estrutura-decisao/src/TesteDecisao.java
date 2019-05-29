import java.util.Scanner;

public class TesteDecisao {

	public static void main(String[] args) {

		// Entrada de Dados
		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();

		// Condiçoes
		if (idade < 18) {
			System.out.println("Ele é menor de idade!");

		} else if (idade >= 18 && idade <= 60) {
			System.out.println("Ele é adulto!");
		} else {
			System.out.println("Ele é idoso!");
		}
	}

}
