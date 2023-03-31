package Pattern;

public class BuilderPattern {
	public static void main(String[] args) {
		Computer computer = new Computer.BuildComputer().setMonitor(new Monitor()).setKeyBoard(new KeyBoard()).build();
		System.out.println(computer);
	}
}

class Computer
{
	Monitor mon;
	KeyBoard KB;
	// passing arguments in constructor
	public  Computer(Monitor mon ,KeyBoard KB)
	{
		this.mon = mon;
		this.KB = KB;
	}
	
	static class BuildComputer
	{
		Monitor mon ; KeyBoard KB;
		//set for all arguments passed in arguments
		public BuildComputer setMonitor(Monitor mon)
		{
			this.mon=mon;
			return this;//this will return value;
		}
		
		public BuildComputer setKeyBoard(KeyBoard KB)
		{
			this.KB = KB;
			return this;//this will return value;
		}
		
		public Computer build()
		{
			return new Computer(mon, KB);
		}
		
	}
	//to string for return the values
	public String toString()
	{
		return "Computer [Monitor = " + mon + ", Keyboard = " + KB + " ]"; 
	}
}
class Monitor
{


}
class KeyBoard
{
	
}
