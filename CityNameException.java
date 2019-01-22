
@SuppressWarnings("serial")
public class CityNameException extends Exception {
	public CityNameException(){
		System.out.println("\nYou're trying to instanciate a City class with a-less-than-3-character city name!\n\n");
	}
	public CityNameException(String cName) {
		System.out.print("\nInstanciation a City class with a-less-than-3-character city name");
		System.out.println(" => " + cName + "\n");
		/*Or just: - super(cName); - instead of those two lines
		 * When 'super' is used, it allows to use - getMessage(); - to display the error message
		 */
	}

}
