package viprammo.message;

import java.io.Serializable;

public class UserAuthMessage extends Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uname;
	private String password;
	
	public UserAuthMessage() {
		this.message_kind = MessageKIND.KIND_GENERAL_LOGIN;
	}
	
	public void setUserName(String username) {
		this.uname = username;
	}
	
	public void setPasswd(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return this.uname;
	}
	
	public String getPasswd() {
		return this.password;
	}
}
