package ClearAlgorithms.SimpleSortAlgorithms;

/**
 * Created by Sergey on 26.01.2018.
 */
public class ShellSort {

	public static void sort(Comparable[] a){

		int N = a.length;
		int h = 1;
		while (h < N/3) h = 3*h+1; //1, 4, 13, 40
		while (h >= 1){
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && BasicMethods.less(a[j], a[j-h]) ; j -=h)
					BasicMethods.exch(a,j, j-h);

				for (Comparable s:a
				     ) {
					System.out.print(s+" ");

				}
				System.out.println();
			}
			h = h/3;
		}
	}
}
