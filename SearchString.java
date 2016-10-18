package ProblemSetVI;
import java.util.*;
public class SearchString {
		public int strStr1(String haystack, String needle) {
			if (haystack.isEmpty() || needle.isEmpty())
				return -1;
			int start = 0;
			int end = 0;
			for (int i = 0; i < haystack.length(); i++) {
				if (haystack.charAt(i) == ' ') {
					end = i;
					String word = haystack.substring(start, i);
					if (word.equals(needle)) {
						System.out.println("word" + word + " : " + "needle"
								+ needle);
						return start;
					}
					start = i + 1;
				}
			}
			end = haystack.length();
			String word = haystack.substring(start, end);
			if (word.equals(needle)) {
				System.out.println("word" + word + " : " + "needle" + needle);
				return start;
			}
			return -1;
		}

		public int strStr(String haystack, String needle) {
			if (haystack.isEmpty() || needle.isEmpty())
				return -1;
			int i = 0;
			int j = 0;
			int start = 0;
			while (i < haystack.length()) {
				start = i;
				while (haystack.charAt(i) == needle.charAt(j)) {
					i++;
					j++;
					if (j == needle.length())
						return start;
					if (i == haystack.length())
						return -1;
				}
				j = 0;
				i = ++start;
			}
			return -1;
		}

		public static void main(String[] args) {
			SearchString ss = new SearchString();
			String str = "baabaaabbbababbbbbbaababbbaabbbbaabababababbaa";
			System.out.println(ss.strStr(str,
					"babbabaabababbbababaababbaabbbaaaabaaabbab"));
		}
	}
