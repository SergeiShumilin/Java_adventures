package ClearAlgorithms;

import java.util.Scanner;

/**
 * Created by Sergey on 06.03.2018.
 */
public class Prime {
	public static void main(String[] args) {
		int n = 0;

		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			n = scanner.nextInt();
		}
		for (int i = 2; i <= n; i++) {

			while (n % i == 0 && test(i)) {
				System.out.print(i + " ");
				n = n / i;

			}
		}


		// put your code here
	}

	public static boolean test(long n) {
		for (long i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}


}
