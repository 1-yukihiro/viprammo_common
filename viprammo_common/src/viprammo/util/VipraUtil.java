package viprammo.util;

import java.util.List;

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
}
