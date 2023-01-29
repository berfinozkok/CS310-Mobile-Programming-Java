package q2;

public class Chapter{
	private int no;
	private String title;
	private Page[] pages;
	
	//constructor
	public Chapter(int no, String title, Page[] pages) {
		super();
		this.no= no;
		this.title= title;
		this.pages = pages;
	}
	//getter and setter metods
	public int getNo(){
		return this.no;
	}
	public void setNo(int no){
		this.no=no;
	}
	public String getTitle(){
		return this.title;
	}
	public void setContent(String title){
		this.title=title;
	}
	public Page[] getPages(){
		return this.pages;
	}
	public void setPages(Page[] pages){
		this.pages=pages;
	}
	public String getInfo() {
		String result="";
		result="Chapter: "+ this.getNo()+ ", title:" + this.getTitle() +"\n";
		for(int i=0; i<pages.length; i++) {
			result += pages[i].getInfo();
		}
		return result;
	}
}
