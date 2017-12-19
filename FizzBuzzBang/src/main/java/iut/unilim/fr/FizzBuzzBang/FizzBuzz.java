package iut.unilim.fr.FizzBuzzBang;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		String chaine = "";
		
		RegleFizz regleFizz = new RegleFizz();
		RegleBuzz regleBuzz = new RegleBuzz();

		if (regleFizz.estVerifieePar(nombre)) {
			chaine += regleFizz.valeurAAfficherSiRegleVerifiee();
		}

		if (regleBuzz.estVerifieePar(nombre)) {
			chaine += regleBuzz.valeurAAfficherSiRegleVerifiee();
		}

		if (chaine == "") {
			return String.valueOf(nombre);
		}
		return chaine;

	}

}