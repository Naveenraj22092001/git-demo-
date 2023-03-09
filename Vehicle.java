public class Vehicle{
	int tyres;
	private PetrolEngine pE;
	public static void main(String[] args) {
		PetrolEngine pe = new PetrolEngine();
		pe.start();
		
		DieseEngine de = new DieseEngine();
		de.start();
		
		Vehicle v = new Vehicle();
		v.tyres;
	}
}