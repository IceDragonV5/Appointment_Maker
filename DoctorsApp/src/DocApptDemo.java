import java.util.*;
public class DocApptDemo {

	public static void main(String[] args) {
		
		String hasApps = "";
		ArrayList<Appointment> apps = new ArrayList<>();
		
		Appointment a = new OneTime(9, 23, 2018, "test");
		Appointment b = new OneTime(1, 1, 1900, "aaaaaa");
		Appointment c = new OneTime(9, 23, 2018, "copy");
		Appointment d = new OneTime(4, 21, 2019, "J's_B-Day");
		Appointment e = new OneTime(8, 27, 2019, "A's_B-Day");
		Appointment f = new OneTime(5, 4, 3210, "010101");
		Appointment g = new OneTime(1, 1, 2000, "bbbbbb");
		Month m1 = new Month(10,31, "spooky");
		Month m2 = new Month(10,30, "less_spooky");
		Month m3 = new Month(12, 25, "santa");
		Month m4 = new Month(1,1, "new_year");
		Day d1 = new Day(1, "start");
		Day d2 = new Day(27, "end");
		Day d3 = new Day(15, "ides");
		Day d4 = new Day(7, "lucky");
		Day d5 = new Day(23, "due");
		
		apps.add(a);
		apps.add(b);
		apps.add(c);
		apps.add(d);
		apps.add(e);
		apps.add(f);
		apps.add(g);
		apps.add(m1);
		apps.add(m2);
		apps.add(m3);
		apps.add(m4);
		apps.add(d1);
		apps.add(d2);
		apps.add(d3);
		apps.add(d4);
		
		
		System.out.println("Please enter a month.");
		Scanner input = new Scanner(System.in);
		int mo = input.nextInt();
		System.out.println("Please enter a day.");
		int da = input.nextInt();
		System.out.println("Please enter a year.");
		int ye = input.nextInt();
		
		for(int i = 0; i < apps.size(); i++) {
			if (apps.get(i).occursOn(mo, da, ye)) {
				hasApps = hasApps + apps.get(i).getDesc() + " one time, ";
				}
			else if (apps.get(i).occursOn(mo, da)) {
				hasApps = hasApps + apps.get(i).getDesc() + " monthly, ";
			}
			else if (apps.get(i).occursOn(da)) {
				hasApps = hasApps + apps.get(i).getDesc() + " daily, ";
			}
		}
		
		if (hasApps.isEmpty()) {
			hasApps = "There are no appointments at this date.  ";
		}
		
		hasApps = hasApps.substring(0, hasApps.length()-2);	
		
		System.out.println(hasApps);
		
		//System.out.println(a.occursOn(mo,da,ye));
		//System.out.println(dayTest.occursOn(da));
		
		
		
	}

}

