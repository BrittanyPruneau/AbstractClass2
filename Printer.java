package abstractClass;
/**
 * @author Brittany Pruneau 
 * 
 * Checks, refills and displays the level of ink for a specific model and brand of printer by it's unique serial number. 
 *
 */
public abstract class Printer 
{
	/**
	 * @param count Assists in the creation of the unique serial Number 
	 * @param serialNumber Stores a unique ID for a specific model of printer. 
	 */
	private String model; 
	private static int count = 0; 
	private int serialNumber;
	
	/**
	 * Initializes the model of printer. 
	 * @param model
	 */
	public Printer(String model) 
	{
		this.model = model;
		count++;
		this.serialNumber = 12345 + count; 
	}

	/**
	 * Returns the specific model printer. 
	 * @returns a String; the model of printer. 
	 * 
	 */
	public String getModel() 
	{
		return model;
	}

	/**
	 * Gets the serial number of the printer. 
	 * @returns an integer; the serial number of the printer. 
	 */
	public int getSerialNumber() 
	{
		return serialNumber;
	} 
	
	/**
	 * Prints the amount of ink left in the specific model of printer. 
	 * Takes 10 percent from the amount of ink available. 
	 */
	public abstract void print();   /// ??? what does print return? 

	/**
	 * Returns a string of the following format:
	 * {className}: {model} #{serialNumber}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()   // probably changing this 
	{
		return  this.getClass().getSimpleName() + ": " + model + " #" + serialNumber;
	}
	
	
}
