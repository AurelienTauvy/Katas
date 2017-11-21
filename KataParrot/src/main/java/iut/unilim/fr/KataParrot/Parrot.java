package iut.unilim.fr.KataParrot;

public abstract class Parrot {
	protected static final double BASE_SPEED = 12.0;
	protected double voltage;
	

	public Parrot(double voltage) {
		this.voltage = voltage;
	}

	public abstract double getSpeed();

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}
}