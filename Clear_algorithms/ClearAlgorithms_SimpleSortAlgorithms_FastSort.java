package ClearAlgorithms.SimpleSortAlgorithms;

/**
 * Created by Sergey on 18.02.2018.
 */

/*
Быстрая оортировка
самый популярный алгоритм сортировки, N*lnN и нет необходимости в дополнительной
памяти как в нисходящей сортировке слиянием.

Для малых массивов лучше использовать алгоритм сортировки вставками, для этого в
части if (hi <= lo) return; необходимо использовать if (hi <= lo + М) Insertion.sort();
Размер отсечки зависит от системы, но обычно должно хорошо работать от 5 до 15. Эффективность
можно повысить на 20 - 30%

Стандартным решением для алгоритма является перемешивания массива в первом методе sort
Этот подход был предложен еще разработчиком Холлом в 60. Это позволяет избежать
худшего сллучая и сделать время работы алгоритма предсказуемым.

Если пивот элемент выбирать первый или последний то время работы n^2. Если серединный элемент то то же
Если медиану трех то тоже 

* */
public class FastSort {
	public static void sort(Comparable[] a) {
		sort(a,0,a.length-1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {

		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);

	}

	private static int partition(Comparable[] a, int lo, int hi) {

		int i = lo, j = hi + 1;
		Comparable v = a[lo];
		while (true) {
			while (BasicMethods.less(a[++i], v)) if (i == hi) break;
			while (BasicMethods.less(v, a[--j])) if (j == lo) break;
			if (i >= j) break;
			BasicMethods.exch(a, i, j);
		}
		BasicMethods.exch(a, lo, j);
		return j;

	}
}
