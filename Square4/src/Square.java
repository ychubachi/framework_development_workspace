import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		// 自乗を計算する値を入力する
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("自乗を計算する値を入力してください：");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		
		// 自乗を計算する
		SquaredValue output = new SquaredValue();
		output.result = input.value * input.value;
		
		// 計算結果を出力する
		System.out.println("計算結果：" + output.result);
	}
}
