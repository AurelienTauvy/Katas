package iut.unilim.fr.KataParrot;

public abstract class Parrot {
	private static final double BASE_SPEED = 12.0;
	private ParrotTypeEnum type;
	protected double voltage;
	protected boolean isNailed;
	

	public Parrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
		this.type = type;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public abstract double getSpeed();

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	protected double getBaseSpeed() {
		return BASE_SPEED;
	}

}