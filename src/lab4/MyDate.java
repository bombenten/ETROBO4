package lab4;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public void setDay(int d) {
		day = d;
	}

	public int getDay() {
		return day;
	}

	public void setMonth(int m) {
		month = m;
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getYear() {
		return year;
	}

	public void print() {
		System.out.println(day+ "/"+ month+"/"+year);

	}

}
