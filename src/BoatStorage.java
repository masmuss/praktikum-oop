public class BoatStorage {
	public static int id;
	public static int sailBoatCount = 0;
	public static int motorBoatCount = 0;

	public static void main(String[] args) {
		Owner owner1 = new Owner("John", "123 Main St");
		Owner owner2 = new Owner("Doe", "124 Main St");

		SailBoat goingMerry = new SailBoat("Going Merry", 30, 20, 10, 10, 1000);
		owner1.setBoat(goingMerry);
		SailBoat blackPearl = new SailBoat("Black Pearl", 30, 20, 10, 10, 1000);
		owner1.setBoat(blackPearl);
		SailBoat flyingDutchman = new SailBoat("Flying Dutchman", 30, 20, 10, 10, 1000);
		owner1.setBoat(flyingDutchman);

		MotorBoat motorBoat1 = new MotorBoat("Motor Boat 1", 30, 20, 10, 250);
		owner2.setBoat(motorBoat1);
		MotorBoat motorBoat2 = new MotorBoat("Motor Boat 2", 30, 20, 10, 250);
		owner2.setBoat(motorBoat2);

		showOwners(owner1);
		showOwners(owner2);

		System.out.println("\nTotal biaya pemilik " + owner1.getIdNumber() + " adalah $" + owner1.assurance());
		System.out.println("Total biaya pemilik " + owner2.getIdNumber() + " adalah $" + owner2.assurance());
		System.out.println("Total Sail Boat : " + BoatStorage.sailBoatCount);
		System.out.println("Total Motor Boat : " + BoatStorage.motorBoatCount);
		System.out.println("Total jumlah kapal : " + (BoatStorage.sailBoatCount + BoatStorage.motorBoatCount));

		// soal no 5
		System.out.printf("\nTotal biaya seluruh kapal di gudang adalah $%.2f",
				(owner1.assurance() + owner2.assurance()));

		// soal no 7
		owner1.getAllSailBoats().get(motorBoatCount - 1).setName("Black Hawk");
		System.out.println("\nNama kapal pemilik " + owner1.getIdNumber() + " setelah di ganti : "
				+ owner1.getAllSailBoats().get(motorBoatCount - 1).getName());
	}

	public static void showOwners(Owner owner) {
		for (int i = 0; i < owner.getAllSailBoats().size(); i++) {
			System.out.println("\n>>> Pemilik " + owner.getIdNumber());
			System.out.println("Nama Kapal: " + owner.getSailBoat(i).getName());
			System.out.println("Nama Pemilik: " + owner.getName());
			System.out.println("Alamat Pemilik: " + owner.getAddress());
			// soal no 3
			System.out.println("Total Biaya layar: $" + owner.getSailBoat(i).totalMonthlyCharge());
			System.out.println("total Asuransi: $" + owner.getSailBoat(i).assurance());
			System.out.println("Total Biaya gudang: $" + owner.getSailBoat(i).warehouseRent());
		}
		for (int i = 0; i < owner.getAllMotorBoats().size(); i++) {
			System.out.println("\n>>> Pemilik " + owner.getIdNumber());
			System.out.println("Nama Kapal: " + owner.getMotorBoat(i).getName());
			System.out.println("Nama Pemilik: " + owner.getName());
			System.out.println("Alamat Pemilik: " + owner.getAddress());
			// soal no 3
			System.out.println("Total Kebakaran: $" + owner.getMotorBoat(i).totalMonthlyCharge());
			System.out.println("total Asuransi: $" + owner.getMotorBoat(i).assurance());
			System.out.println("Total Biaya Gudang: $" + owner.getMotorBoat(i).warehouseRent());
		}
	}
}
