package q1;

public class ConsolePrinter extends Printer{
	public ConsolePrinter() {
		super();
	}

	@Override
	public void printOut(Printable Printable) {
		String result ="";
		result = Printable.getContent();
		System.out.println("Data Printed to console\n" + result);
	}
}
