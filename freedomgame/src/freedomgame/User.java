package freedomgame;

import java.util.Arrays;

public class User {
	String name;
	private int money = 1000;
	private int damege = 1;
	private String weapon = Arrays.toString(Weapon.values());
	
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getDamege() {
		return damege;
	}
	public void setDamege(int damege) {
		this.damege = damege;
	}
	public void getImfomation() {
		System.out.println("돈 : "+getMoney());
		System.out.println("무기 : "+this.weapon);
	}
}