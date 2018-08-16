package ClearAlgorithms;

import MyOwnPack.AbleToFly;

/**
 * Created by Sergey on 24.01.2018.
 */

/*................1 вариант методов union и find - БЫСТРЫЙ ПОИСК
..................2 вариант - БЫСТРОЕ ОБЪЕДИНЕНИЕ (так же N^2 в худшем случае в лучшем - линейная)
..................3 вариант самыый быстрый описан в книге стр 217
* В каждом элементе массива находится номер цельного компонента
* Так как нам приходится в лучших случаях выполнять N-1 вызова метода union а след
* (N+3)(N-1) обращения к массиву, то алгоритм обладает N^2 сходимостью
*
*
* */
public class UF {
	int A;
	private int[] id;
	private int count;

	public UF(int N) {

		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public int count() {
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	int find(int p) {
		A++;
		return id[p];
	}

	void union(int p, int q) {

		//объединение p и q в один компонент
		int pID = find(p);
		int qID = find(q);

		//если p q уже принадлежат одному компоненту
		//то ничего делать не надо

		if (pID == qID) return;

		//компонент p переименовывается в q
		for (int i = 0; i < id.length; i++) {
			A++;
			if (id[i] == pID) id[i] = qID;
		}
		count--;
	}

	public static void main(String[] args) {

		int N = 10;
		UF uf = new UF(N);
		for (int i = 0; i < 10; i++) {
			int p = (int) (Math.random() * 10);
			int q = (int) (Math.random() * 10);
			if (uf.connected(p, q)) continue;
			uf.union(p, q);
			System.out.println(p + " " + q);

		}
		System.out.println(uf.count + " компонентов");
		System.out.println("_________________________________");
		System.out.println("Количество обращений к массиву " + uf.A);
	}

	int findN2(int p) {
		//поиск имени компонента
		//метод возвращает значение корня дерева и union проверяет
		// принадл ли два числа к одному дереву
		while (p != id[p]) p = id[p];
		return p;
	}

	void unionN2(int p, int q) {
		//приведение p и q к общему корню
		int pRoot = find(p);
		int qRoot = find(q);
		if (pRoot == qRoot) return;

		id[pRoot] = qRoot;

		count--;


	}


}
