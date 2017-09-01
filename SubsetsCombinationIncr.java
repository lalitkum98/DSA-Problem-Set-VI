package ProblemSetVI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SubsetsCombinationIncr {

	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		output.add(new ArrayList<Integer>());
		if (a.size() == 0)
			return output;
		Collections.sort(a);
		generate(a, output, new ArrayList<Integer>(), 0);
		return output;
	}

	public void generate(ArrayList<Integer> a,
			ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp,
			int index) {
		for (int i = index; i < a.size(); i++) {
			temp.add(a.get(i));
			output.add(new ArrayList<Integer>(temp));
			System.out.println(output);
			generate(a, output, temp, i + 1);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String arg[]) {
		SubsetsCombinationIncr ss = new SubsetsCombinationIncr();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(4);
		System.out.println(ss.subsets(a));

	}

}
