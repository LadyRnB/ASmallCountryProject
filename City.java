
public class City {
	/*
	 * The instance variables/methods were public, we changed their access modifier 
	 * to private so they can be accessed only from inside the same class
	 * & then to protected just so they can be used by a subclass
	 */
	
	protected String cityName;
	protected String countryName;
	protected int numberInhabitants;
	char category;
	
	// This class variables used to count the number of cities (= instances) we've created
	protected static int numberInstancesPrivate = 0;
	public static int numberInstancesPublic = 0;

	public City() {// Default constructor
		System.out.println("The creation of a city!");
		System.out.println("**********************");
		cityName = "The name of this city is: Unknown!";
		countryName = "The name of the country is: Unknown!";
		numberInhabitants = 0;
		this.setcategory();
		
		numberInstancesPrivate++;
		numberInstancesPublic++;
		
	}

	public City(String cityN, String countryN, int nbrInhabitants) { // Constructor with parameters
		System.out.println("\nThe creation of a new city (Instance)");
		System.out.println("-------------------------------------");

		cityName = cityN;
		countryName = countryN;
		numberInhabitants = nbrInhabitants;
		this.setcategory();
		
		numberInstancesPrivate++;
		numberInstancesPublic++;
		
	}

	public String getNameCity() {
		return cityName;
	}

	public String getNameCountry() {
		return countryName;
	}

	public int getNbInhabitants() {
		return numberInhabitants;
	}

	public void setNameCity(String nameCit) {
		cityName = nameCit;
	}

	public void setNameCountry(String nameCtry) {
		countryName = nameCtry;
	}

	public void setNbInhabitants(int nbInhab) {
		numberInhabitants = nbInhab;
		this.setcategory(); // The category changes according to the number of inhabitants
	}

	public char getcategory() {
		return category;
	}

	/**
	 * The category depends on the number of inhabitants This method just updates
	 * the class variable 'category'
	 */
	
	
	private void setcategory() { 
		/* We change the access modifier (visibility) of this 
		method from public to private  so we can "just call it", no modification from outside the class
		*/
								
		int[] upperLimit = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char[] categories = { '/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		int i = 0;
		while (i < upperLimit.length && this.numberInhabitants > upperLimit[i]) {
			i++;
			this.category = categories[i];
		}
	}

	/**
	 * 
	 * @return String the description of a city
	 */
	public String cityDescription() {
		String strDescribe = new String();
		strDescribe = "\t ° " + this.cityName + " is located in " + this.countryName + ", & the "
				+ "number of its inhabitants is " + this.numberInhabitants + ", then it's categorized " + this.category
				+ ".";
		return strDescribe;
	}

	public String compareCities(City cityX) {
		String strCompare = new String();
		if (cityX.getNbInhabitants() > this.numberInhabitants) {
			strCompare = "=> " + cityX.cityName + " is more populated than " + this.cityName + ".";
		} else
			strCompare = "=> " + this.cityName + " is more populated than " + cityX.cityName + ".";
		return strCompare;
	}

	public static int getNbrInstances() {
		return numberInstancesPrivate;
	}

}
