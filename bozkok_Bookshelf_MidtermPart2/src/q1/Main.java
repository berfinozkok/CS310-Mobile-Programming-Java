package q1;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Report report = new Report("Final Exam", null, "I am trying to complete the question, yeah still!");
		SpreadSheet spreadsheet = new SpreadSheet("Budget", 10, 10);
		Letter letter = new Letter("Jack", "Henry", "Letter content");
		
		FilePrinter filePrinter = new FilePrinter("output1.txt");
	//	ConsolePrinter consolePrinter = new ConsolePrinter();
		
		filePrinter.addDocument(report);
		filePrinter.addDocument(spreadsheet);
		filePrinter.addDocument(letter);
		ConsolePrinter consolePrinter = new ConsolePrinter();
		
		consolePrinter.addDocument(report);
		consolePrinter.addDocument(spreadsheet);
		consolePrinter.addDocument(letter);
		
		//insert codes required
		filePrinter.printAllDocuments();
		consolePrinter.printAllDocuments();

	}

}
