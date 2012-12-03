package square.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import square.process.SquaredValue;
import square.process.ValueToBeSquared;

import framework.io.InputAndOutput;
import framework.process.Input;
import framework.process.Output;

public class SquareIO implements InputAndOutput {
	// 自乗を計算する値を入力する
	public void input(Input input) throws IOException {
		ValueToBeSquared vtbs = (ValueToBeSquared) input;
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		vtbs.setValue(Double.parseDouble(valueString));
	}

	// 計算結果を出力する
	public void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("計算結果：" + sv.getResult());
	}
}
