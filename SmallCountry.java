public class SmallCountry {
	public static void main(String[] args) {
		City c = null;
		try {
			c = new City("re", "France", -12000);
		} catch (NumberInhabitantsException | CityNameException e2) {
			e2.printStackTrace();
			//This method "printStackTrace" helps to understand where the actual problem
			//occurred. it's equivalent to: - System.out.println(e2); -
			System.out.println("\n" + e2.getMessage());
		}

		finally {
			if (c == null)
				c = new City();
		}
		System.out.println(c.toString());
	}
}
