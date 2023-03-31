package Pattern;

public class BuilderPattern {
	public static void main(String[] args) {
		Computer computer = new Computer.BuildComputer().setMonitor(new Monitor()).setKeyBoard(null).build();
		System.out.println(computer);
	}
}

class Computer
{
	Monitor mon;
	KeyBoard KB;
	
	public  Computer(Monitor mon ,KeyBoard KB)
	{
		this.mon = mon;
		this.KB = KB;
	}
	
	static class BuildComputer
	{
		Monitor mon ; KeyBoard KB;
		
		public BuildComputer setMonitor(Monitor mon)
		{
			this.mon=mon;
			return this;
		}
		
		public BuildComputer setKeyBoard(KeyBoard KB)
		{
			this.KB = KB;
			return this;
		}
		
		public Computer build()
		{
			return new Computer(mon, KB);
		}
		
	}
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
