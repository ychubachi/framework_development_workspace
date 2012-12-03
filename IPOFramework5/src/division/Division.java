package division;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import framework.Framework;
import framework.Input;
import framework.Output;


public class Division extends Framework {
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

	// ���Ɨ]���v�Z����
	public Output process(Input input) {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = dad.dividend / dad.divisor;
		output.remainder = dad.dividend % dad.divisor;
		return output;
	}

	// ����Z�̌��ʂ�\������
	public void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("����" + qar.quotient + "�ŗ]��" + qar.remainder + "�ł�");
	}
}
