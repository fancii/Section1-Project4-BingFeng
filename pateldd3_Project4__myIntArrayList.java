import java.util.Scanner;

public class myIntArrayList {

	private int[] anArray;
	private int[] copyanArray;
	private Integer integer;

	public myIntArrayList() {

		anArray = new int[0];

	}

	public myIntArrayList(int[] anArray) {

		this.anArray = anArray;

	}

	public myIntArrayList(myIntArrayList anExample) {

		for (int i = 0; i < anArray.length; i++) {

			anArray[i] = anExample.anArray[i];

		}

		for (int i = 0; i < copyanArray.length; i++) {

			copyanArray[i] = anExample.copyanArray[i];

		}
	}

	public void add(int index, int value) {

		int[] temp = new int[anArray.length + 1];

		for (int j = 0; j < anArray.length; j++) {
			temp[j] = anArray[j];

		}

		temp[anArray.length] = value;
		anArray = new int[temp.length];
		for (int i = 0; i < anArray.length; i++) {
			anArray[i] = temp[i];
		}

		temp[anArray.length] = value;

	}

	public int remove(int index) {

		return remove(index);

	}

	public void simplesort(int[] arr) {

		int i, j, minIndex, tmp;

		int n = arr.length;

		for (i = 0; i < n - 1; i++) {

			minIndex = i;

			for (j = i + 1; j < n; j++) {

				if (arr[j] < arr[minIndex])

					minIndex = j;

				if (minIndex != 1) {

					tmp = arr[i];

					arr[i] = arr[minIndex];

					arr[minIndex] = tmp;

				}
			}
		}

	}

	public boolean equals(Object[] a, Object[] a2) {

		if (a == a2)

			return true;

		if (a == null || a2 == null)

			return false;

		int length = a.length;

		if (a2.length != length)

			return false;

		for (int i = 0; i < length; i++) {

			Object o1 = a[i];
			Object o2 = a2[i];

			if (!(o1 == null ? o2 == null : o1.equals(o2)))

				return false;

		}

		return true;
	}

	public boolean isCongruent(myIntArrayList anotherList) {

		return true;

	}

	public int get(int index) {

		return index;

	}

	public int indexOf(int value) {

		return value;

	}

	public int size() {

		int size = anArray.length;
		return size;

	}

	public void clear() {

		for (int i = 0; i < size(); i++) {
			integer = (Integer) null;
			anArray[i] = integer;

		}
	}

	public void print() {

		System.out.println("Size:" + size());

	}

}
