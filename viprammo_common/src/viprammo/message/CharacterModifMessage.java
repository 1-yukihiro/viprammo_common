package viprammo.message;

import java.io.Serializable;

import viparammo.gamedata.CharacterData;

public class CharacterModifMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hp = 100;
	private int mp = 100;
	
	private int area;
	private int x;
	private int y;
	private String muki;
	
	private String character_prefix;
	
	public CharacterModifMessage() {
		this.message_kind = MessageKIND.KIND_CHARACTER_MODIF;
	}
	
	public String getCharacter_prefix() {
		return this.character_prefix;
	}
	
	public void setCharacter_prefix(String str) {
		this.character_prefix = str;
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
