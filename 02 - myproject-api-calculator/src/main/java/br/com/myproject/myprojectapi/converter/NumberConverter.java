package br.com.myproject.myprojectapi.converter;

public class NumberConverter {

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");

	}

	public static double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(strNumber))
			return Double.parseDouble(number);
		return 1D;
	}

	public static int convertToInteger(String strNumber) {
		if (strNumber == null)
			return 0;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(strNumber))
			return Integer.parseInt(number);
		return 1;
	}
}
