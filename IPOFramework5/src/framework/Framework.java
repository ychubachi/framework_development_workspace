package framework;
import java.io.IOException;


public abstract class Framework {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName(args[0]);
		Framework framework = (Framework) c.newInstance();
		framework.run();
	}

	public void run() throws Exception {
		Input input = input();
		Output output = process(input);
		output(output);
	}

	public abstract Input input() throws IOException;
	public abstract Output process(Input input);
	public abstract void output(Output output);
}
