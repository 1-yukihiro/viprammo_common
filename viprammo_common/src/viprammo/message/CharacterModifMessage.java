package viprammo.message;

public class CharacterModifMessage extends Message {

	private int hp = 100;
	private int mp = 100;
	
	private int area;
	private int x;
	private int y;
	private int muki;
	
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

	public int getMuki() {
		return this.muki;
	}
	
	public void setMuki(int muki_cd) {
		this.muki = muki_cd;
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
