package ProblemSetVI;

public class LinkedListDeleteDuplicate {
		// Definition for singly-linked list.
		static class ListNode {
			public int val;
			public ListNode next;
			ListNode(int x) {
				val = x;
				next = null;
			}
		}

		public ListNode deleteDuplicates(ListNode a) {
			ListNode past, present;
			past = a;
			if (past.next == null)
				return a;
			present = a.next;
			if (present.next == null) {
				if (past.val == present.val)
					past.next = null;
				return a;
			}
			while (present != null) {
				if (past.val == present.val) {
					past.next = present.next;
					present.next = null;
					present = past.next;
				} else {
					past = past.next;
					present = present.next;
				}
			}
			return a;
		}
		public void printLinkedList(ListNode root) {
			while (root != null) {
				System.out.print(root.val + "-->");
				root = root.next;
			}
			System.out.println("");
		}

		public static void main(String arg[]) {
			LinkedListDeleteDuplicate ss = new LinkedListDeleteDuplicate();
			ListNode root = new ListNode(1);
			root.next = new ListNode(1);
			root.next.next = new ListNode(2);
			root.next.next.next = new ListNode(3);
			root.next.next.next.next = new ListNode(3);
			// root.next.next.next.next.next =new ListNode(4);
			ss.printLinkedList(root);
			ListNode a = ss.deleteDuplicates(root);
			ss.printLinkedList(a);

		}

	}
