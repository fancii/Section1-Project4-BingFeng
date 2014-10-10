public class Project4 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		myIntArrayList myList = new myIntArrayList();

		myList.add(0, 1);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.print();

		myList.add(0, 3);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.print();

		myList.add(0, 5);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.print();

		myList.add(0, 7);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.remove(7);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.print();

		myList.remove(7);

		System.out.println("Size is: " + myList.size());

		System.out.println("Elements:");

		myList.print();
		
		int[] Something = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		myIntArrayList myList1 = new myIntArrayList();

		myIntArrayList myList2 = new myIntArrayList(Something);

		myIntArrayList myList3 = new myIntArrayList(myList2);

		System.out.println("Size of myList1: " + myList1.size());

		myList1.print();

		System.out.println("Size of myList2: " + myList2.size());

		myList2.print();

		System.out.println("Size of myList3: " + myList3.size());

		myList3.print();
	}
}
