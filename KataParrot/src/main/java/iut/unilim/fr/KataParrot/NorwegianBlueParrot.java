package iut.unilim.fr.KataParrot;

public class NorwegianBlueParrot extends Parrot {

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE, voltage, isNailed);
	}

	@Override
	public double getSpeed() {
		return (this.isNailed) ? 0 : getBaseSpeed(this.voltage);
	}
}
