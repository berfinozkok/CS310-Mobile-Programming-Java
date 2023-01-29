package ADVGame;
import java.util.Scanner;
public class Game {
	/*private Player player;
	private Location location;
	public Game(Player player, Location location) {
		this.player = player;
		this.location = location;
				
	}*/
	public void start() {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome to adventure game!");
		System.out.println("Please enter your name;");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println("Merhaba" + player.getName()+ " welcome to this dark and smoky island.");
		
		
	}

}
