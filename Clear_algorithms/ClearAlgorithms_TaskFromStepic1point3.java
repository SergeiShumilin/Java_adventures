package ClearAlgorithms;

import java.util.Scanner;

/**
 * Created by Sergey on 06.03.2018.
 */
public class TaskFromStepic1point3 {


	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int N;

		N = scanner.nextInt();

		System.out.println("N создано" + N);
		int[] a = new int[N];
		int[] b = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Массив а создан");
		for (int i = 0; i < N; i++) {
			b[i] = scanner.nextInt();
		}
		System.out.println("Массив b создан");

		System.out.println(maxPair(a, b));


	}

	static Pair maxPair(int[] a, int[] b) {

		Pair pair = new Pair();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < b.length; j++) {
				if (a[i] + b[j] > pair.sum) {
					pair.sum = a[i] + b[j];
					pair.i = i;
					pair.j = j;
				}
			}
		}

		return pair;
	}

	static class Pair {

		int i;
		int j;
		int sum;

		public Pair() {
		}

		public Pair(int i, int j, int sum) {
			this.i = i;
			this.j = j;
			this.sum = sum;
		}

		@Override
		public String toString() {
			return i + " " + j;
		}
	}


}
