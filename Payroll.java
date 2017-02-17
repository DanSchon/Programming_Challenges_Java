
public class Payroll {
	
	private String name;
	private int id;
	private double hourlyPay;
	private int hoursWorked;

	public Payroll(String nameGiven, int idGiven) {
		this.setName(nameGiven);
		this.setId(idGiven);
		this.setHourlyPay(0.0);
		this.setHoursWorked(0);
	}
	
	public double calculatePayRoll() {
		return this.hourlyPay * this.hoursWorked;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll p = new Payroll("Dan", 1234);
		p.setHourlyPay(30.0);
		p.setHoursWorked(8);
		System.out.println(String.format("%s has a payroll of $%,.2f", p.getName(), p.calculatePayRoll()));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
