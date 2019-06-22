package lab4;

public class MyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDay(16);
		d1.setMonth(12);
		d1.setYear(2002);
		d1.print(); // 16/12/2002
		d1.setDay(12);
		d1.setMonth(06);
		d1.setYear(2001);
		d1.print();
	}

}
