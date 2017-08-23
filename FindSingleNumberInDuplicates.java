package ProblemSetVI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSingleNumberInDuplicates {

	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
		int x = 0;
		for (int y : a) {
			x = x ^ y;
		}
		return x;
	}

	public static void main(String arg[]) {
		FindSingleNumberInDuplicates ss = new FindSingleNumberInDuplicates();
		List<Integer> a = new ArrayList<Integer>();
		Integer a1[] = { 1, 2, 2, 3, 1 };
		a.addAll(Arrays.asList(a1));
		System.out.println(ss.singleNumber(a));
	}
}
