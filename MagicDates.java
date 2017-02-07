import javax.swing.JOptionPane;

public class MagicDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int month;
		int year;
		String userStringInput;
		
		userStringInput = JOptionPane.showInputDialog("Enter a day");
		day = Integer.parseInt(userStringInput);
		
		userStringInput = JOptionPane.showInputDialog("Enter a month");
		month = Integer.parseInt(userStringInput);
		
		userStringInput = JOptionPane.showInputDialog("Enter a year");
		year = Integer.parseInt(userStringInput);
		
		if ( (day * month) == year ) {
			JOptionPane.showMessageDialog(null, "The date is magic");
		} else {
			JOptionPane.showMessageDialog(null, "The date is not magic");
		}
		
		System.exit(0);

	}

}
