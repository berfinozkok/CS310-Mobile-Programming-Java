package ADVGame;

public class Inventory {
	private boolean water;
	private boolean food;
	private boolean firewood;
	private String weaponName;
	private String armorName;
	private int weaponDamage;
	private int armorDefence;
	
	public Inventory(boolean water, boolean food, boolean firewood,
			String weaponName, String armorName, int weaponDamage, int armorDefence) {
		this.water = water;
		this.food= food;
		this.firewood = firewood;
		this.weaponName = weaponName;
		this.armorName= armorName;
		this.weaponDamage=weaponDamage;
		this.armorDefence = armorDefence;		
	}
	
	//getter and setter metods
	public boolean getWater() {
		return this.water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean getFood() {
		return this.food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public boolean getFirewood() {
		return this.firewood;
	}
	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}
	public String getweaponName() {
		return this.weaponName;
	}
	public void setweaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public String getarmorName() {
		return this.armorName;
	}
	public void setarmorName(String armorName) {
		this.armorName = armorName;
	}
	public int getweaponDamage() {
		return this.weaponDamage;
	}
	public void setweaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	public int getarmorDefence() {
		return this.armorDefence;
	}
	public void setarmorDefence(int armorDefence) {
		this.armorDefence = armorDefence;
	}
}
