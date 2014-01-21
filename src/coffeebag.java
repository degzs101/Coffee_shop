
 


public class coffeebag { // create class
	

		private static double bagweight; //declare all variables
		private double numberOfBags;
		public static double pricePerLb = 5.55;
		public static double taxRate = 10.0;
		public coffeebag(){
		
		
	}
	
	
		public void setBagWeight(double Bagweight) {// setup up methods 
		bagweight = Bagweight;
		}
		public void setNumberOfBags(double number) {// methods to set weight and number of bags
		numberOfBags = number;
		}
		public double getBagWeight() {// methods to get number of bags and weight of bags
		return bagweight;
		}
		public double getNumberOfBags() {
		return numberOfBags;
	}
		// end class and methods
}


	

