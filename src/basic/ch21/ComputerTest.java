package basic.ch21;

public class ComputerTest {

	public static void main(String[] args) {
		// Computer computer1 = new computer; --> 안됨
		DeskTop desktop1 = new DeskTop();
		// NoteBook notebook1 = new NoteBook(); --> 안됨
		MyNoteBook mynotebook1 = new MyNoteBook();
		
		
		desktop1.display();
		desktop1.typing();
		desktop1.turnOn();
		desktop1.turnOff();
		mynotebook1.display();
		mynotebook1.typing();
		mynotebook1.turnOn();
		mynotebook1.turnOff();
		
	}

}
