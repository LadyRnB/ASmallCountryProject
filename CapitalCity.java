
public class CapitalCity extends City {
	private String monument;

	public CapitalCity() {
		super();
		this.monument = "Unknown";
	}

	public CapitalCity(String cityCap, String Countrycap, int nbrInhabCap, String monumentCap) throws NumberInhabitantsException 
	{
		super(cityCap, Countrycap, nbrInhabCap);
		this.monument = monumentCap;
	}

	/**
	 * 
	 * @return String : The name of the monument
	 */
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monumCap) {
		this.monument = monumCap;
	}

	/**
	 * @return String : the Capital city description
  */
	public String cityDescription() {
		String strDescribe = new String();
		strDescribe = super.cityDescription() + "\n\t" + this.monument + " is one of " + this.cityName + " monuments.";
		return strDescribe;
	}
	/*
	 *@see cityDescription which is equivalent to toString
	 */
	public String toString() {
		String strScreen = new String();
		strScreen = "\t ° " + this.cityName + " is located in " + this.countryName + " & the number of its inhabitants is " + this.numberInhabitants + 
				", then it's categorized " + this.category + ". " + this.monument + " is one of " + this.cityName + " monuments.";
		return strScreen;
		}
	}
