
package Pattern;

interface Command {
	public void execute();
}
// light and command classes
class Light {
	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}
}
//command for light on 
class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
//command for light off
class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}

// Stereo and its command classes
class Stereo {
	public void on() {
		System.out.println("Stereo is on");
	}

	public void off() {
		System.out.println("Stereo is off");
	}

	public void setCD() {
		System.out.println("Stereo is set " + "for CD input");
	}

	public void setDVD() {
		System.out.println("Stereo is set" + " for DVD input");
	}

	public void setRadio() {
		System.out.println("Stereo is set" + " for Radio");
	}

	public void setVolume(int volume) {
		System.out.println("Stereo volume set" + " to " + volume);
	}
}
//command for stereo off
class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}
}
//command for stereo on
class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}

class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}

public class CommandPattern {
	public static void main(String[] args) {
		//creating objects 
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		//passing instruction light on command
		remote.setCommand(new LightOnCommand(light));
		remote.buttonWasPressed();
		//passing instruction to stereo on command 
		remote.setCommand(new StereoOnWithCDCommand(stereo));
		remote.buttonWasPressed();
		//passing instruction to stereo off command
		remote.setCommand(new StereoOffCommand(stereo));
		remote.buttonWasPressed();
	}
}
