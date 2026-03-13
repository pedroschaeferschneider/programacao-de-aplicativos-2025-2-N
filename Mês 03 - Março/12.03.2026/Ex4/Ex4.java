
public class Ex4 {

	public static void main(String[] args) {

		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		Circulo c4 = new Circulo();

		c1.raio = 1;
		c2.raio = 4;
		c3.raio = 10.5;
		c4.raio = 21.75;

		// Chama o método calcularArea() dos objetos para calcular a área do círculo
		System.out.println("Área do c1: " + c1.calcularArea());
		System.out.println("Área do c2: " + c2.calcularArea());
		System.out.println("Área do c3: " + c3.calcularArea());
		System.out.println("Área do c4: " + c4.calcularArea());

	}

}
