package division.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import division.process.DividendAndDivisor;
import division.process.QuotientAndRemainder;

import framework.io.InputAndOutput;
import framework.process.Input;
import framework.process.Output;


public class DivisionIO implements InputAndOutput {
	// �����鐔�Ɗ��鐔��ǂݍ���
	public Input input() throws IOException {
		DividendAndDivisor input = new DividendAndDivisor();
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����鐔����͂��Ă��������F");
		String dividendString = reader.readLine();
		input.setDividend(Integer.parseInt(dividendString));
		System.out.print("���鐔����͂��Ă��������F");
		String divisorString = reader.readLine();
		input.setDivisor(Integer.parseInt(divisorString));
		return input;
	}

	// ����Z�̌��ʂ�\������
	public void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("����" + qar.getQuotient() + "�ŗ]��" + qar.getRemainder() + "�ł�");
	}
}
