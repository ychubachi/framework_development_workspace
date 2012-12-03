import java.io.IOException;


abstract class Framework {

	protected void run() throws Exception {
		Input input = input();
		Output output = process(input);
		output(output);
	}

	abstract Input input() throws IOException;
	abstract Output process(Input input);
	abstract void output(Output output);
}
