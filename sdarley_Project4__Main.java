/*
 * @author Sarah Darley
 * @version 1.1, 28 September, 2014
 * This program is meant to emulate the Java ArrayList classs.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Something = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] Something2 = {2, 5, 1, 3, 6, 8, 9, 7, 10, 4};
		myIntArrayList myList1 = new myIntArrayList();
		myIntArrayList myList2 = new myIntArrayList(Something);
		myIntArrayList myList3 = new myIntArrayList(myList2);

		System.out.println("Size of myList1: " + myList1.size());
                myList1.print();
		
		System.out.println("Size of myList2: " + myList2.size());
                myList2.print();
		
		System.out.println("Size of myList3: " + myList3.size());
                myList3.print();
                
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
                        
                myList.add(2, 8);
                myList.add(3,9);
                System.out.println("Elements:");
                myList.print();
                myList.remove(-1);
                System.out.println("Elements:");
                myList.print();
                myList.remove(2);
                System.out.println("Elements:");
                myList.print();
                System.out.println("Get element: "+myList.get(1));
                System.out.println("index of:"+myList.indexOf(8));
                System.out.println("index of:"+myList.indexOf(-3));
                
                myIntArrayList myTestList2 = new myIntArrayList(Something);
                System.out.println(""+myList2.equals(myTestList2));
                System.out.println(""+myList2.equals(myList));
                
                myIntArrayList myTestList3 = new myIntArrayList(Something2);
                myList2.print();
                myTestList3.print();
                System.out.println("isCongruent: "+myList2.isCongruent(myTestList3));
                
		
	}
}

