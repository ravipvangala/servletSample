package guisofiati.utils;

public class Format {
	
	public static String phoneNumber(String number) {
		String countryNumber = number.substring(0, 2);
		String ddd = number.substring(2, 4);
		String number_range_1 = number.substring(4, 9);
		String number_range_2 = number.substring(9, 13);
				
		StringBuilder format = new StringBuilder();
		format.append("+").append(countryNumber).append(" (").append(ddd).append(")")
				.append(number_range_1).append("-").append(number_range_2);
		
		return format.toString();
	}
}
