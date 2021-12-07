
public class Day extends Appointment{
	//an app that is held at a certain day every month
	public Day() {
	
	}
	
	public Day(int day, String desc) {
		setDay(day);
		setDesc(desc);
	}
	public Day(int month, int day, int year, String desc) {
		setMonth(month);
		setDay(day);
		setYear(year);
		setDesc(desc);
	}
	
	public boolean occursOn(int day) {
		if(day == getDay()){
			return true;
		}
		else {
			return false;
		}
	}
}
