package q1;
import java.time.LocalDateTime;
public class Report implements Printable{
	public String title;
	public LocalDateTime reportDate;
	public String text;
	
	public Report(String title, LocalDateTime reportDate, String text) {
		
		super();
		this.title=title;
		this.reportDate= reportDate;
		this.text = text;
	}
	@Override
	public String getContent() {
		String str="";
		str = "Report [title=" +this.title + ", " + this.text+ ", "+ this.reportDate + "]";
		return str;
	}

}
