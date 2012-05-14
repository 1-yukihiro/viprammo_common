package viprammo.message;

import java.io.Serializable;

/**
 * メッセージ種別を判別するクラス
 * @author Yukihiro
 *
 */
public class MessageKIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//キャラクターの状態変更に関するメッセージ
	public static final int KIND_CHARACTER_MODIF = 1;
	
	//チャットメッセージ
	public static final int KIND_CHAT_MESSAGE = 2;
	
	//ログインに使用するメッセージ
	public static final int KIND_GENERAL_LOGIN = 3;

	//ユーザからの入力メッセージ（移動とか技使用よか）
	public static final int KIND_USERINPUT = 4;
	
	private MessageKIND() {}
	
}
