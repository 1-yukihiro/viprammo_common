package viprammo;

/**
 * トレースでどの程度まで表示するか @n
 * 指定したトレースレベルより下のものが表示される。@n
 * kAllとkNoneはConstantsのみで使用。
 */
public enum TraceLevel {
	/** 全て表示する */
	kAll,
	/** メモ */
	kNotice,
	/** 警告 */
	kWarning,
	/** エラー・異常終了へ以降可能 */
	kError,
	/** 致命的・続行不可 */
	kFatal,
	/** 全て表示しない */
	kNone
};

