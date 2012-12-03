package framework;

public class Framework {
	private InputAndOutput io;
	private Process process;
	
	public static void main(String[] args) throws Exception {
		String ioClass = args[0];
		String processClass = args[1];
		
		Framework framework = new Framework();
		Class<?> io = Class.forName(ioClass);
		framework.io = (InputAndOutput) io.newInstance();
		Class<?> process = Class.forName(processClass);
		framework.process = (Process) process.newInstance();

		framework.run();
	}

	public void run() throws Exception {
		Input input = io.input();
		Output output = process.process(input);
		io.output(output);
	}
}
