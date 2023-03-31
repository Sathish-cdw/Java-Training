package Pattern;

public class SingletonPattern {
	public static void main(String[] args) throws CloneNotSupportedException {

		Sheep mSheep = new Sheep();
		mSheep.name = "I am mother";
		Sheep cSheep = mSheep;
		cSheep.name = "I am child";

		System.out.println(mSheep.name);
		System.out.println(cSheep.name);

	}
}

class Sheep implements Cloneable {
	String name;

	public Sheep() {
		System.out.println("sheep object created....");
	}

	public Sheep createClone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}

}