package ProblemSetVI;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

		public int removeDuplicates(ArrayList<Integer> a) {
			for (int i = 0; i < a.size() - 1;) {
				if (a.get(i).equals(a.get(i + 1))) {
					a.remove(i);
				} else {
					i++;
				}
			}
			return a.size();
		}

		public static void main(String[] args) {
			RemoveDuplicatesSortedArray ss = new RemoveDuplicatesSortedArray();
			Integer arr[] = { 5000, 5000, 5000 };
			ArrayList<Integer> arrayList = new ArrayList<Integer>(
					Arrays.asList(arr));
			System.out.println(ss.removeDuplicates(arrayList));

		}
	}
