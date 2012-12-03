import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		// 自乗を計算する値を入力する
		double value = input();
		// 自乗を計算する
		double result = process(value);
		// 計算結果を出力する
		output(result);
	}

	private double input() throws IOException {
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		double value = Double.parseDouble(valueString);
		return value;
	}

	private double process(double value) {
		double result = value * value;
		return result;
	}

	private void output(double result) {
		System.out.println("計算結果：" + result);
	}
}
