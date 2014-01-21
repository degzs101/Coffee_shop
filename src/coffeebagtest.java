import java.util.Scanner; // import scanner


public class coffeebagtest {// create a new class

		public static void main(String [] args) {

		
			//initialise 
		coffeebag bag = new coffeebag();
		
		
		double totalPriceWithTax; //declare all variables
		double totalPrice;
		int inputBags ;
		double inputWeight;
	
		
		Scanner scan = new Scanner(System.in);// setup scanner
		System.out.print ( " Enter the weight of coffee sold ");// ask user for weight
		inputBags  = scan.nextInt();
		bag.setNumberOfBags(inputBags);
		System.out.print (" Enter amount bags sold ");// enter amount of bags
		inputWeight= scan.nextDouble();
		bag.setBagWeight(inputWeight);
		
		// do the calculation and print out results
		totalPrice =  (double) (bag.getBagWeight() * bag.getNumberOfBags() *  coffeebag.pricePerLb ) ;
		totalPriceWithTax =  (double)totalPrice  + totalPrice *  coffeebag.taxRate;
		System.out.println("price per bag € " + coffeebag.pricePerLb);
		System.out.println ("sales tax " + coffeebag.taxRate + " %");
		System.out.println( "total price is € : " + totalPriceWithTax  );

		}

}
