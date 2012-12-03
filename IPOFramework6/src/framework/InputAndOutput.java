package framework;

import java.io.IOException;

public interface InputAndOutput {
	Input input() throws IOException;
	void output(Output output);
}
