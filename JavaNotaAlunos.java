package Application;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String aluno;
		float nota1, nota2, media, soma, mediaTurma; soma = 0;
		for(int i=0; i<30; i++){ System.out.print("Nome do Aluno: "); aluno = teclado.nextLine();
		System.out.print("Nota 1: "); nota1 = teclado.nextFloat();
		System.out.print("Nota 2: "); nota2 = teclado.nextFloat(); teclado.nextLine();
		media = (nota1+nota2)/2; soma = soma + media;
		System.out.printf("Média do aluno é %.1f\n", media);
		if (media >= 6)
		System.out.println("Aluno Aprovado. Parabéns."); else
		System.out.println("Em recuperação! Estude bastante.");
		}
		mediaTurma = soma/30;
		System.out.printf("Média da Turma = %.1f\n", mediaTurma);
		}
	{

	}

}
