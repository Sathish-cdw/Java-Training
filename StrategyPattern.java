package Pattern;

public class StrategyPattern {
	public static void main(String[] args) {
		NewBrush brush = new NewBrush();
		brush.paint = new RedPaint();
		System.out.println((brush.getPaint()));
		brush.paint = new BluePaint();
		System.out.println((brush.getPaint()));
	}
}

class NewBrush {
	Paintt paint;

	public Paintt getPaint() {
		return paint;
	}
}

abstract class Paintt {
	abstract void color();
}

class RedPaint extends Paintt {
	void color() {
		System.out.println("red color");
	}

}
class BluePaint extends Paintt {
	void color() {
		System.out.println("Blue color");
	}
}