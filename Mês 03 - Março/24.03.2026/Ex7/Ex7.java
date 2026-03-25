
public class Ex7 {

	public static void main(String[] args) {

		// Instanciação dos objetos de aeronave pelo seus construtores
		Aeronave a1 = new Aeronave("Boeing 747", 200, 700, 2000, 10);
		Aeronave a2 = new Aeronave("Airbus", 300, 600, 1000, 15);
		Aeronave a3 = new Aeronave("Cesna", 1, 200, 200, 1);
		Aeronave a4 = new Aeronave("Boeing 777", 390, 945, 1800, 20);

		Aeronave listaAeronaves[] = { a1, a2, a3, a4 };

		// Qual aeronave leva o maior número de passageiros?
		int maiorPassageiros = 0;
		Aeronave aeronaveMaisPassageiros = null;

		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].passageiros > maiorPassageiros) {
				maiorPassageiros = listaAeronaves[i].passageiros;
				aeronaveMaisPassageiros = listaAeronaves[i];
			}
		}

		System.out.println(aeronaveMaisPassageiros);

		// Qual das aeronaves pode ficar mais tempo no ar?
		double maiorTempoAr = 0;
		Aeronave aeronaveMaisTempoNoAr = null;
		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].calcularAutonomia() > maiorTempoAr) {
				maiorTempoAr = listaAeronaves[i].calcularAutonomia();
				aeronaveMaisTempoNoAr = listaAeronaves[i];
			}
		}

		System.out.println(aeronaveMaisTempoNoAr);

		// qual deles consegue voar mais longe?
		double maisLonge = 0;
		Aeronave aeronaveMaisLonge = null;

		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].calcularDistancia() > maisLonge) {
				maisLonge = listaAeronaves[i].calcularDistancia();
				aeronaveMaisLonge = listaAeronaves[i];
			}
		}

		System.out.println(aeronaveMaisLonge);

	}

}
