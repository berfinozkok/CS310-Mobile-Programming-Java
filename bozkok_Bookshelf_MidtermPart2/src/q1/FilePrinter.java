package q1;

public class FilePrinter extends Printer{
	public String fileName;
	public FilePrinter(String fileName) {
		super();
		this.fileName= fileName;
	}
	
	@Override
	public void printOut(Printable Printable){
		String str="";
		str= Printable.getContent();
		System.out.println("Data printed to the " +this.fileName);
		System.out.println(str);
	}
}
