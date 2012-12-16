package division;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	private void run() throws Exception {
		DividendAndDivisor input = input();
		QuotientAndRemainder output = process(input);
		output(output);
	}

	// 割られる数と割る数を読み込む
	private DividendAndDivisor input() throws IOException {
		DividendAndDivisor input = new DividendAndDivisor();
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("割られる数を入力してください：");
		String dividendString = reader.readLine();
		input.dividend = Integer.parseInt(dividendString);
		System.out.print("割る数を入力してください：");
		String divisorString = reader.readLine();
		input.divisor = Integer.parseInt(divisorString);
		return input;
	}

	// 商と余を計算する
	private QuotientAndRemainder process(DividendAndDivisor input) {
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = input.dividend / input.divisor;
		output.remainder = input.dividend % input.divisor;
		return output;
	}

	// 割り算の結果を表示する
	private void output(QuotientAndRemainder output) {
		System.out.print("商は" + output.quotient
				+ "で余は" + output.remainder + "です");
	}
}
