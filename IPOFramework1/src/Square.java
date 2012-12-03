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

	// ������v�Z����l����͂���
	private Input input() throws IOException {
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("������v�Z����l����͂��Ă��������F");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		return input;
	}

	// ������v�Z����
	private Output process(Input input) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue output = new SquaredValue();
		output.result = vtbs.value * vtbs.value;
		return output;
	}

	// �v�Z���ʂ��o�͂���
	private void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("�v�Z���ʁF" + sv.result);
	}
}
