package iut.unilim.fr.FizzBuzzBang;

public class Fizz extends Regle {

	@Override
	public boolean isInterestedIn(Integer nombre) {
		return 0 == nombre % 3;
	}

	@Override
	public String getKeyWord() {
		return "fizz";
	}

}