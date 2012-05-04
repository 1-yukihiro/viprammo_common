package viprammo.message;

/**
 * メッセージ種別を判別するクラス
 * @author Yukihiro
 *
 */
public class MessageKIND {

	//キャラクターの状態変更に関するメッセージ
	public static final int KIND_CHARACTER_MODIF = 1;
	
	//チャットメッセージ
	public static final int KIND_CHAT_MESSAGE = 2;
	
	//ログインに使用するメッセージ
	public static final int KIND_GENERAL_LOGIN = 3;

	private MessageKIND() {}
	
}
