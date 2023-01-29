package ADVGame;

public abstract class Location {
	private Player player;
	private String name;
	
	//constructor
	public Location(Player player, String name){
		this.player = player;
		this.name = name;
	}
	
	//getter and setter metods
	public Player getPlayer() {
		return this.player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getName() {
		return this.name;
	}
	public void setName() {
		this.name = name;
	}
	public void Location() {
		
	}
	public boolean onLocation() {
		
	}
	

}
