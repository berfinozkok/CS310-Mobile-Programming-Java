package q2;

public class Page{
	private int no;
	private String content;
	
	//constructor
	public Page(int no, String content) {
		this.no = no;
		this.content= content;
	}
	
	//getter and setters
	public int getNo(){
		return this.no;
	}
	public void setNo(int no){
		this.no=no;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	
	public String getInfo(){
		String result="";
		result= "Page: " + this.getNo() +", content:" + this.getContent()+"\n";
		return result;
	}
}
