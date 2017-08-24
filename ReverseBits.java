package ProblemSetVI;

public class ReverseBits {
	public long reverse(long A) {
		long rev = 0;
		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			System.out.println(Long.toBinaryString(rev));
			System.out.println(Long.toBinaryString(1 << i));
			System.out.println(Long.toBinaryString(A & (1 << i)));
			System.out.println(Long.toBinaryString(A));
			if ((A & (1 << i)) != 0) {
				rev |= 1;
				System.out.println(Long.toBinaryString(rev));
			}
		}
		System.out.println(Long.toBinaryString(rev));
		return rev;

	}

	public static void main(String arg[]) {
		ReverseBits ss = new ReverseBits();
		// System.out.println(Integer.toBinaryString(2));
		// System.out.println(Integer.toBinaryString(2<<3));
		System.out.println(ss.reverse(3));

	}

}
