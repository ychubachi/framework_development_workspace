package square.process;

import framework.process.Input;
import framework.process.Output;
import framework.process.Process;

public class SquareProcess implements Process {
	// é©èÊÇåvéZÇ∑ÇÈ
	public void process(Input input, Output output) {
		ValueToBeSquared vtbs =(ValueToBeSquared) input;
		SquaredValue sv = (SquaredValue) output;
		sv.result = vtbs.value * vtbs.value;
	}
}
