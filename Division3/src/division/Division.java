package division;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	private void run() throws Exception {
		// 割られる数と割る数を読み込む
		DividendAndDivisor input = new DividendAndDivisor();
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("割られる数を入力してください：");
		String dividendString = reader.readLine();
		input.dividend = Integer.parseInt(dividendString);
		System.out.print("割る数を入力してください：");
		String divisorString = reader.readLine();
		input.divisor = Integer.parseInt(divisorString);
		
		// 商と余を計算する
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = input.dividend / input.divisor;
		output.remainder = input.dividend % input.divisor;

		// 割り算の結果を表示する
		System.out.print("商は" + output.quotient + "で余は" + output.remainder + "です");
	}
}
