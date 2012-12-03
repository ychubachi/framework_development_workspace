import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		Input input = input();
		Output output = process(input);
		output(output);
	}

	// 自乗を計算する値を入力する
	private Input input() throws IOException {
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		return input;
	}

	// 自乗を計算する
	private Output process(Input input) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue output = new SquaredValue();
		output.result = vtbs.value * vtbs.value;
		return output;
	}

	// 計算結果を出力する
	private void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("計算結果：" + sv.result);
	}
}
