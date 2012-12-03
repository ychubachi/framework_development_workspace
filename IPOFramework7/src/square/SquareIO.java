package square;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import framework.Input;
import framework.InputAndOutput;
import framework.Output;

public class SquareIO implements InputAndOutput {
	// 自乗を計算する値を入力する
	public Input input() throws IOException {
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		return input;
	}

	// 計算結果を出力する
	public void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("計算結果：" + sv.result);
	}
}
