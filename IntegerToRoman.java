package ProblemSetVI;

import java.util.*;

public class IntegerToRoman {

	public String intToRoman(int a) {
		int length = String.valueOf(a).length();
		StringBuilder result = new StringBuilder();
		int digit = 1;
		while (a != 0 && digit <= length) {
			if (digitvalue(a, digit) == lengthToInt(digit + 1)
					- lengthToInt(digit)) {
				result.insert(0, IntegerToRoman(lengthToInt(digit + 1)));
				result.insert(0, IntegerToRoman(lengthToInt(digit)));
				a = a - (lengthToInt(digit + 1) - lengthToInt(digit));
				digit++;
			} else if (digitvalue(a, digit) == lengthToInt2(digit)
					- lengthToInt(digit)) {
				result.insert(0, IntegerToRoman(lengthToInt2(digit)));
				result.insert(0, IntegerToRoman(lengthToInt(digit)));
				a = a - (lengthToInt2(digit) - lengthToInt(digit));
				digit++;
			} else if (digitvalue(a, digit) != 0) {
				if (digit > 1) {
					if (digitvalue(a, digit) == lengthToInt2(digit)) {
						result.insert(0, IntegerToRoman(lengthToInt2(digit)));
						a = a - lengthToInt2(digit);
						digit++;
					} else {
						result.insert(0, IntegerToRoman(lengthToInt(digit)));
						a = a - lengthToInt(digit);
					}
				} else {
					if (digitvalue(a, digit) >= 5) {
						result.insert(0, IntegerToRoman(5));
						a = a - 5;
					} else {
						result.append(IntegerToRoman(lengthToInt(digit)));
						a = a - lengthToInt(digit);
					}
				}
			} else
				digit++;
		}
		return "" + result;
	}

	public int digitvalue(int a, int value) {
		String str = String.valueOf(a);
		String sub = str.substring(str.length() - value, str.length());
		return Integer.parseInt(sub);
	}

	public int lengthToInt(int length) {
		switch (length) {
		case 1:
			return 1;
		case 2:
			return 10;
		case 3:
			return 100;
		case 4:
			return 1000;
		}
		return 0;
	}

	public int lengthToInt2(int length) {
		switch (length) {
		case 1:
			return 5;
		case 2:
			return 50;
		case 3:
			return 500;
		case 4:
			return 5000;
		}
		return 0;
	}

	public String IntegerToRoman(int value) {
		switch (value) {
		case 1:
			return "I";
		case 5:
			return "V";
		case 10:
			return "X";
		case 50:
			return "L";
		case 100:
			return "C";
		case 500:
			return "D";
		case 1000:
			return "M";
		}
		return "Default";
	}

	public static void main(String[] args) {
		IntegerToRoman ss = new IntegerToRoman();
		int value = 150;
		System.out.println(ss.intToRoman(value));
	}
}
