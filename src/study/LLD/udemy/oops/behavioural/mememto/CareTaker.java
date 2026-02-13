package study.LLD.udemy.oops.behavioural.mememto;

import java.util.Stack;

//CareTaker class: Manage mementos (Snapshots of text editor state)
public class CareTaker {

	private final Stack<EditorMemento> editorHistory = new Stack<>();

	public void saveState(TextEditor textEditor) {
		editorHistory.push(textEditor.saveText());
	}

	public void undo(TextEditor textEditor) {
		if (null != this.editorHistory) {
			editorHistory.pop();
			textEditor.restore(this.editorHistory.peek());
		}
	}

}
