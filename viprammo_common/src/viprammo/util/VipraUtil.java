package viprammo.util;

import java.util.List;

import viprammo.TraceLevel;
import static viprammo.Constants.*;

/**
 * viprammo用のutilクラス（インスタンス化禁止）
 * @author Yukihiro
 *
 */
public class VipraUtil {

	private VipraUtil() {}
	
	/**
	 * ByteクラスのListをプリミティブなbyte配列にするユーティリティ
	 * てかこれ要るの？オートボクシングって機能があるはずだよね。。。1.5準拠にしてるからダメ？
	 * @param src_list Byteの入ったList
	 * @return プリミティブbyteの配列
	 */
	public static byte[] CollectionsByteToPbyte(List<Byte> src_list) {
		byte[] b = new byte[(int)src_list.size()];
		for (int i = 0; i < b.length; i++) {
			b[i] = src_list.get(i);
		}
		return b;
	}

	/**
	 * 標準出力へのトレース
	 * @param text 
	 */
	public static void Trace(Object text) {
		Trace(text, TraceLevel.kNotice);
	}
	
	/**
	 * 
	 * @param text
	 */
	public static void TraceError(Object text) {
		Trace(text, TraceLevel.kError);
	}

	/**
	 * 標準出力へのトレース
	 * @param text
	 * @param level トレースの重要度
	 */
	public static void Trace(Object text, TraceLevel level)
	{
		if (kDebug && kTraceLevel.ordinal() <= level.ordinal()) {
			System.out.println(text);
		}
	}

	/**
	 * 例外のスタックトレースを標準出力へ
	 * @param exception 
	 */
	public static void Trace(Exception exception) {
		if (kDebug && kTraceLevel.ordinal() <= TraceLevel.kError.ordinal()) {
			exception.printStackTrace();
		}
	}

	/**
	 * 例外のスタックトレースを標準出力へ
	 * @param exception 
	 */
	public static void Trace(Error exception) {
		if (kDebug && kTraceLevel.ordinal() <= TraceLevel.kFatal.ordinal()) {
			exception.printStackTrace();
		}
	}
}
