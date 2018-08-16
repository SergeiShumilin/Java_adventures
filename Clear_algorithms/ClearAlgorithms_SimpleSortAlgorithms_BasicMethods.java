package ClearAlgorithms.SimpleSortAlgorithms;

import com.sun.corba.se.pept.transport.Selector;

/**
 * Created by Sergey on 26.01.2018.
 */
public class BasicMethods {

	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}

	public static void exch(Comparable[] a, int i, int j){
		Comparable t = a[i]; a[i] = a [j]; a[j] = t;
	}

	public static void main(String[] args){

		// Selection sort сортирует массив из 100000 эл. за 14 - 18 с
		// массив из 1млн. элементов за > 5 мин

		// Insertion sort сортирует массив из 100000 эл. за 8 - 9 с
		// массив из 1млн. элементов за > 5 мин

		// Shell sort сортирует массив из 100000 эл. за 34 мс
		// массив из 1млн. элементов за 213 мс
		// массив из 10млн. элементов за 1848 мс

		/*
		Быстрая сортировка сортирует массив из 1млн. за 220 мс
		массив из 10млн. элементов за 1200 мс
		* */

		int N = 1000;
		String[] strings = new String[]{"Н","А","Т","А","Ш","А","П","О","Л","Е","Щ","У","К"};
		Comparable[] ints = new Comparable[]{4,3,7,6,8,43,64,14,7,33,11,3,76,1,61,84,22,46};
		/*for (int i = 0; i < ints.length; i++) {
			ints[i] = (int) (Math.random()*Math.random()*100);
		}*/
		long Time1 = System.currentTimeMillis();
		FastSort.sort(ints);
		System.out.println("Время работы алгоритма: " + (System.currentTimeMillis() - Time1));
		long Time2 = System.currentTimeMillis();

		for (Comparable t:ints
		     ) {
			System.out.print(t + " ");
		}
//		ShellSort.sort(strings);
//		for (String s:strings
//		     ) {
//			System.out.print(s+" ");
//		}
//		System.out.println("Время работы алгоритма: " + (System.currentTimeMillis() - Time2));

	}

}
