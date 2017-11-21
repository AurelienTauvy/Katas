package iut.unilim.fr.KataParrot;

public class NorwegianBlueParrot extends Parrot {
	private static final double SPEED_MAX = 24.0;
	private boolean isNailed;
	private double voltage;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super();
		this.isNailed = isNailed;
		this.voltage = voltage;
	}

	@Override
	public double getSpeed() {
		if (isNailed)
			return 0;
		else
			return getBaseSpeed(this.voltage);
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(SPEED_MAX, voltage * BASE_SPEED);
	}
}
