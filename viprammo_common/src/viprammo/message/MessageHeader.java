package viprammo.message;

public class MessageHeader {

	//ヘッダーに入れる文字列VIPRAMMOでも入れとくか
	private String message_string = "VIPARAMMO";
	
	//送信元IPアドレス
	private String send_ip ="";
	
	//バージョンを表す文字列（今後要るかも？）
	private int version = 0;

	public MessageHeader() {
		
	}
	
	public MessageHeader(String msg_str) {
		this.message_string = msg_str;
	}
	
	public MessageHeader(String msg_str, String sendip) {
		this.message_string = msg_str;
		this.send_ip = sendip;
	}

	public String getMessage_string() {
		return message_string;
	}

	public void setMessage_string(String message_string) {
		this.message_string = message_string;
	}

	public String getSend_ip() {
		return send_ip;
	}

	public void setSend_ip(String send_ip) {
		this.send_ip = send_ip;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
