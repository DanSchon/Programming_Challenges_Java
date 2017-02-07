
public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String employeeName, int employeeIdNumber, String employeeDepartment, String employeePosition) {
		setName(employeeName);
		setIdNumber(employeeIdNumber);
		setDepartment(employeeDepartment);
		setPosition(employeePosition);
	}
	
	public Employee(String employeeName, int employeeIdNumber) {
		setName(employeeName);
		setIdNumber(employeeIdNumber);
		setDepartment("");
		setPosition("");
	}
	
	public Employee() {
		setName("");
		setIdNumber(0);
		setDepartment("");
		setPosition("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Daniel Jones", 0002);
		Employee employee3 = new Employee("John Smith", 0003, "Engineering", "Engineer");
		
		employee1.setName( "Angie Samuels" );
		employee1.setIdNumber( 0001 );
		employee1.setDepartment( "Marketing" );
		employee1.setPosition( "Marketing Specialist" );
		
		employee2.setDepartment( "Accounting" );
		employee2.setPosition( "Accountant" );
		
		System.out.println("Name\t\tID\t\tDepartment\t\tPosition");
		System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t" + employee1.getDepartment() + "\t\t" + employee1.getPosition());
		System.out.println(employee2.getName() + "\t" + employee2.getIdNumber() + "\t\t" + employee2.getDepartment() + "\t\t" + employee2.getPosition());
		System.out.println(employee3.getName() + "\t" + employee3.getIdNumber() + "\t\t" + employee3.getDepartment() + "\t\t" + employee3.getPosition());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
