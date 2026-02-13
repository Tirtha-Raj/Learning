package study.LLD.udemy.oops.behavioural.command;

public class WithoutCommandPattern {
	public static void main(String[] args) {
	TextEditor txtEditor = new TextEditor();
		BoldEditor boldEditor = new BoldEditor();
		boldEditor.setBoldEditor(txtEditor);
		boldEditor.onClick();
		
		ColourEditor colorEditor = new ColourEditor();
		colorEditor.setColorEditor(txtEditor);
		colorEditor.onClick("Blue");
	}
}

class TextEditor {
	public void makeItBold() {
		System.out.println("It is bold now");
	}

	public void updateColor(String color) {
		System.out.println("Colour is now : " + color);
	}
}

class BoldEditor {
	TextEditor txtEditor;

	public void setBoldEditor(TextEditor editor) {
		txtEditor = editor;
	}

	public void onClick() {
		txtEditor.makeItBold();
	}
}


class ColourEditor {
	TextEditor txtEditor;

	public void setColorEditor(TextEditor editor) {
		txtEditor = editor;
	}

	public void onClick(String color) {
		txtEditor.updateColor(color);
	}
}