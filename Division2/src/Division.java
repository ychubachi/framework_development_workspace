import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	
	private void run() throws Exception {
		// �����鐔�Ɗ��鐔��ǂݍ���
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����鐔����͂��Ă��������F");
		String dividendString = reader.readLine();
		int dividend = Integer.parseInt(dividendString);
		System.out.print("���鐔����͂��Ă��������F");
		String divisorString = reader.readLine();
		int divisor = Integer.parseInt(divisorString);
		
		// ���Ɨ]���v�Z����
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		// ����Z�̌��ʂ�\������
		System.out.print("����" + quotient + "�ŗ]��" + remainder + "�ł�");
	}

}
