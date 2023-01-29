package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Book harryPotter = new Book("Harry Potter", 150);
		Book lordOfRings = new Book("Lord Of the Rings", -120); //not meaning full
		lordOfRings.changePageNumber(-1000);
		System.out.println(lordOfRings.showPage());	
		System.out.println(lordOfRings.showName());	
	}
}
