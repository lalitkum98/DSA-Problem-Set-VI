package ProblemSetVI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForARange {

		public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int starting = -1;
			int ending = -1;
			int size = a.size();
			int start = binarySearchstart(a, b, 0, size - 1, starting);
			int end = binarySearchEnd(a, b, 0, size - 1, ending);
			list.add(start);
			list.add(end);
			return list;
		}

		private int binarySearchstart(List<Integer> a, int value, int start,
				int end, int starting) {
			if (end == start && a.get(start) == value)
				return start;
			if (end == start && a.get(start) != value)
				return -1;

			int mid = start + ((end - start) / 2);

			if (a.get(mid) == value) {
				starting = mid;
			}
			if (a.get(mid) >= value) {
				int stValue = binarySearchstart(a, value, start, mid, starting);
				if (stValue != -1)
					starting = stValue;
			} else {
				int stValue = binarySearchstart(a, value, mid + 1, end, starting);
				if (stValue != -1)
					starting = stValue;
			}
			return starting;
		}

		private int binarySearchEnd(List<Integer> a, int value, int start, int end,
				int ending) {
			if (end == start && a.get(start) == value)
				return start;
			if (end == start && a.get(start) != value)
				return -1;

			int mid = start + ((end - start) / 2);

			if (a.get(mid) == value) {
				ending = mid;
			}

			if (a.get(mid) <= value) {
				int enValue = binarySearchEnd(a, value, mid + 1, end, ending);
				if (enValue != -1)
					ending = enValue;

			} else {
				int enValue = binarySearchEnd(a, value, start, mid, ending);
				if (enValue != -1)
					ending = enValue;
			}
			return ending;
		}

		public static void main(String arg[]) {
			SearchForARange ss = new SearchForARange();
			List<Integer> a = new ArrayList<Integer>();
			Integer a1[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4,
					4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
					4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
					4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
					5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
					5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
					6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
					6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
					6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7,
					7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
					7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8,
					8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
					8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
					8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
					9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
					9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10,
					10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
					10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
					10, 10, 10, 10, 10 };
			a.addAll(Arrays.asList(a1));
			System.out.println(ss.searchRange(a, 3));
		}
	}
