package iut.unilim.fr.KataParrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super();
	}
	
	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

	private double getBaseSpeed() {
		return BASE_SPEED;
	}
}
