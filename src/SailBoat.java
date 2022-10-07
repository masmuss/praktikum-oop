public class SailBoat extends Boat {
	private double mastHeight;
	private double sailArea;
	private SailBoat sailBoat;

	/**
	 * tax rate for sail boats is 5%
	 */
	private double tax = 0.05;

	/**
	 * @param length
	 * @param height
	 * @param width
	 * @param boatValue
	 * @param mastHeight
	 * @param sailArea
	 */
	SailBoat(String name, double length, double height, double width, int mastHeight, int sailArea) {
		super(name, length, height, width);
		this.mastHeight = mastHeight;
		this.sailArea = sailArea;
		BoatStorage.sailBoatCount++;
	}

	/**
	 * this method is used to set mast height
	 * 
	 * @param double mastHeight
	 */
	public void setMastHeight(double mastHeight) {
		this.mastHeight = mastHeight;
	}

	/**
	 * this method is used to set sail area
	 * 
	 * @param double sailArea
	 */
	public void setSailArea(double sailArea) {
		this.sailArea = sailArea;
	}

	/**
	 * this method used to get mast height
	 * 
	 * @return double mastHeight
	 */
	public double getMastHeight() {
		return this.mastHeight;
	}

	/**
	 * this method used to get sail area
	 * 
	 * @return double sailArea
	 */
	public double getSailArea() {
		return this.sailArea;
	}

	/**
	 * this method used to get sailboat
	 * 
	 * @return SailBoat sailBoat
	 */
	public SailBoat getSailBoat() {
		return this.sailBoat;
	}

	/**
	 * this method counts the total monthly charge for a sailboat
	 * 
	 * @see Boat#totalMonthlyCharge()
	 * @return the total monthly charge
	 */
	@Override
	public double totalMonthlyCharge() {
		setSailBoat(this);
		return (mastHeight * sailArea) * tax;
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
