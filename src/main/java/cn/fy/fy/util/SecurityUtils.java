package cn.fy.fy.util;
import org.apache.commons.codec.digest.DigestUtils;
public class SecurityUtils {
	public static String md5Hex(String value){
		return DigestUtils.md5Hex(value);
	}
	public static void main(String[] args) {
		String s = "images/fre_1.jpg";
		System.out.println(md5Hex(s));
	}
}
