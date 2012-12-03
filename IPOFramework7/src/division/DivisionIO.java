package division;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import framework.Input;
import framework.InputAndOutput;
import framework.Output;


public class DivisionIO implements InputAndOutput {
	// �����鐔�Ɗ��鐔��ǂݍ���
	public Input input() throws IOException {
		DividendAndDivisor input = new DividendAndDivisor();
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����鐔����͂��Ă��������F");
		String dividendString = reader.readLine();
		input.dividend = Integer.parseInt(dividendString);
		System.out.print("���鐔����͂��Ă��������F");
		String divisorString = reader.readLine();
		input.divisor = Integer.parseInt(divisorString);
		return input;
	}

	// ����Z�̌��ʂ�\������
	public void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("����" + qar.quotient + "�ŗ]��" + qar.remainder + "�ł�");
	}
}
