package stringUtile;

public class stringUtilTest {

	public static void main(String[] args) {
		System.out.println(test(""));
		
	}
	
	public static boolean test (String testString) {
		
		return testString.length()!=0 && testString.equals("");
	}
	/** 字符串不为空即可，不关心字符内容 */
	public static boolean isEmpty(CharSequence cs) {
	        return cs == null || cs.length() == 0;
	    }
	/** 字符串不为空同时，字符不为空白字符，空白字符包含空格、tab、换行等。*/
	public static boolean isBlank(CharSequence cs) {
	        int strLen;
	        if (cs == null || (strLen = cs.length()) == 0) {
	            return true;
	        }
	        for (int i = 0; i < strLen; i++) {
	            if (Character.isWhitespace(cs.charAt(i)) == false) {
	                return false;
	            }
	        }
	        return true;
	    }
}
