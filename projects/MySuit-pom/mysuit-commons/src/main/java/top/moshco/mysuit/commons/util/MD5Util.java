package top.moshco.mysuit.commons.util;

import java.security.MessageDigest;

/**
 * MD5工具类
 * 
 * 
 * 创建时间：2019年11月18日 下午2:36:19
 * 
 * @author moshco zhu
 *
 */
public class MD5Util {

	// 生成MD5
	public static String getMD5(String message) {
		String md5 = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5"); // 创建一个md5算法对象
			byte[] messageByte = message.getBytes("UTF-8");
			byte[] md5Byte = md.digest(messageByte); // 获得MD5字节数组,16*8=128位
			md5 = bytesToHex(md5Byte); // 转换为16进制字符串
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5;
	}

	// 二进制转十六进制
	public static String bytesToHex(byte[] bytes) {
		StringBuffer hexStr = new StringBuffer();
		int num;
		for (int i = 0; i < bytes.length; i++) {
			num = bytes[i];
			if (num < 0) {
				num += 256;
			}
			if (num < 16) {
				hexStr.append("0");
			}
			hexStr.append(Integer.toHexString(num));
		}
		return hexStr.toString().toUpperCase();
	}

	public static void main1(String[] args) {
		String pwd = getMD5("123");
		System.out.println(pwd);
	}
}
