
public class DaysInAMonth {
	
	private int month;
	private int year;
	
	public int getDaysOfMonth() {
		int days = 0;
		switch(this.month) {
		case 1:
			days = 31;
			break;
		case 2:
			if(this.year % 100 == 0 && this.year % 400 == 0) {
				days = 29;
				break;
			} else if(this.year % 4 == 0) {
				days = 29;
				break;
			} else {
				days = 28;
				break;
			}
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 9 :
			days = 31;
			break;
		case 10:
			days = 31;
			break;
		case 11: 
			days = 30;
			break;
		case 12:
			days = 31;
			break;
		}
		return days;
	}
	
	public DaysInAMonth(int monthGiven, int yearGiven) {
		this.month = monthGiven;
		this.year = yearGiven;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int month = 2;
		int year = 2008;
		DaysInAMonth o = new DaysInAMonth(month, year);
		result = o.getDaysOfMonth();
		System.out.println(result);
	}

}
