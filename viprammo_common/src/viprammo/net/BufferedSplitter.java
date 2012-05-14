package viprammo.net;

import java.nio.ByteBuffer;

/**
 * バッファリング読み込みデータをうまい感じで分割処理してくれるクラス
 * @author Yukihiro
 *
 */
public class BufferedSplitter {

	//処理に使用するバイトバッファ
	ByteBuffer buffer = ByteBuffer.allocateDirect(1024*5);
	
	//データのlength
	private int data_length = 0;
	
	//データの長さを指定しないと使い物にならんのでデフォルトコンストラクタは禁止
	@SuppressWarnings("unused")
	private BufferedSplitter() {}
	
	public BufferedSplitter(int length) {
		this.data_length = length;
	}
	
	public void add(byte[] rcv_data) {
		
		buffer.put(rcv_data);
		
		
	}
	
}
