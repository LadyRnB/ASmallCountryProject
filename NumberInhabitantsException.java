
/* To ignore the warning 
"The serializable class CLASSNAME does not declare a static final serialVersionUID......
*/
@SuppressWarnings("serial") 
public class NumberInhabitantsException extends Exception {
	public NumberInhabitantsException() {
		System.out.println("\nYou're trying to instanciate a City class with a negative number of inhabitants!\n\n");
	}
	public NumberInhabitantsException (int nbInhab) {
		System.out.print("\nInstanciation with a negative number of inhabitants => ");
		System.out.println(nbInhab + "\n\n");
	}
}