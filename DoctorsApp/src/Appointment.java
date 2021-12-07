
public class Appointment {
	private int month;
	private int day;
	private int year;
	private String desc;

	public Appointment() {
		
	}
	
	public Appointment(int month, int day, int year, String desc){
		this.month = month;
		this.day = day;
		this.year = year;
		this.desc = desc;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean occursOn(int day) {
		return false;
	}
	
	public boolean occursOn(int month, int day) {
		return false;
	}
	
	public boolean occursOn(int month, int day, int year) {
		return false;
	}
}
