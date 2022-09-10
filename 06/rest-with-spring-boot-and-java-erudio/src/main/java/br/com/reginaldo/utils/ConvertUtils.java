package br.com.reginaldo.utils;

public class ConvertUtils {

	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) {
			return 0D;
		}
		
		String number = strNumber.replaceAll(",", ".");
		
		if (StringUtils.isNumeric(number)) {
			return Double.parseDouble(number);
		}
		
		return 0D;
	}
}
