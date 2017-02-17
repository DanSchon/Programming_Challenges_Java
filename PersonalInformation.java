
public class PersonalInformation {
	
	private String name;
	private int age;
	private String address;
	private String phone;

	public PersonalInformation(String nameGiven, int ageGiven, String addressGiven, String phoneGiven) {
		this.setName(nameGiven);
		this.setAge(ageGiven);
		this.setAddress(addressGiven);
		this.setPhone(phoneGiven);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalInformation daniel = new PersonalInformation("Daniel", 25, "123 st.", "305-788-8888");
		System.out.println(daniel.getName() + "\t\t" + daniel.getAge() + "\t\t" + daniel.getAddress() + "\t\t" + daniel.getPhone());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
