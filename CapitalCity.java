
public class CapitalCity extends City {
	private String monument;

	public CapitalCity() {
		super();
	}

	public CapitalCity(String cityCap, String Countrycap, int nbrInhabCap, String monumentCap) {
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
}
