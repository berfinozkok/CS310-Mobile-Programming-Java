package q1;
import java.util.ArrayList;

public abstract class Printer {
	private ArrayList<Printable> docs = new ArrayList<Printable>();
	
	public Printer() {
		super();
	}
	public abstract void printOut(Printable Printable);
	public void printAllDocuments() {
		for(Printable Printable: docs) {
			printOut(Printable);
		}
	}
	public void addDocument(Printable Printable) {
		docs.add(Printable);
	}
	
}
