package framework;
import java.io.IOException;


public abstract class Framework {
	public void run() throws Exception {
		Input input = input();
		Output output = process(input);
		output(output);
	}

	public abstract Input input() throws IOException;
	public abstract Output process(Input input);
	public abstract void output(Output output);
}
