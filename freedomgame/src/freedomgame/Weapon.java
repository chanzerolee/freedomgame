package freedomgame;

public enum Weapon {
	LONGSORD("LongSord +",100,5),
	BFSORD("BFSord +",500,7),
	STEELSORD("SteelSord +",5000,12),
	LIGHTSORD("LightSord +",100000,20);
	
	private String weapon;
	private int price;
	private int damege;
	Weapon(String weapon,int price,int damege){
		this.weapon = weapon;
		this.price = price;
		this.damege = damege;
	}
	public String getWeapon() {
		return this.weapon;
	}
	public int getPrice() {
		return this.price;
	}
	public int getDamege() {
		return this.damege;
	}
}
