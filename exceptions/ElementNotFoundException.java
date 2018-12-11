//package package-name.exceptions;

public class ElementNotFoundException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 *
	 * @param collection String representing the name of the collection
	 */
	public ElementNotFoundException (String collection)
	{
		super ("The target element is not in this " + collection);
	}
}