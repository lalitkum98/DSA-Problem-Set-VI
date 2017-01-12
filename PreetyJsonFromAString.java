package ProblemSetVI;

import java.util.ArrayList;

public class PreetyJsonFromAString {

	public ArrayList<String> prettyJSON(String a) {
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		ArrayList<String> list = new ArrayList<String>();
		int countBraces = -1;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '{' || sb.charAt(i) == '[') {
				if (i > (countBraces + 1)) {
					list.add("" + sb.substring(0, i));
					sb.delete(countBraces + 1, i);
					i = countBraces;
				} else {
					list.add("" + sb.substring(0, i + 1));
					sb.replace(i, i + 1, "\t");
					countBraces++;
					i = countBraces;
				}
			} else if (sb.charAt(i) == ',') {
				list.add(sb.substring(0, i + 1) + "");
				sb.delete(countBraces + 1, i + 1);
				i = countBraces;
			} else if (sb.charAt(i) == '}' || sb.charAt(i) == ']') {
				if (i > (countBraces + 1)) {
					list.add("" + sb.substring(0, i));
					sb.delete(countBraces + 1, i);
					i = countBraces;
				} else {
					if (i > 1) {
						sb.replace(i - 1, i, "");
						countBraces--;
						if (sb.charAt(i) != ',') {
							list.add("" + sb.substring(0, i));
							i = countBraces + 1;
							sb.delete(countBraces + 1, i + 1);
						} else {
							list.add("" + sb.substring(0, i + 1));
							i = countBraces + 2;
							sb.delete(countBraces + 1, i + 1);
						}
						i = countBraces;
					}

				}
			}
		}
		sb.replace(0, 1, "");
		list.add("" + sb.substring(0, 1));
		return list;
	}

	public static void main(String[] args) {

		PreetyJsonFromAString ss = new PreetyJsonFromAString();
		String a = "{A:B,C:{D:E,F:{G:H,I:J}}}";
		// System.out.println(a.substring(0, a.length()));
		System.out.println(ss.prettyJSON(a));

	}
}
