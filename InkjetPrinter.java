package abstractClass;
/**
 * @author Brittany Pruneau 
 * 
 * Checks, refills and displays the level of ink for a specific model of Inkjet Printer. 
 *
 */

public class InkjetPrinter extends Printer 
{
	/**
	 * @param remainingToner Stores the percentage of ink left in the printer.  
	 */
	private int remainingCartridge;
	
	/**
	 * Constructor initializes the String model, to label the model of Inkjet Printer. 
	 * @param model 
	 */
	public InkjetPrinter(String model) 
	{
		super(model);
		this.remainingCartridge = 100; 
	}
	
	/**
	 * Gets the percentage of ink left in the printer. 
	 * @returns an integer; remainingCartridge. 
	 */
	public int getRemainingCartridge() 
	{
		return remainingCartridge;
	}
	
	/**
	 * Refills the cartridge to 100 percent.   
	 */
	public void refillCartridge()
	{
		this.remainingCartridge = 100; 
	}

	/**
	 * Returns a string of the following format:
	 * {model} is printing. Remaining cartridge: {getRemainingCartridge()} %
	 * Returns a statement letting the user know when the cartridge is empty. 
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public void print() 
	{
		if(remainingCartridge == 0)
		{
			System.out.println("The cartridge is empty.");
		}
		else
		{
			remainingCartridge += -10; 
			System.out.println(super.getModel() + " is printing. Remaining cartridge: " + getRemainingCartridge() +"%");
		}
	}

}
