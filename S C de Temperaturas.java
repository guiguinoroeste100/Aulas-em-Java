package entities;

public class main {

	public static void main(String[] args) {
		{ double C, K, F, Re, Ra;
		C = 15;
		F = C * 1.8 + 32;
		K = C + 273.15;
		Ra = C * 1.8 + 32 + 459.67;
		Re = C * 0.8;
		System.out.print("A temperatura em Farenheit é: " + F);
		System.out.print("A temperatura em Kelvin é: " + K);
		System.out.print("A temperatura em Reaumur é: " + Ra);
		System.out.print("A temperatura em Rankine é: " + Re);
		}
		

	}

}
