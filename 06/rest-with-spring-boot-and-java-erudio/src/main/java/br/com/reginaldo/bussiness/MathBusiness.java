package br.com.reginaldo.bussiness;

import br.com.reginaldo.exceptions.UnsupportedMathOperationException;
import br.com.reginaldo.utils.ConvertUtils;
import br.com.reginaldo.utils.StringUtils;

public class MathBusiness {

	public static Double sum(String numberOne, String numberTwo) {

		if (!StringUtils.isNumeric(numberOne) || !StringUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return ConvertUtils.convertToDouble(numberOne) + ConvertUtils.convertToDouble(numberTwo);
	}

	public static Double sub(String numberOne, String numberTwo) {

		if (!StringUtils.isNumeric(numberOne) || !StringUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return ConvertUtils.convertToDouble(numberOne) - ConvertUtils.convertToDouble(numberTwo);
	}
	
	public static Double mul(String numberOne, String numberTwo) {

		if (!StringUtils.isNumeric(numberOne) || !StringUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}

		return ConvertUtils.convertToDouble(numberOne) * ConvertUtils.convertToDouble(numberTwo);
	}
	
	public static Double div(String numberOne, String numberTwo) {

		if (!StringUtils.isNumeric(numberOne) || !StringUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		if(ConvertUtils.convertToDouble(numberTwo).equals(0D)) {
			throw new UnsupportedMathOperationException("Please numberTwo can't be zero");
		}

		return ConvertUtils.convertToDouble(numberOne) / ConvertUtils.convertToDouble(numberTwo);
	}
	
	public static Double med(String numberOne, String numberTwo) {

		if (!StringUtils.isNumeric(numberOne) || !StringUtils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return (ConvertUtils.convertToDouble(numberOne) + ConvertUtils.convertToDouble(numberTwo))/2;
	}
	
	public static Double sqrt(String numberOne) {

		if (!StringUtils.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return Math.sqrt(ConvertUtils.convertToDouble(numberOne));
	}
}
