package q2;

public class Book {
	private String title;
	private String foreWord;
	private Chapter[] chapters;
	
	//constructor
	public Book(String title, String foreWord, Chapter[] chapters) {
		super();
		this.title = title;
		this.foreWord = foreWord;
		this.chapters = chapters;
	}
	
	//getter and setters
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getforeWord(){
		return this.foreWord;
	}
	public void setforeWord(String foreWord){
		this.foreWord=foreWord;
	}
	public Chapter[] getChapters(){
		return this.chapters;
	}
	public void setChapters(Chapter[] chapters){
		this.chapters=chapters;
	}
	
	public int getNumberOfPages() {
		int totalnumberofpages=0;
		for(Chapter chapter:chapters) {
			for(int j=0;j<(chapter.getPages()).length;j++) {
				totalnumberofpages++;
			}
		}
		return totalnumberofpages;
	}
		
	public String getInfo() {
		String result="";
		result="Book: "+ "title: "+ this.getTitle() + ", foreWord:"+ this.getforeWord()+"\n";
		result += "Total number of pages:"+ getNumberOfPages()+"\n";
		for(Chapter chapter:chapters) {
			result+= chapter.getInfo();
			
		}
		result += "\n";
		return result;

	}
	
	
}
