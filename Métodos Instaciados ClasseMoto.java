package aplication;

public class ClasseMoto {
	
	public static void main(String[] args) {
		Moto m1 = new Moto();
		m1.cor ="Azul";
		m1.marca = "Honda";
		m1.modelo = "Twister";
		m1.nroChassi = "909090333333111";
		m1.nroCilindradas = "250";
		m1.nroPlaca = "ABC12C4";
		
		m1.licenciar();
		m1.status();	

	}

}
