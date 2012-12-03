import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		// ������v�Z����l����͂���
		double value = input();
		// ������v�Z����
		double result = process(value);
		// �v�Z���ʂ��o�͂���
		output(result);
	}

	private double input() throws IOException {
		System.out.print("������v�Z����l����͂��Ă��������F");
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
		System.out.println("�v�Z���ʁF" + result);
	}
}
