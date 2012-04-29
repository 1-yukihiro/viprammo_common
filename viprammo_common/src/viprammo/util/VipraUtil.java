package viprammo.util;

import java.util.List;

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
}
