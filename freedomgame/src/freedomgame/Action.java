package freedomgame;

import java.util.Arrays;
import java.util.Scanner;

public class Action {
	Scanner sn = new Scanner(System.in);
	public int playList() {
		System.out.println();
		System.out.println("이곳은 광장 어디로 가시겠습니까?");
		System.out.println("1. 상점가기");
		System.out.println("2. 던전 이동");
		System.out.println("4. 종료하기");
		return sn.nextInt();
	}
	public int goShop() {
		System.out.println();
		System.out.println("0. 유저 정보 확인");
		System.out.println("1. 무기 구매");
		System.out.println("2. 무기 강화");
		System.out.println("3. 광장으로 이동");
		return sn.nextInt();
	}
	public int  goDongoen() {
		System.out.print("난이도 선택  (0~3): ");
		return sn.nextInt();
	}
	public boolean endGame() {
		System.out.println("정말 종료하십니까?");
		System.out.println("1. 예 \n2. 아니오");
		if(sn.nextInt()==1) {
			System.out.println("게임을 종료합니다.");
			return false;
		}else {
			return true;
		}
	}
	// 무기 구매
	public void buyWeapon(User user) {
		for(Weapon w : Weapon.values()) {
			System.out.println(w.getNum()+". "+w.getWeapon()+" "+w.getPrice()+"G 공격력:"+w.getDamege());
		}
	}
	// 무기 판매
	
	// 무기 강화
	public void enforceWeapon(User user) {
		
	}
	// 장비 착용 
	public void outStage() {
		System.out.println("광장으로 이동.");
	}
}
