package inter;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/*Interface (Arayüzler)
		Java'da soyutlamayı sağlamanın bir başka yolu "interface" tanımlamaktır. "interface" 'ler abstract sınıflara göre soyutlama oranı çok yüksektir. Çünkü, "interface" içinde sadece soyut fonksiyonlar tanımlayabilirsiniz. Metot gövdesi olan normal fonksiyonlar tanımlayamazsınız.
		"interface"ler sözleşmeler gibidir. Bir sınıf eğer bir interface'den kalıtım alıyorsa o "interface"de tanımlı olan tüm soyut özellikleri karşılamak zorundadır. Eğer, kalıtım alan sınıf "interface"deki bazı metotlara ihtiyaç duymuyorsa yazılım tasarımınızda bir problem var demektir. Bu noktada "Interface Segregation" yapmanızı öneririm. "Interface Segregation" ile interface'ler alt interface tanımlarına bölünebilir.
		Neden "interface" kullanırız?
		Bir sınıf "interface"den kalıtım alıyorsa "implements" anahtar kelimesi kullanılır. Örnek bir tanımlamaya göz atalım.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the price that taken: ");
		double price = input.nextDouble();
		
		System.out.println("Please enter the card number: ");
		String cardNumber = input.next();
		
		System.out.println("Please enter the expire date: ");
		String expireDate = input.next();
		
		System.out.println("Please enter the price that taken: ");
		String cvc = input.next();
		
		System.out.println("1. A Bank");
		System.out.println("2. B Bank");
		System.out.println("3. C Bank");
		System.out.println("Choose Bank: ");
		int select = input.nextInt();
		
		switch(select){		
		case 1: 
			ABank aPos = new ABank("AkBank","345612", "berfin" );
			aPos.connect("127.1.1.1");
			aPos.payment(price, cardNumber, expireDate, cvc);
			break;
		case 2: 
			BBank bPos = new BBank("BBVBank","525434", "berf" );
			bPos.connect("127.1.2.2.0");
			bPos.payment(price, cardNumber, expireDate, cvc);
			break;
			
		/*case 3: 
			CBank cPos = new ABank("CBank","655675", "halil" );
		*/	
		default:
			System.out.println("Please choose valid bank.");
		
		}
	}

}
