package framework;

import framework.io.InputAndOutput;
import framework.process.Input;
import framework.process.Output;
import framework.process.Process;

public class Framework {
	public static void main(String[] args) throws Exception {
		String ioClass = args[0];
		String processClass = args[1];
		String inputClass = args[2];
		String outputClass = args[4];
		
		Framework framework = new Framework(ioClass, processClass, inputClass, outputClass);
		framework.run();
	}

	private InputAndOutput io;
	private Process process;
	private Input input;
	private Output output;
	
	public Framework(String ioClass, String processClass, String inputClass, String outputClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> io = Class.forName(ioClass);
		this.io = (InputAndOutput) io.newInstance();
		Class<?> process = Class.forName(processClass);
		this.process = (Process) process.newInstance();
		Class<?> input = Class.forName(inputClass);
		this.input = (Input) input.newInstance();
		Class<?> output = Class.forName(outputClass);
		this.output = (Output) output.newInstance();
	}

	public void run() throws Exception {
		io.input(this.input);
		process.process(input, output);
		io.output(output);
	}
}
