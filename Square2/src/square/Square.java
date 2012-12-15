package square;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Square {
	public static void main(String[] args) throws IOException {
		Square square = new Square();
		square.run();
	}

	private void run() throws IOException {
		// 自乗を計算する値を入力する
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		double value = Double.parseDouble(valueString);
		
		// 自乗を計算する
		double result = value * value;
		
		// 計算結果を出力する
		System.out.println("計算結果：" + result);
	}
}
