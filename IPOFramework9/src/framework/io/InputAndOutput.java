package framework.io;

import java.io.IOException;

import framework.process.Input;
import framework.process.Output;


public interface InputAndOutput {
	void input(Input input) throws IOException;
	void output(Output output);
}
