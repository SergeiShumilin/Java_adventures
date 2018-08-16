package ClearAlgorithms;

import java.util.Scanner;

/**
 * Created by Sergey on 07.03.2018.
 */
public class TaskFromStepicAttemptN2 {

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

		maxPair(a,b);


	}


	static void maxPair(int[] a, int[] b){
		if (a.length==0 || b.length == 0){return;}

		Pair pair = new Pair(0,0,0);

		for (int i = b.length-1; i >= maxElement(a) ; i--) {
			if (a[maxElement(a)]+b[i]>pair.sum){pair.sum = a[maxElement(a)]+b[i];}
		}
		System.out.println(pair);
	}

	static int maxElement(int[] a){
		int MAX = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>MAX){MAX = i;}
		}
		return MAX;
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
