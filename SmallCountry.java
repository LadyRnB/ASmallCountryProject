public class SmallCountry {
	public static void main(String[] args) {
		try { 
			City c = new City("Rennes", "France", 12000);
			System.out.println(c.cityDescription());
	}
		catch(NumberInhabitantsException nbInhExcep) {
	}
}}
