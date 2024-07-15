package Application;

public class Circulo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo ();
		Circulo c2 = new Circulo ();
		
		System.out.println("Raio de c1: "+c1.getRaio());
		System.out.println("Cor do circulo: "+c1.getClass());
		
		c2.setRaio(5.0f);
		c2.setCor("azul");
		
		System.out.println("Raio de c2: "+c2.getRaio());
		System.out.println("Cor do circulo: "+c2.getClass());
				
	}

	private void setRaio(float f) {
		// TODO Auto-generated method stub
		
	}

	private String getRaio() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setCor(String string) {
		// TODO Auto-generated method stub
		
	}



}

