import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square {
	public static void main(String[] args) throws Exception {
		Square square = new Square();
		square.run();
	}

	private void run() throws Exception {
		// ������v�Z����l����͂���
		System.out.print("������v�Z����l����͂��Ă��������F");
		BufferedReader reader =
			new BufferedReader(
				new InputStreamReader(System.in));
		String valueString = reader.readLine();
		double value = Double.parseDouble(valueString);
		
		// ������v�Z����
		double result = value * value;
		
		// �v�Z���ʂ��o�͂���
		System.out.println("�v�Z���ʁF" + result);
	}
}
