package ProblemSetVI;

import java.util.ArrayList;

public class CombinationPossible {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (n == 0)
			return output;
		for (int i = 1; i <= n; i++)
			a.add(i);
		generate(a, output, new ArrayList<Integer>(), 0, k);
		return output;
	}

	public void generate(ArrayList<Integer> a,
			ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp,
			int start, int k) {
		if (k == 0) {
			output.add(new ArrayList<Integer>(temp));
			System.out.println(output);
			return;
		}
		for (int i = start; i < a.size(); i++) {
			temp.add(a.get(i));
			generate(a, output, temp, i + 1, k - 1);
			temp.remove(temp.size() - 1);
		}
	}
	public static void main(String arg[]) {
		CombinationPossible ss = new CombinationPossible();
		System.out.println(ss.combine(4, 2));

	}

}
