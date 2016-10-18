package ProblemSetVI;

import java.util.*;

public class StringReverseWithoutWords {
	public String reverseWords(String a) {
		if (a.length() == 1)
			return a;
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		boolean flag = true;
		int str1value = 0;
		int str2value = a.length();
		for (int i = 0, j = a.length() - 1; i <= j;) {
			if (a.charAt(i) != ' ')
				i++;
			else if (a.charAt(j) != ' ')
				j--;
			else {
				str1.insert(
						0,
						a.substring(str1value, i) == " " ? "" : a.substring(
								str1value, i));
				str1.insert(0, " ");
				str2.append(a.substring(j, str2value) == " " ? "" : a
						.substring(j, str2value));
				str2value = j;
				i++;
				j--;
				str1value = i;
			}
			if (i == j && a.charAt(i) != ' ' && a.charAt(j) != ' ') {
				str2.append(" ");
				str2.append(a.substring(str1value, str2value));
			}
		}
		String str3 = "" + str2.append(str1);
		return str3.trim().replaceAll(" +", " ");

	}

	public static void main(String[] args) {
		StringReverseWithoutWords ss = new StringReverseWithoutWords();
		String str = "j  j   ";
		System.out.println(ss.reverseWords(str));
	}
}
