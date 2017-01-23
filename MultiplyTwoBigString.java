package ProblemSetVI;

import Solution.Solution;

public class MultiplyTwoBigString {

		public String multiply(String a, String b) {
			String a1 = new StringBuilder().append(a).reverse().toString();
			String b1 = new StringBuilder().append(b).reverse().toString();
			StringBuilder sb = new StringBuilder();
			int[] str = new int[a1.length() + b.length()];
			for (int i = 0; i < b1.length(); i++) {
				for (int j = 0; j < a1.length(); j++) {
					str[i + j] += Integer.parseInt("" + a1.charAt(j))
							* Integer.parseInt("" + b1.charAt(i));
				}
			}
			for (int i = 0; i < str.length; i++) {
				int mod = str[i] % 10;
				int carry = str[i] / 10;
				if (i + 1 < str.length)
					str[i + 1] += carry;
				sb.insert(0, mod);
			}
			while(sb.charAt(0)=='0' && sb.length()>1)
				sb.deleteCharAt(0);
			return sb.toString();
		}

		public static void main(String[] args) {
			MultiplyTwoBigString ss = new MultiplyTwoBigString();
			System.out.println(ss.multiply("12", "100"));

		}
	


}
