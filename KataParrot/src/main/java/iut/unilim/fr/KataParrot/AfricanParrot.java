package iut.unilim.fr.KataParrot;

public class AfricanParrot extends Parrot {

	private static final double BASE_LOAD_FACTOR = 9.0;
	private int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		super();
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - BASE_LOAD_FACTOR * this.numberOfCoconuts);
	}
	
	private double getBaseSpeed() {
		return BASE_SPEED;
	}
}
