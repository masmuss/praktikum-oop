import java.util.ArrayList;

public class Owner {
	private int idNumber;
	private String name;
	private String address;

	/**
	 * array to save the sailboats and motorboats
	 */
	private ArrayList<SailBoat> sailboats;
	private ArrayList<MotorBoat> motorboats;

	/**
	 * @param idNumber
	 * @param name
	 * @param address
	 */
	Owner(String name, String address) {
		this.idNumber = ++BoatStorage.id;
		this.name = name;
		this.address = address;
		this.sailboats = new ArrayList<SailBoat>();
		this.motorboats = new ArrayList<MotorBoat>();
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber
	 *                 the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *             the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *                the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * set owner boats
	 * 
	 * @param boat
	 */
	public void setBoat(Boat boat) {
		if (boat instanceof SailBoat)
			this.sailboats.add((SailBoat) boat);
		else if (boat instanceof MotorBoat)
			this.motorboats.add((MotorBoat) boat);
	}

	/**
	 * get all of owner sailboats
	 * 
	 * @param int id
	 * 
	 * @return SailBoat
	 */
	public SailBoat getSailBoat(int id) {
		return this.sailboats.get(id);
	}

	/**
	 * get all of owner motorboats
	 * 
	 * @param int id
	 * @return MotorBoat
	 */
	public MotorBoat getMotorBoat(int id) {
		return this.motorboats.get(id);
	}

	/**
	 * get arraylist of all sailboats
	 * 
	 * @param null
	 * @return ArrayList<SailBoat>
	 */
	public ArrayList<SailBoat> getAllSailBoats() {
		return this.sailboats;
	}

	/**
	 * get arraylist of all motorboats
	 * 
	 * @param null
	 * @return ArrayList<MotorBoat>
	 */
	public ArrayList<MotorBoat> getAllMotorBoats() {
		return this.motorboats;
	}

	/**
	 * count assurance of all boats
	 * 
	 * @return double
	 */
	public double assurance() {
		double total = 0;
		for (int i = 0; i < this.sailboats.size(); i++)
			total += this.sailboats.get(i).warehouseRent();
		for (int i = 0; i < this.motorboats.size(); i++)
			total += this.motorboats.get(i).warehouseRent();
		return total;
	}

	/**
	 * this method prints the owner's details
	 */
	public void printOwnerDetails() {
		System.out.println("Owner's id number: " + idNumber);
		System.out.println("Owner's name: " + name);
		System.out.println("Owner's address: " + address);
	}
}
