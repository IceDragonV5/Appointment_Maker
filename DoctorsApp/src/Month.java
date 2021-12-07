
public class Month extends Appointment{
	//an app that is held on a certain day, in a certain month annually
	public Month() {
		
	}
	
	public Month(int month, int day) {
		setMonth(month);
		setDay(day);
	}
	
	public Month(int month, int day, String desc) {
		setMonth(month);
		setDay(day);
		setDesc(desc);
	}
	
	public boolean occursOn(int month, int day) {
		if(month == getMonth()){
			return true;
		}
		else {
			return false;
		}
	}
}
