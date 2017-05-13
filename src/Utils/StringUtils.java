package Utils;

public class StringUtils {

	/**
	 * @author xuy
	 * @param str
	 * @param IDentifierString
	 * @return String 给list加上sql括号和逗号 eg：(0,1,2,3) to ('0','1','2','3')
	 */
	public static String addQuotationMark(String str, String IDentifierString) {
		StringBuffer result = new StringBuffer();
		str = str.replaceAll(" ", "");
		String[] strs = str.split(IDentifierString);
		for (int i = 0; i < strs.length; i++) {
			result.append("'");
			result.append(strs[i]);
			result.append("'");
			if (i != strs.length) {
				result.append(",");
			}
		}
		return result.toString();
	}

	/**
	 * @author xuy
	 * @param str
	 * @return boolean 判断String 是否为null或者""
	 */
	public static Boolean isNotBlank(String str) {
		if (str != null) {
			str.replace(" ", "");
			return !str.equals("");
		}
		return false;
	}
}
