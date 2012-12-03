import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square extends Framework {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	// ������v�Z����l����͂���
	Input input() throws IOException {
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
	Output process(Input input) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue output = new SquaredValue();
		output.result = vtbs.value * vtbs.value;
		return output;
	}

	// �v�Z���ʂ��o�͂���
	void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("�v�Z���ʁF" + sv.result);
	}
}
