package study.LLD.udemy.oops.behavioural.mememto;

public class TextEditorMain {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		TextEditor textEditor = new TextEditor();
		//add
		textEditor.write("A");
		careTaker.saveState(textEditor);
		//
		textEditor.write("B");
		careTaker.saveState(textEditor);
		//
		textEditor.write("C");
		careTaker.saveState(textEditor);
		//
		textEditor.write("D");
		careTaker.saveState(textEditor);
		
		System.out.println(textEditor.getContent());
		
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
		careTaker.undo(textEditor);
		System.out.println(textEditor.getContent());
		
	}

}
