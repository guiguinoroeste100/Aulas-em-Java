package test;

import java.util.Scanner;

import entities.Liquidificador;

public class TesteLiquidificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Liquidificador liquidificador = new Liquidificador();
		String op;
		do {
			op = "Estado: " +liquidificador.isEstado();
			op +="Velocidade:"+liquidificador.getVelocidade();
			op +="\n1 - Liga - Desliga\n2 - Aumentar Velocidade\n3 - Reduzir velocidade\n4 - Sair\n\nQual a sua opção?";
			System.out.println(op);
			op = sc.next();
			switch(op) {
			case "1":liquidificador.setEstado();break;
			case "2":liquidificador.velocidadeMais();break;
			case "3":liquidificador.velocidadeMenos();break;
			}
			
		}while(!op.equals("4"));
		sc.close();
		

	}

}
