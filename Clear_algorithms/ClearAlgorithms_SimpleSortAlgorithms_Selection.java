package ClearAlgorithms.SimpleSortAlgorithms;

/**
 * Created by Sergey on 26.01.2018.
 */
public class Selection {

	public static void sort(Comparable[] a){

		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				if (BasicMethods.less(a[j],a[min]))min = j;
			}
			BasicMethods.exch(a,i,min);
		}
	}
}
