package entities;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner input = new
				 Scanner(System.in);
		int x, y = 0;
		System.out.print("Digite um numero :");
		x = input.nextInt();
		if (x > y)  {
			System.out.println(x+ "é maior que " +y);
		}else {
					if (x < y ) {
						System.out.print (y + " é maior que " +x);
					}
			
		}
	
		

	}

}
