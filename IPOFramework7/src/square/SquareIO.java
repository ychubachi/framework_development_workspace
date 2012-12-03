package square;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import framework.Input;
import framework.InputAndOutput;
import framework.Output;

public class SquareIO implements InputAndOutput {
	// ������v�Z����l����͂���
	public Input input() throws IOException {
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("������v�Z����l����͂��Ă��������F");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		return input;
	}

	// �v�Z���ʂ��o�͂���
	public void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("�v�Z���ʁF" + sv.result);
	}
}
