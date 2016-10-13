package ProblemSetVI;

import java.util.*;

public class RomanToInteger {
	public int romanToInt(String a) {
		int result = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			int value = RomanToInteger(a.charAt(i));
			if (a.length() - 1 != i) {
				if (RomanToInteger(a.charAt(i)) < RomanToInteger(a
						.charAt(i + 1))) {
					result = result - value;
				} else
					result = result + value;
			} else
				result = result + value;
		}
		return result;
	}

	public int RomanToInteger(char value) {
		switch (value) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	public static void main(String[] args) {
		RomanToInteger ss = new RomanToInteger();
		String str = "XIV";
		System.out.println(ss.romanToInt(str));
	}
}
