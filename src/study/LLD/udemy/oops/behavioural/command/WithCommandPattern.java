package study.LLD.udemy.oops.behavioural.command;

public class WithCommandPattern {
	public static void main(String[] args) {
		TextEditorII txtEditor = new TextEditorII();
		
		//Decoupling: One button can do many types of action, decoupled from the text editor class
		Button button = new Button();

		button.setButton(new BoldEditorII(txtEditor));
		button.onClick();

		button.setButton(new ColorEditorII(txtEditor));
		button.onClick();
	}
}

//Receiver : TextEditor class
class TextEditorII {
	public void makeItBold() {
		System.out.println("It is bold now");
	}

	public void updateColor() {
		System.out.println("Colour is now : Red");
	}
}

interface Command {
	public void execute();
}

//concrete class for commands
class Button {
	private Command command;

	public void setButton(Command command) {
		this.command = command;
	}

	public void onClick() {
		command.execute();
	}
}

class BoldEditorII implements Command {
	TextEditorII txtEditor;

	public BoldEditorII(TextEditorII editor) {
		txtEditor = editor;
	}

	@Override
	public void execute() {
		txtEditor.makeItBold();

	}
}

class ColorEditorII implements Command {
	TextEditorII txtEditor;

	public ColorEditorII(TextEditorII editor) {
		txtEditor = editor;
	}

	@Override
	public void execute() {
		txtEditor.updateColor();

	}
}