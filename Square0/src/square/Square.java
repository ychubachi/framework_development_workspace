package square;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Square {
	public static void main(String[] args) throws IOException {
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		double value = Double.parseDouble(valueString);
		System.out.println("計算結果：" + (value * value));
	}
}
