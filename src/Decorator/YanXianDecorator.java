package Decorator;

public class YanXianDecorator extends Decorator {
	@Override
	public void show() {
		super.show();
		System.out.println("With BBShuang.");
	}
}
