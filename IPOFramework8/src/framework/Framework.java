package framework;

import framework.io.InputAndOutput;
import framework.process.Input;
import framework.process.Output;
import framework.process.Process;

public class Framework {
	private InputAndOutput io;
	private Process process;
	
	public Framework(String ioClass, String processClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> io = Class.forName(ioClass);
		this.io = (InputAndOutput) io.newInstance();
		Class<?> process = Class.forName(processClass);
		this.process = (Process) process.newInstance();
	}

	public static void main(String[] args) throws Exception {
		String ioClass = args[0];
		String processClass = args[1];
		
		Framework framework = new Framework(ioClass, processClass);
		framework.run();
	}

	public void run() throws Exception {
		Input input = io.input();
		Output output = process.process(input);
		io.output(output);
	}
}
