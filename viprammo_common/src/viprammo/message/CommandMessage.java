package viprammo.message;

import java.util.ArrayList;
import java.util.List;

import org.msgpack.annotation.MessagePackMessage;

@MessagePackMessage
public class CommandMessage {

	/**
	 * メッセージヘッダー
	 */
	public MessageHeader msg_header;
	
	/**
	 * メッセージリスト ホントはprivateにしたいがmessagepack的に無理らしい
	 */
	public List<Message> message_list = new ArrayList<Message>();
	
	/**
	 * メッセージリストを返す
	 * @return メッセージリスト
	 */
	public List<Message> getMessageList() {
		return this.message_list;
	}
	
	/**
	 * メッセージをセット（add）する
	 * @param msg メッセージオブジェクト
	 */
	public void addMessage(Message msg) {
		this.message_list.add(msg);
	}
	
	public void setMessageHeader(MessageHeader msgheader) {
		this.msg_header = msgheader;
	}
	
	public MessageHeader getMessageHeader() {
		return this.msg_header;
	}
	
}
