package viprammo;

/**
 * アプリ全体で共通すべき定数
 */
public final class Constants
{
	/** デバッグかどうか */
	public static final Boolean kDebug = true;
	
	/** 現行のトレースのレベル */
	public static final TraceLevel kTraceLevel = TraceLevel.kAll;
	
	/** 接続先 */
	public static final String kURL = "118.243.3.245";
//	public static final String kURL = "localhost";
	public static final String kImageURL = kURL;

	/** TCP接続時のポート */
	public static final Integer kTCPPort = 10001;
	/** UDP接続時のポート */
	public static final Integer kUDPPort = 10500;
}
