import javax.swing.JOptionPane;

public class RetailPriceCalculator {
	
	public static double calculateRetailPrice( double wholeSaleCostGiven, double markupPercentagegiven ) {
		double retailPrice;
		retailPrice = wholeSaleCostGiven + (wholeSaleCostGiven * (markupPercentagegiven / 100));
		return retailPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput;
		double wholeSaleCost;
		double markupPercentage;
		double calculatedPrice;
		
		userInput = JOptionPane.showInputDialog( "Please enter the whole sale cost of the item");
		wholeSaleCost = Double.parseDouble(userInput);
		
		userInput = JOptionPane.showInputDialog( "Please enter the markup percentage of the item");
		markupPercentage = Double.parseDouble(userInput);
		
		calculatedPrice = calculateRetailPrice(wholeSaleCost, markupPercentage);
		
		System.out.println(calculatedPrice);

	}

}
