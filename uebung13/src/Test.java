/**
 * Copyright by Martin Weidner (martin.weidner@student.kit.edu) and
 * 				Sebastian Schlag (sebastian.schlag@student.kit.edu
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt = 1;
		int cnt2 = 6;
		for (int i = 1; i <= 67; i++) {
			// System.out.println(cnt + " - "+cnt2);
			for (int j = 0; j < 60; j++) {
				System.out.println(cnt + " - " + cnt2);
			}
			cnt = cnt2 + 1;
			cnt2 = cnt + 5;
		}
	}

}
