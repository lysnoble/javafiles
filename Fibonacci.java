
public class Fibonacci {
	public static void main(String args[]) {

		int[] fibSeq = new int[20];
		int sum = 0;

		fibSeq[0] = 1;
		fibSeq[1] = 1;

		for(int x = 2; x < fibSeq.length; x++) {
			fibSeq[x] = fibSeq[x - 2] + fibSeq[x - 1] ;

			System.out.println(fibSeq[x]) ;
		}

		for(int x = 2; x < fibSeq.length; x += 3) {
			sum = sum + fibSeq[x];
		}

		System.out.println(sum);

	}
}