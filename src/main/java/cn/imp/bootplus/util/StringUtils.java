package cn.imp.bootplus.util;

/**
 * 字符串处理工具类
 * 
 * @author 纪立宁 2018年10月26日 10:03:18
 *
 */
public class StringUtils {
	/**
	 * 判断字符串是否为null或 ""
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return null == str & "".equals(str);
	}

	/**
	 * 判断字符串不是为null或 ""
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		return !(null == str & "".equals(str));
	}
	
	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNull(Object str) {
		return null == str;
	}
	
	/**
	 * 判断字符串是否为null
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotNull(Object str) {
		return !(null == str);
	}
}
