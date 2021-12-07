
public class OneTime extends Appointment{
	//an app that occurs only once on a given date
	public OneTime() {
		
	}
	public OneTime(int month, int day, int year, String desc) {
		setMonth(month);
		setDay(day);
		setYear(year);
		setDesc(desc);
	}
	
	public boolean occursOn(int month, int day, int year) {
		if(month == getMonth() && day == getDay() && year == getYear()){
			return true;
		}
		else {
			return false;
		}
	}
	
}