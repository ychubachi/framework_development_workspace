package square.process;

import framework.process.Input;
import framework.process.Output;
import framework.process.Process;

public class SquareProcess implements Process {
	// é©èÊÇåvéZÇ∑ÇÈ
	public Output process(Input input) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue output = new SquaredValue();
		output.result = vtbs.value * vtbs.value;
		return output;
	}
}
