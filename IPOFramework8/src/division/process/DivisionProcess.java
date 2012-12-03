package division.process;

import framework.process.Input;
import framework.process.Output;
import framework.process.Process;


public class DivisionProcess implements Process {
	// 商と余を計算する
	public Output process(Input input) {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		QuotientAndRemainder output = new QuotientAndRemainder();
		output.quotient = dad.dividend / dad.divisor;
		output.remainder = dad.dividend % dad.divisor;
		return output;
	}
}
