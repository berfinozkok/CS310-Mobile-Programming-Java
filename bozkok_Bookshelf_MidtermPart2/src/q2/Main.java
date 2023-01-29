package q2;

public class Main {

	public static void main(String[] args) {
		Page page1 = new Page(1, "Page 1 Content");
		Page page2 = new Page(2, "Page 2 Content");
		Page page3 = new Page(11, "Page 3 Content");
		Page page4 = new Page(16, "Page 4 Content");
		
		Chapter ch1 = new Chapter(1, "First Chapter", new Page[] {page1,page2,page3,page4});
		Chapter ch2 = new Chapter(2, "Second Chapter", new Page[] {page1,page2,page3,page4});
		
		Book b1= new Book("Grapes of Wrath", "Fore word of Grapes Of Wrath", new Chapter[]{ch1});
		Book b2= new Book("Introduction to Java", "Fore word of Intro to Java", new Chapter[]{ch2});
		
		//Code to create pages, chapters and books

		BookShelf shelf = new BookShelf(new Book[]{b1,b2}); //books is a List of type Book

		System.out.println(shelf.getInfo());

		Book pickUpBook = shelf.pickUpBook(1);

		System.out.println("Pick up book:" + pickUpBook.getInfo());
		
		
	}

}
