import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	
	private void run() throws Exception {
		// �����鐔�Ɗ��鐔��ǂݍ���
		DividendAndDivisor input = input();
		// ���Ɨ]���v�Z����
		QuotientAndRemainder output = process(input);
		// ����Z�̌��ʂ�\������
		output(output);
	}

	private DividendAndDivisor input() throws IOException {
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

	private QuotientAndRemainder process(DividendAndDivisor input) {
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = input.dividend / input.divisor;
		output.remainder = input.dividend % input.divisor;
		return output;
	}

	private void output(QuotientAndRemainder output) {
		System.out.print("����" + output.quotient + "�ŗ]��" + output.remainder + "�ł�");
	}
}
