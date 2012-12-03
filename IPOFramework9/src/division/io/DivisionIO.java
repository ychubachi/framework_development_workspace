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
	public void input(Input input) throws IOException {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�����鐔����͂��Ă��������F");
		String dividendString = reader.readLine();
		dad.setDividend(Integer.parseInt(dividendString));
		System.out.print("���鐔����͂��Ă��������F");
		String divisorString = reader.readLine();
		dad.setDivisor(Integer.parseInt(divisorString));
	}

	// ����Z�̌��ʂ�\������
	public void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("����" + qar.getQuotient() + "�ŗ]��" + qar.getRemainder() + "�ł�");
	}
}
