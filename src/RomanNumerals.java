import java.util.*;
import java.util.TreeMap;

public class RomanNumerals {
	public final int[] araNumbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	public final String[] romNumbers = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	public int convertToInteger(String romanNum) {
		/*InputValidator iValidate = new InputValidator();
		InputSlicer iSlice = new InputSlicer();
		
		boolean stringValid = iValidate.inputValidatorRomNum(romanNum);
		if (stringValid == true) {
			return 0;
		} else {
			}*/
			for (int i = 0; i < romNumbers.length; i++) {
				if (romanNum.startsWith(romNumbers[i])) {
						return araNumbers[i] + convertToInteger(romanNum.replaceFirst(romNumbers[i], ""));
					}
				}return 0;
	}
}

class InputValidator {
	public static boolean inputValidatorRomNum(String romanNum) {
		InputSlicer iSlice = new InputSlicer();
		int romNumLength = InputSlicer.stringLength(romanNum);
		char[] slicedRomNum = new char[romNumLength];
		slicedRomNum = InputSlicer.sliceString(romanNum);
		boolean invalidRomNum = false;
		
		for (int i = 0; i < romNumLength; i++) {
			if ('I' == slicedRomNum[i]) {
				if ('I' == slicedRomNum[i++]) {
					if ('I' == slicedRomNum[i++]) {
						if ('I' == slicedRomNum[i++]) {
							invalidRomNum = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < romNumLength; i++) {
			if ('X' == slicedRomNum[i]) {
				if ('X' == slicedRomNum[i++]) {
					if ('X' == slicedRomNum[i++]) {
						if ('X' == slicedRomNum[i++]) {
							invalidRomNum = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < romNumLength; i++) {
			if ('C' == slicedRomNum[i]) {
				if ('C' == slicedRomNum[i++]) {
					if ('C' == slicedRomNum[i++]) {
						if ('C' == slicedRomNum[i++]) {
							invalidRomNum = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < romNumLength; i++) {
			if ('M' == slicedRomNum[i]) {
				if ('M' == slicedRomNum[i++]) {
					if ('M' == slicedRomNum[i++]) {
						if ('M' == slicedRomNum[i++]) {
							invalidRomNum = true;
						}
					}
				}
			}
		}
		
		return invalidRomNum;
	}
}

class InputSlicer {
	public static int stringLength(String romanNum) {
		int romLength = romanNum.length();
		return romLength;
	}
	
	public static char[] sliceString(String romanNum) {
		
		char[] romChar = romanNum.toCharArray();
		return romChar;
	}
}
