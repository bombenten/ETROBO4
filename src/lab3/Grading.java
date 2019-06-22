package lab3;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		int s;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("ใส่คะแนนที่ต้องการคิดเกรด");
			s = sc.nextInt();
			if (s > 100) {
				System.out
						.println("การคิดเกรดผิดพลาด คะแนนที่คุณใส่มีมากเกินไป");
			} else if (s >= 90) {
				System.out.println("A");
			} else if (s >= 80) {
				System.out.println("B");
			} else if (s >= 70) {
				System.out.println("C");
			} else if (s >= 60) {
				System.out.println("D");
			} else if (s >= 1) {
				System.out.println("F");
			} else {
				System.out.println("การคิดเกรดผิดพลาด คะแนนที่คุณใส่มีน้อยเกินไป");

			}
		}
	}
}
