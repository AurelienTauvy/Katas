package iut.unilim.fr.KataParrot;

public class NorwegianBlueParrot extends Parrot {
	private boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(voltage);
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (this.isNailed) ? 0 : getBaseSpeed(this.voltage);
	}
}
