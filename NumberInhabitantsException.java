
/* To ignore the warning 
"The serializable class ClASSNAME does not declare a static final serialVersionUID......
*/
@SuppressWarnings("serial") 
public class NumberInhabitantsException extends Exception {
	public NumberInhabitantsException() {
		System.out.println("You're trying to instanciate a City class with a negative number of inhabitants!");
	}
}
