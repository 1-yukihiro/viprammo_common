package viprammo.message;

import java.io.Serializable;

import org.msgpack.annotation.MessagePackMessage;

/**
 * メッセージを表す抽象クラス
 * 送信メッセージはこれを必ずextend
 * @author Yukihiro
 *
 */
@MessagePackMessage
public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * メッセージ種別
	 */
	public int message_kind = 0;
	
	/**
	 * メッセージユーザ名を格納する
	 * チャットメッセージならチャット発言ユーザ・キャラクタ情報メッセージなら対象キャラクタ
	 */
	public String user = "";
	
	/**
	 * メッセージ種別を返す
	 * @return メッセージ種別
	 */
	public int getKIND() {
		return this.message_kind;
	}
	
	/**
	 * メッセージ種別をセットする
	 */
	public void setKIND(int kind) {
		this.message_kind = kind;
	}

	/**
	 * ユーザ名をセットする
	 * @return
	 */
	public String getUser() {
		return this.user;
	}
	
	/**
	 * ユーザ名を取得する
	 * @param user_name
	 */
	public void setUser(String user_name) {
		this.user = user_name;
	}
}
