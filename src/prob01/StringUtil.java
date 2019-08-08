package prob01;

public class StringUtil {
	
	public static String concatenate(String[] strArr) {
		String resultStr = "";
		for(int i=0; i<strArr.length;i++) {
			resultStr = resultStr+strArr[i];
		}
		return resultStr;
		
	}


}
