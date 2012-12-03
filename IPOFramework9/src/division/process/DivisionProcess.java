package division.process;

import framework.process.Input;
import framework.process.Output;
import framework.process.Process;


public class DivisionProcess implements Process {
	// 商と余を計算する
	public void process(Input input, Output output) {
		DividendAndDivisor dad = (DividendAndDivisor) input;
		QuotientAndRemainder qar = (QuotientAndRemainder) output;
		qar.quotient = dad.dividend / dad.divisor;
		qar.remainder = dad.dividend % dad.divisor;
	}
}
