public class Boat {
	private String name;
	private double height;
	private double length;
	private double width;
	private double chargeRate = 10;
	private double boatValue;

	private Owner owner;
	private SailBoat sailBoat;
	private MotorBoat motorBoat;

	/**
	 * @param name
	 * @param length
	 * @param width
	 * @param boatValue
	 */
	Boat(String name, double length, double height, double width) {
		this.name = name;
		this.length = length;
		this.height = height;
		this.width = width;
	}

	/**
	 * this method is used for setting the boat name
	 * 
	 * @param String name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * this method is used for setting the boat length
	 * 
	 * @param double length
	 * @return void
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * this method is used for setting the boat height
	 * 
	 * @param double height
	 * @return void
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * this method is used for setting the boat width
	 * 
	 * @param double width
	 * @return void
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * this method is used for setting the boat owner
	 * 
	 * @param Owner owner
	 * @return void
	 */
	public void setChargeRate(double chargeRate) {
		this.chargeRate = chargeRate;
	}

	/**
	 * this method is used for setting the boat owner
	 * 
	 * @param Owner owner
	 * @return void
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * this method is used for getting the boat name
	 * 
	 * @param null
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * this method is used for getting the boat length
	 * 
	 * @param null
	 * @return double length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * this method is used for getting the boat height
	 * 
	 * @param null
	 * @return double width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * this method is used for getting the boat width
	 * 
	 * @param null
	 * @return double height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * this method is used for getting the boat owner
	 * 
	 * @param null
	 * @return Owner owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * this method is used for getting the boat charge rate
	 * 
	 * @param null
	 * @return double chaegeRate
	 */
	public double getChargeRate() {
		return chargeRate;
	}

	/**
	 * this method is used for summing height, length, width and charge rate
	 * 
	 * @param null
	 * @return double sum
	 */
	public double sum() {
		return getHeight() * getLength() * getWidth() * getChargeRate();
	}

	/**
	 * this method is used to set motor boat
	 * 
	 * @param MotorBoat motorBoat
	 */
	public void setMotorBoat(MotorBoat motorBoat) {
		this.motorBoat = motorBoat;
	}

	/**
	 * this method used to set sailboat
	 * 
	 * @param SailBoat sailBoat
	 * @return void
	 */
	public void setSailBoat(SailBoat sailBoat) {
		this.sailBoat = sailBoat;
	}

	/**
	 * this method is used for getting the boat value
	 * 
	 * @param null
	 * @return int boatValue
	 */
	public void setBoatValue() {
		if (this.sailBoat != null)
			this.boatValue = (this.sum() + this.sailBoat.totalMonthlyCharge()) * 0.0005;
		else
			this.boatValue = (this.sum() + this.motorBoat.totalMonthlyCharge()) * 0.0005;
	}

	/**
	 * this method is used for getting the boat value
	 * 
	 * @param null
	 * @return int boatValue
	 */
	public double getBoatValue() {
		this.setBoatValue();
		return this.boatValue;
	}

	/**
	 * this method is used to count the total monthly charge for a boat
	 * 
	 * @param null
	 * @return double totalMonthlyCharge
	 */
	public double totalMonthlyCharge() {
		return sailBoat != null ? this.sum() + this.sailBoat.totalMonthlyCharge() + this.getBoatValue()
				: this.sum() + this.motorBoat.totalMonthlyCharge() + this.getBoatValue();
	}
}