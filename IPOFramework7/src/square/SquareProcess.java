package square;

import framework.Input;
import framework.Output;
import framework.Process;

public class SquareProcess implements Process {
	// ������v�Z����
	public Output process(Input input) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue output = new SquaredValue();
		output.result = vtbs.value * vtbs.value;
		return output;
	}
}
