package ADVGame;

public abstract class BattleLoc extends Location{
	private Obstacle obstacle;
	public NormalLoc(Player player, String name, Obstacle obstacle) {
		super(player, name);
		this.obstacle = obstacle;
	}
	public Obstacle BattleLoc() {
		
	}
	public boolean onLocation() {
		
	}
	public void combat() {
		
	}

}
