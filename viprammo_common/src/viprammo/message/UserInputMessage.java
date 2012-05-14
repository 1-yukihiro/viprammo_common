package viprammo.message;

import java.io.Serializable;

public class UserInputMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char key;
	
	public UserInputMessage() {
		this.message_kind = MessageKIND.KIND_USERINPUT;
	}
	
	public void setKeyChar(char c) {
		this.key = c;
	}

	public char getKeyChar() {
		return this.key;
	}
	
}
