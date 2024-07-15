package Application;

import java.util.Scanner;

public class PessoaMaisVelha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        String[] nomes = new String[numPessoas];
        int[] idades = new int[numPessoas];

        
        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        
        int indiceMaisVelha = 0;
        for (int i = 1; i < numPessoas; i++) {
            if (idades[i] > idades[indiceMaisVelha]) {
                indiceMaisVelha = i;
            }
        }

        
        System.out.println("A pessoa mais velha é: " + nomes[indiceMaisVelha]);
    }
}
	
		