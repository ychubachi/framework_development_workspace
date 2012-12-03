import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Division {
	public static void main(String[] args) throws Exception {
		Division division = new Division();
		division.run();
	}
	
	
	private void run() throws Exception {
		Input input = input();
		Output output = process(input);
		output(output);
	}

	// �����鐔�Ɗ��鐔��ǂݍ���
	private Input input() throws IOException {
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
	private Output process(Input input) {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = dad.dividend / dad.divisor;
		output.remainder = dad.dividend % dad.divisor;
		return output;
	}

	// ����Z�̌��ʂ�\������
	private void output(Output output) {
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		System.out.print("����" + qar.quotient + "�ŗ]��" + qar.remainder + "�ł�");
	}
}
