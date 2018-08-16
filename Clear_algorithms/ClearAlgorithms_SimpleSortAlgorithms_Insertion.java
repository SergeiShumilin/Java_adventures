package ClearAlgorithms.SimpleSortAlgorithms;

/**
 * Created by Sergey on 26.01.2018.
 */
public class Insertion extends BasicMethods {
// время работы О(N^2)
	public static void sort(Comparable[] a){

		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && BasicMethods.less(a[j],a[j-1]); j--) {
				BasicMethods.exch(a,j,j-1);
			}
		}
	}


}
