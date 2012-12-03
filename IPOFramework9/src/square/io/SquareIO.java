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
	// ������v�Z����l����͂���
	public void input(Input input) throws IOException {
		ValueToBeSquared vtbs = (ValueToBeSquared) input;
		System.out.print("������v�Z����l����͂��Ă��������F");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		vtbs.setValue(Double.parseDouble(valueString));
	}

	// �v�Z���ʂ��o�͂���
	public void output(Output output) {
		SquaredValue sv = (SquaredValue) output;
		System.out.println("�v�Z���ʁF" + sv.getResult());
	}
}