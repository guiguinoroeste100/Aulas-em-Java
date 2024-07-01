package entites;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op;
		Conta conta = new Conta ();
		do {
			op = "Cota:"+conta.getNumero()+"\nCPF:"+conta.getCpf()+
					"\nSaldo:"+conta.getSaldo()+"\nLimite:"+conta.getLimite()
					+"\n1 - alterar - alterar numero \n2 - alterar CPF\n3 - Alterar Limite\n4 - Deposito\n5 - Saque\n6 - Sair\n\nQual a sua opção";
			System.out.println(op);
			op = sc.next();
			if(op.equals("1")) {
				System.out.print("Digite o numero da conta:");
				conta.setNumero(sc.nextInt());
			}else if(op.equals("2")) {
				System.out.print("Digite o CPF:");
				conta.setCpf(sc.next());
			}else if(op.equals("3")) {
				System.out.print("Digite o limite");
				conta.setLimite(sc.nextDouble());
			}else if(op.equals("4")) {
				System.out.print("Digite o valor a depositar:");
				conta.deposito(sc.nextDouble()) ;
			}else if(op.equals("5")) {
				System.out.println("Digite o valor a sacar:");
				if(conta.saque(sc.nextDouble())){
					System.out.println("Saque realizado com sucesso!");
				}else {
					System.out.println("Saldo insuficiente.");
					
				}
			}
		}while(!op.equalsIgnoreCase("6")); 
		sc.close();
	}

}
