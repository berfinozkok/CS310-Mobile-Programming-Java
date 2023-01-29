package ADVGame;

public class Player {
	private Inventory inventory;
	private int damage;
	private int health;
	private int money;
	private String name;
	private String charName;
	
	public Player(Inventory inventory, int damage, int health,
			int money, String name, String charName) {
		this.inventory = inventory;
		this.damage = damage;
		this.health=health;
		this.money = money;
		this.name= name;
		this.charName = charName;
	}
	//getter and setter metods
	public Inventory getInv() {
		return this.inventory;
	}
	public void setInv(Inventory inventory) {
		this.inventory = inventory;
	}
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

}
