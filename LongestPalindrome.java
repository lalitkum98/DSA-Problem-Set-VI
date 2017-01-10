package ProblemSetVI;

public class LongestPalindrome {
	public String longestPalindrome(String a) {
		boolean[][] array = new boolean[a.length()][a.length()];
		if (a == "")
			return null;
		if (a.length() == 1)
			return a;
		// for length 1
		for (int i = 0; i < a.length(); i++) {
			array[i][i] = true;
		}
		// for length 2
		int start = 0;
		int end = 0;
		int maxLength = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == a.charAt(i + 1)) {
				array[i][i + 1] = true;
				if (maxLength < ((i + 1) - i)) {
					start = i;
					end = i + 1;
					maxLength = ((i + 1) - i);
				}
			} else {
				array[i][i + 1] = false;
			}

		}
		// more than 3
		for (int k = 2; k < a.length(); k++) {
			for (int i = 0; i < a.length() - k; i++) {
				int j = k + i;
				if (array[i + 1][j - 1] && a.charAt(i) == a.charAt(j)) {
					array[i][j] = true;
					if (maxLength < (j - i)) {
						start = i;
						end = j;
						maxLength = (j - i);
					}
				} else {
					array[i][j] = false;
				}
			}
		}
		return a.substring(start, end + 1);
	}

	public static void main(String[] args) {

		LongestPalindrome ss = new LongestPalindrome();
		String a = "";
		// System.out.println(a.substring(0, a.length()));
		System.out.println(ss.longestPalindrome(a));

	}
}
