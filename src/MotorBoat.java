public class MotorBoat extends Boat {
	private double horsePower;
	/**
	 * tax rate for motor boats is 10%
	 */
	private double tax = 0.1;

	private MotorBoat motorBoat;

	/**
	 * @param name
	 * @param length
	 * @param height
	 * @param width
	 * @param horsePower
	 */
	MotorBoat(String name, double length, double height, double width, double horsePower) {
		super(name, length, height, width);
		this.horsePower = horsePower;
		BoatStorage.motorBoatCount++;
	}

	/**
	 * this method is used to get motor boat
	 * 
	 * @param null
	 * @return MotorBoat motorBoat
	 */
	public MotorBoat getMotorBoat() {
		return this.motorBoat;
	}

	/**
	 * this method counts the total monthly charge for a motorboat
	 * 
	 * @see Boat#totalMonthlyCharge()
	 * @return the total monthly charge
	 */
	@Override
	public double totalMonthlyCharge() {
		setMotorBoat(this);
		return this.horsePower * tax;
	}

	/**
	 * this method is used to call totalMothlyCharge method from parent
	 * 
	 * @return double totalMonthlyCharge
	 */
	public double warehouseRent() {
		return super.totalMonthlyCharge();
	}

	/**
	 * this method is used to get assurance
	 * 
	 * @return double assurance
	 */
	public double assurance() {
		return super.getBoatValue();
	}
}
