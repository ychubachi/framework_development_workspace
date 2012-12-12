package division;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	private void run() throws Exception {
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("割られる数を入力してください：");
		String dividendString = reader.readLine();
		int dividend = Integer.parseInt(dividendString);
		System.out.print("割る数を入力してください：");
		String divisorString = reader.readLine();
		int divisor = Integer.parseInt(divisorString);
		System.out.print("商は" + dividend / divisor
				+ "で余は" + dividend % divisor + "です");
	}
}
