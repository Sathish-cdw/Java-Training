package Pattern;

public class StrategyPattern {
	public static void main(String[] args) {
		PaintBrush paintBrush = new PaintBrush();
		//using paintbrush object to create redcolor paint
		paintBrush.paintColor = new RedColorPaint();
		System.out.println((paintBrush.getPaint()));
		//using paintbrush object to create bluecolor paint
		paintBrush.paintColor = new BlueColorPaint();
		System.out.println((paintBrush.getPaint()));
	}
}

class PaintBrush {
	Paintt paintColor;
	public Paintt getPaint() {
		return paintColor;
	}
}

abstract class Paintt {
	abstract void color();
}
//extending colors 
class RedColorPaint extends Paintt {
	void color() {
		System.out.println("red color");
	}

}
class BlueColorPaint extends Paintt {
	void color() {
		System.out.println("Blue color");
	}
}
