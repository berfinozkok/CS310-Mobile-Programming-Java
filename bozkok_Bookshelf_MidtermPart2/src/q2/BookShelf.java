package q2;

public class BookShelf {
	private Book[] books;
	
	//constructor
	public BookShelf(Book[] books) {
		this.books = books;
	}
	
	//getter and setters
	public Book[] getBook(){
		return this.books;
	}
	public void setBook(Book[] books){
		this.books=books;
	}
	public String getInfo() {		
		String result = "Bookshelf:\n";
		result+="Total number of books:" + getTotalNumberOfBooks(books)+", \n";
		for (int i=0; i<books.length; i++) {
			result+= books[i].getInfo();
		}		
		return result;
	}

	public int getTotalNumberOfBooks(Book[] books) {
		int count = 0;
		for(int i= 0 ; i < books.length; i++) {
			count+=1;
		}
		return count;		
	}
	public Book pickUpBook(int index) {
		return this.books[index];		
	} 
}
