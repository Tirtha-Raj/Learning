package study.LLD.udemy.oops.behavioural.mememto;

//Mememtos class: Store the internal state of the text editor
public class EditorMemento {

	private final String content;

	public EditorMemento(String text) {
		this.content = text;
	}

	public String getContent() {
		return content;
	}
}
