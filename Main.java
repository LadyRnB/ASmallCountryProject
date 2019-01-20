
public class Main {
	public static void main(String[] args) {
		
		City city1 = new City("São Paulo", "Brazil", 1211000000);
		
		

		System.out.println("The number of cities we've created is: " + city1.numberInstancesPublic + " (public counter)");// to access a public class variable
		System.out.println("The number of cities we've created is: " + city1.getNbrInstances() + " (public counter)"); // to access a private class variable
		
		System.out.println("The first City is: " + city1.getNameCity() + ", & it's located in " + city1.getNameCountry());
		System.out.println("The number of its inhabitants is: " + city1.getNbInhabitants());
		
		City city2 = new City("Marseille", "France", 1059000);
		System.out.println("The number of cities we've created is: " + city2.numberInstancesPublic + " (public counter)");
		System.out.println("The number of cities we've created is: " + city2.getNbrInstances() + " (private counter)");
		System.out.println("The second City is: " + city2.getNameCity() + ", & it's located in " + city2.getNameCountry());
		System.out.println("The number of its inhabitants is: " + city2.getNbInhabitants());
		
		City city3 = new City("Köln", "Germany", 1046680);
		System.out.println("The number of cities we've created is: " + city3.numberInstancesPublic + " (public counter)");
		System.out.println("The number of cities we've created is: " + city3.getNbrInstances() + " (public counter)");
		System.out.println("The third City is: " + city3.getNameCity() + ", & it's located in " + city3.getNameCountry());
		System.out.println("The number of its inhabitants is: " + city3.getNbInhabitants());
		System.out.println();

		/**
		 * To interchange the two cities city1 & city2
		 * An intermediate variable is used to do that
		 */
		City temporary = new City();
		temporary = city1;
		city1 = city2 ;
		city2 = temporary;
		System.out.println("The first City is: " + city1.getNameCity() + ", & it's located in " + city1.getNameCountry() + ".");
		System.out.println("The number of its inhabitants is: " + city1.getNbInhabitants() + ".\n");
		System.out.println("The second City is: " + city2.getNameCity() + ", & it's located in " + city2.getNameCountry() + ".");
		System.out.println("The number of its inhabitants is: " + city2.getNbInhabitants() + ".\n");
		System.out.println("The third City is: " + city3.getNameCity() + ", & it's located in " + city3.getNameCountry() + ".");
		System.out.println("The number of its inhabitants is: " + city3.getNbInhabitants() + ".\n");
	
	/**
	 * To change the names of the two cities city1 & city2
	 * We use setters
	 */
	city1.setNameCity("Honk Kong");
	city2.setNameCity("Tatooine");
	System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	System.out.println("\nThe first City is: " + city1.getNameCity() + ", & it's located in " + city1.getNameCountry() + ".");
	System.out.println("The number of its inhabitants is: " + city1.getNbInhabitants() + ".\n");
	System.out.println("The second City is: " + city2.getNameCity() + ", & it's located in " + city2.getNameCountry() + ".");
	System.out.println("The number of its inhabitants is: " + city2.getNbInhabitants() + ".\n");
	
	/**
	 * To change the parameters of those two cities
	 * since they are inconsistent
	 * (e.g. Hong Kong is a city located in China & not in France)
	 */
	city1.setNameCountry("China");
	city1.setNbInhabitants(7392000);
	city2.setNameCountry("Tunisia");
	city2.setNbInhabitants(67291);
	System.out.println("|**Rectification**|");
	System.out.println("\nThe first City is: " + city1.getNameCity() + ", & it's located in " + city1.getNameCountry() + ".");
	System.out.println("The number of its inhabitants is: " + city1.getNbInhabitants() + ".\n");
	System.out.println("The second City is: " + city2.getNameCity() + ", & it's located in " + city2.getNameCountry() + ".");
	System.out.println("The number of its inhabitants is: " + city2.getNbInhabitants() + ".\n");
	System.out.println("______\nSo ...");
	System.out.println(city1.cityDescription());
	System.out.println(city2.cityDescription());
	System.out.println(city3.cityDescription());
	System.out.println();
	System.out.println(city2.compareCities(city1));
	System.out.println(city2.compareCities(city3));
	
	CapitalCity cap = new CapitalCity();
	System.out.println(cap.cityDescription());
	}
}