package ProblemSetVI;
public class TreeToLinkedListAllOnRight {

		static class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) {
				val = x;
			}
		}

		public TreeNode flatten(TreeNode a) {
			if (a.left == null && a.right == null)
				return a;
			if (a.left != null)
				flatten(a.left);
			if (a.right != null)
				flatten(a.right);
			TreeNode first = a;
			TreeNode temp = a.right;
			a.right = a.left;
			a.left = null;
			while (a.right != null) {
				a = a.right;
			}
			a.right = temp;
			return first;
		}

		public static void main(String arg[]) {
			TreeToLinkedListAllOnRight ss = new TreeToLinkedListAllOnRight();
			TreeNode tr = new TreeNode(1);
			tr.left = new TreeNode(2);
			tr.right = new TreeNode(3);
			tr.left.left = new TreeNode(4);
			tr.right.left = new TreeNode(6);
			tr.left.right = new TreeNode(8);
			TreeNode a = ss.flatten(tr);
			while (a.right != null) {
				System.out.println(a.val);
				a = a.right;

			}

		}

	}

