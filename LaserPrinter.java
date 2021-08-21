package abstractClass;
/**
 * @author Brittany Pruneau 
 * 
 * Checks, refills and displays the level of ink for a specific model of Laser Printer. 
 *
 */
public class LaserPrinter extends Printer 
{
	/**
	 * @param remainingToner Stores the percentage of toner left in the printer.  
	 */
	private int remainingToner;
	
	/**
	 * Constructor initializes the String model, to label the type of printer. 
	 * @param model 
	 */
	public LaserPrinter(String model) // not sure if we intialize remainingToner here or in the field? or 
	{
		super(model);
		this.remainingToner = 100;  // not sure if we want to initialize it here or in the private field. ? 
	}
	
	/**
	 * Gets the percentage of toner left in the printer. 
	 * @returns an integer; remainingToner. 
	 */
	public int getRemainingToner() 
	{
		return remainingToner;
	}
	
	/**
	 * Refills the toner to 100 percent.   
	 */
	public void refillToner()
	{
		this.remainingToner = 100; 
	}
	/**
	 * Returns a string of the following format:
	 * {model} is printing. Remaining toner:{getRemainingToner()} %}
	 * Returns a statement letting the user know when the cartridge is empty. 
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public void print() 
	{
		if(remainingToner == 0)
		{
			System.out.println("The toner is empty.");
		}
		else
		{
			remainingToner += -10; 
			System.out.println(super.getModel() + " is printing. Remaining toner: " + getRemainingToner() +"%");
		}
	}

}
