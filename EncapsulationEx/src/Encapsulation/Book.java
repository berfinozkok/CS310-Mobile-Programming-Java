package Encapsulation;

public class Book {
	//tüm değişkenleri private tanımla ve bunlara erişmek için metot yaz
	//getter ve setter metotları, private değişkenleri almak için getter metodu diyoruz
	//setter metodları ise değiştirir
	
	//get metodları hep veri döndürürler ve metodların veri tipleri aynı olmalıdır
	
	private String name;
	private int pageNumber;
	
	public Book(String name, int pageNumber){
		this.name = name;
		if(pageNumber <0) {
			pageNumber = 0;
		}
	}
	//encapsulation
	public int showPage() {
		return this.pageNumber;
	}
	public void changePageNumber(int pageNumber) {
		if(pageNumber<0) {
			pageNumber = 0;
		}
		this.pageNumber = pageNumber;
	}
	public String showName() {
		return this.name;
	}
	public void changeName(String name) {
		this.name = name;
	}
}
