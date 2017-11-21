package iut.unilim.fr.KataParrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(0);
	}
	
	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

}
