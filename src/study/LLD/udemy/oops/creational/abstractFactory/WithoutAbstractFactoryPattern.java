package study.LLD.udemy.oops.creational.abstractFactory;

//Problem: We need to implement different implementation for rendering Buttons and ScrollBar for Windows and MacOS
public class WithoutAbstractFactoryPattern {
	public static void main(String[] args) {
		WindowsButton windowButton = new WindowsButton();
		MacOSScrollBar macScrollBar = new MacOSScrollBar();

		windowButton.createButton();
		macScrollBar.createScrollBar();// should not be there as button and scroll bar can exist at the same time for same OS
	}
}

class WindowsButton {
	public void createButton() {
		System.out.println("Rendering buttons for Windows");
	}
}

class WindowsScrollBar {
	public void createScrollBar() {
		System.out.println("Rendering scroll bar for Windows");
	}
}

class MacOSButton {
	public void createButton() {
		System.out.println("Rendering buttons for MacOS");
	}
}

class MacOSScrollBar {
	public void createScrollBar() {
		System.out.println("Rendering scroll bar for MacOS");
	}
}