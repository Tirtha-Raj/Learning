package study.LLD.udemy.oops.behavioural.mememto;

//Originator
public class TextEditor {

	private String content;
	
	public void write(String text) {
		this.content = text;
	}
	
	public EditorMemento saveText() {
		return new EditorMemento(this.content);
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void restore(EditorMemento editor) {
		content = editor.getContent();
	}
}
