package division.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import division.process.DividendAndDivisor;
import division.process.QuotientAndRemainder;

import framework.io.InputAndOutput;
import framework.process.Input;
import framework.process.Output;


public class DivisionIO implements InputAndOutput {
	// 割られる数と割る数を読み込む
	public void input(Input input) throws IOException {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("割られる数を入力してください：");
		String dividendString = reader.readLine();
		dad.setDividend(Integer.parseInt(dividendString));
		System.out.print("割る数を入力してください：");
		String divisorString = reader.readLine();
		dad.setDivisor(Integer.parseInt(divisorString));
	}

	// 割り算の結果を表示する
	public void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("商は" + qar.getQuotient() + "で余は" + qar.getRemainder() + "です");
	}
}
