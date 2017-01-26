package ProblemSetVI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSumClosest {
	public int threeSumClosest(ArrayList<Integer> a, int b) {
		int res = a.get(0) + a.get(1) + a.get(2);
		if (a.size() == 3)
			return res;
		Collections.sort(a);
		for (int i = 0; i < a.size() - 2; i++) {
			int low = i + 1;
			int high = a.size() - 1;
			int num = b - a.get(i);
			while (low < high) {
				int sum = a.get(low) + a.get(high);
				if (sum == num)
					return b;
				else if (sum < num)
					low++;
				else
					high--;

				int diff = Math.abs(sum - num);
				int otherDiff = Math.abs(res - b);

				if (diff < otherDiff)
					res = sum + a.get(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		ThreeSumClosest ss = new ThreeSumClosest();
		Integer arr[] = { 7, 2, -5, 10, -3, 4, 9, 1, -6, -10 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(
				Arrays.asList(arr));
		System.out.println(ss.threeSumClosest(arrayList, 2));

	}
}
