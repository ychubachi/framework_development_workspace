import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Division extends Framework {
	public static void main(String[] args) throws Exception {
		Framework division = new Division();
		division.run();
	}
	
	// 割られる数と割る数を読み込む
	Input input() throws IOException {
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
	Output process(Input input) {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = dad.dividend / dad.divisor;
		output.remainder = dad.dividend % dad.divisor;
		return output;
	}

	// 割り算の結果を表示する
	void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("商は" + qar.quotient + "で余は" + qar.remainder + "です");
	}
}
