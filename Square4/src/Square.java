import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		// ������v�Z����l����͂���
		ValueToBeSquared input = new ValueToBeSquared();
		System.out.print("������v�Z����l����͂��Ă��������F");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		input.value = Double.parseDouble(valueString);
		
		// ������v�Z����
		SquaredValue output = new SquaredValue();
		output.result = input.value * input.value;
		
		// �v�Z���ʂ��o�͂���
		System.out.println("�v�Z���ʁF" + output.result);
	}
}
