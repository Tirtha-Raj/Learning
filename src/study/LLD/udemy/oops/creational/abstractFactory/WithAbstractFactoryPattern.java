package study.LLD.udemy.oops.creational.abstractFactory;

public class WithAbstractFactoryPattern {

	private Button button;
	private ScrollBar scrollBar;

	public WithAbstractFactoryPattern(UIfactory uiFactory) {
		button = uiFactory.createButton();
		scrollBar = uiFactory.createScrollBar();
	}

	private void render() {
		button.createButton();
		scrollBar.createScrollBar();
	}

	public static void main(String[] args) {
		WithAbstractFactoryPattern app = new WithAbstractFactoryPattern(new MacOSFactory());
		app.render();
	}

}

interface UIfactory {
	Button createButton();

	ScrollBar createScrollBar();
}

class WindowsFactory implements UIfactory {

	@Override
	public Button createButton() {
		return new WindowsButtonV2();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollBarV2();
	}

}

class MacOSFactory implements UIfactory {

	@Override
	public Button createButton() {
		return new MacOSButtonV2();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MacOSScrollBarV2();
	}

}

interface Button {
	public void createButton();
}

interface ScrollBar {
	public void createScrollBar();
}

class WindowsButtonV2 implements Button {
	public void createButton() {
		System.out.println("Rendering buttons for Windows");
	}
}

class WindowsScrollBarV2 implements ScrollBar {
	public void createScrollBar() {
		System.out.println("Rendering scroll bar for Windows");
	}
}

class MacOSButtonV2 implements Button {
	public void createButton() {
		System.out.println("Rendering buttons for MacOS");
	}
}

class MacOSScrollBarV2 implements ScrollBar {
	public void createScrollBar() {
		System.out.println("Rendering scroll bar for MacOS");
	}
}