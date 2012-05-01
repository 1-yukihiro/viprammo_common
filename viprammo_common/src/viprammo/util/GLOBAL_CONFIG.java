package viprammo.util;

import java.util.logging.Level;

public class GLOBAL_CONFIG {

	/**
	 * Levelの順番　　　　　　finest < finer < fine < config < info < warning < severe
	 * このログレベル使いづらいね debugとかがいいよねー
	 */
	public static Level LOG_LEVEL = Level.INFO;
	
	/**
	 * ログレベル設定用文字列（GUIで使用する）
	 */
	public static String[] LOG_LEVEL_STR = {"FINEST", "FIENER", "FINE", "CONFIG", "INFO", "WARNING", "SEVERE"};
	
}
