package viprammo.message;

import java.io.Serializable;

public class ChatMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message_str = "";

	private String user = "";
	
	public ChatMessage() {
		this.message_kind = MessageKIND.KIND_CHAT_MESSAGE;
	}

	public String getMessage_str() {
		return message_str;
	}

	public void setMessage_str(String message_str) {
		this.message_str = message_str;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
}
