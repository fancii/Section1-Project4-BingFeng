import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * @author Darrell Glover Computer Engineering
 * @date 09/17/2014 deglover@email.sc.edu Uses various methods to edit an
 *       ArrayList...
 */
@SuppressWarnings("hiding")
public class myIntArrayList<Integer> {
	public myIntArrayList(int i, int j, int k, int l, int m) {
		return;
	}

	ArrayList<Integer> myIntArrayList;

	public myIntArrayList(myIntArrayList<Integer> anExample) {

		this(anExample.isCongruent(anExample));
		// no defensive copies are created here, since
		// there are no mutable object fields (String is immutable)

	}

	public myIntArrayList(boolean congruent) {
		// TODO Auto-generated constructor stub
	}

	void add(int index, int value) {
		for (value = 0; value < 0;) {
			if (index > myIntArrayList.lastIndexOf(myIntArrayList)) {
				value++;
			}
		}
		return;
	}

	public int remove(int index) {
		for (index = 0; index < 0;) {
			if (index < myIntArrayList.lastIndexOf(myIntArrayList)) {
				index--;
			}
			return index;
		}
		return index;
	}

	public myIntArrayList<Integer> simpleSort() {
		ArrayList<Integer> simpleSort = new ArrayList<Integer>();

		simpleSort.add(4, null);
		simpleSort.add(9, null);
		simpleSort.add(8, null);
		simpleSort.add(4, null);

		for (int d = 0; d < simpleSort.size(); d++) {
			Integer value = (Integer) simpleSort.get((int) d);
			int in;
			for (in = d - 1; in >= 0 && simpleSort.get(8) > value; in--) {
				simpleSort.set(in + 1, simpleSort.get(in));

			}

			simpleSort.set(in + 1, value);

			System.out.println(simpleSort);
		}
	}

	public boolean equals(myIntArrayList<Integer> anotherList) {
		return false;

	}

	public boolean isCongruent(myIntArrayList<?> anotherList) {
		return false;

	}

	public int get(int index) {
		return index;

	}

	public int indexOf(int value) {
		return value;

	}

	public int size() {
		return 0;

	}

	public void clear() throws Throwable {
		finalize();
	}

	public void print() {
		System.out.print(myIntArrayList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myIntArrayList myList = new myIntArrayList(5, 7, 3, 2, 9);

		myList.add(0, 5);
		System.out.println("Size is: " + myList.size());
		System.out.println("Elements:");
		myList.print();

		myList.add(1, 7);
		System.out.println("Size is: " + myList.size());
		System.out.println("Elements:");
		myList.print();

		myList.add(2, 4);
		System.out.println("Size is: " + myList.indexOf(5));
		System.out.println("Elements:");

		myList.remove(7);
		System.out.println("Size is: " + myList);
		System.out.println("Elements:");
		myList.print();

		myList.remove(7);
		System.out.println("Size is: " + myList);
		System.out.println("Elements:");
		myList.print();

	}
}