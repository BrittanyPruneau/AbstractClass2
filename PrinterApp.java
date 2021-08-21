package abstractClass;
/**
 * @author Brittany Pruneau 
 * 
 * Checks, refills and displays the level of ink for a specific model and brand of printer by it's unique serial number. 
 *
 */
public class PrinterApp {

	public static void main(String[] args) 
	{
		InkjetPrinter inkjetPrinter = new InkjetPrinter("Canon TS202"); 
		LaserPrinter laserPrinter = new LaserPrinter("Samsung Xpress"); 
		
		Printer [] printers = {inkjetPrinter, laserPrinter}; 
		for(Printer p : printers)
		{
			System.out.println(p);
			for(int i = 0; i<11; i++)
			{
				p.print(); 
			}
			System.out.println();
			if(p instanceof InkjetPrinter)
	        {
	        	((InkjetPrinter)p).refillCartridge();
	        }
			 
			if(p instanceof LaserPrinter)
	        {
	        	((LaserPrinter)p).refillToner();
	        }
		}
		
		System.out.println("Remaining cartridge after refilling: " + inkjetPrinter.getRemainingCartridge() + "%");
		System.out.println("Remaining cartridge after refilling: " + laserPrinter.getRemainingToner() + "%");
		
	
		
	}

}
