package viprammo.message;

import viparammo.gamedata.CharacterData;

public class CharacterModifMessage extends Message {

	private int hp = 100;
	private int mp = 100;
	
	private int area;
	private int x;
	private int y;
	private String muki;
	
	public CharacterModifMessage() {
		this.message_kind = MessageKIND.KIND_CHARACTER_MODIF;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public int getMP() {
		return this.mp;
	}
	
	public int getArea() {
		return area;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String getMuki() {
		return this.muki;
	}
	
	public void setMuki(String muki) {
		this.muki = muki;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public void setMP(int mp) {
		this.mp = mp;
	}
	
	public void setArea(int area_cd) {
		this.area = area_cd;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
