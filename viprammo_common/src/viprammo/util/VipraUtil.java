package viprammo.util;

import java.util.List;

import viprammo.TraceLevel;
import static viprammo.Constants.*;

/**
 * viprammo�p��util�N���X�i�C���X�^���X���֎~�j
 * @author Yukihiro
 *
 */
public class VipraUtil {

	private VipraUtil() {}
	
	/**
	 * Byte�N���X��List���v���~�e�B�u��byte�z��ɂ��郆�[�e�B���e�B
	 * �Ă�����v��́H�I�[�g�{�N�V���O���ċ@�\������͂�����ˁB�B�B1.5�����ɂ��Ă邩��_���H
	 * @param src_list Byte�̓�����List
	 * @return �v���~�e�B�ubyte�̔z��
	 */
	public static byte[] CollectionsByteToPbyte(List<Byte> src_list) {
		byte[] b = new byte[(int)src_list.size()];
		for (int i = 0; i < b.length; i++) {
			b[i] = src_list.get(i);
		}
		return b;
	}

	/**
	 * �W���o�͂ւ̃g���[�X
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
	 * �W���o�͂ւ̃g���[�X
	 * @param text
	 * @param level �g���[�X�̏d�v�x
	 */
	public static void Trace(Object text, TraceLevel level)
	{
		if (kDebug && kTraceLevel.ordinal() <= level.ordinal()) {
			System.out.println(text);
		}
	}

	/**
	 * ��O�̃X�^�b�N�g���[�X��W���o�͂�
	 * @param exception 
	 */
	public static void Trace(Exception exception) {
		if (kDebug && kTraceLevel.ordinal() <= TraceLevel.kError.ordinal()) {
			exception.printStackTrace();
		}
	}

	/**
	 * ��O�̃X�^�b�N�g���[�X��W���o�͂�
	 * @param exception 
	 */
	public static void Trace(Error exception) {
		if (kDebug && kTraceLevel.ordinal() <= TraceLevel.kFatal.ordinal()) {
			exception.printStackTrace();
		}
	}
}
