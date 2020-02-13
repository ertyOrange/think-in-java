package stringUtile;

public class stringUtilTest {

	public static void main(String[] args) {
		System.out.println(test(""));
		
	}
	
	public static boolean test (String testString) {
		
		return testString.length()!=0 && testString.equals("");
	}
	public static boolean isEmpty(CharSequence cs) {
	        return cs == null || cs.length() == 0;
	    }
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
