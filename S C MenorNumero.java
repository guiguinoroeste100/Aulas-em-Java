package entities;

import java.util.Scanner;

public class MenorNumero {

	public static void main(String[] args) {
		{ Scanner input = new
			Scanner (System.in);
		int x, y;
		System.out.print("Digite um numero:");
		x = input.nextInt();
		System.out.print("Digite um numero diferente do primeiro :");
		y = input.nextInt();
		if (x < y ) {
			System.out.printf("O numero " +x+ " é menor");
		} else {
				if (x < y )
					System.out.printf("O numero " +y+ " é menor");
		}
		
		}
				

	}

}
