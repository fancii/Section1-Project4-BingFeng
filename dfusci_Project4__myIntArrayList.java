import java.util.Arrays;
public class myIntArrayList {
	/**
	 * @Author: Dominic Fusci
	 * @version: 1.0
	 * description: This program will mimic array lists and print out the size and contents of arrays.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray={1, 2, 3, 4, 5};
		int size = myArray.length;
		int index = 0;
		int value = 3;
		myIntArrayList Array1 = new myIntArrayList();
		myIntArrayList Array2 = new myIntArrayList(myArray);
		myIntArrayList Array3 = new myIntArrayList(Array2);
		
		System.out.println("Size of Array1: " + Array1.size());
        Array1.print();

        System.out.println("Size of Array2: " + Array2.size());
        Array2.print();

        System.out.println("Size of Array3: " + Array3.size());
		Array3.print();
	}
	
	public myIntArrayList(){
		
	}
	
	public myIntArrayList(int[] anArray){
		
	}
	
	public myIntArrayList(myIntArrayList anExample){
		
	}
	
	public static void add(int index, int value, int size){
		int[] temp = new int[index];
		int end = int[5] temp;
		temp[size+1];
		temp[0-(index-1)] = myArray[0-(index-1)];
		temp[index]=value;
		temp[index + 1 - end] = myArray[index-end];
		myArray[size+1];
		return myArray;
		}
	
	
	public static int remove(int index){
		int[] temp = new int[index];
		for(int i=0; i < temp.length -1; i++){
			int x = temp[i];
		}
		return x;
		
		
	}
	
	public static void simpleSort(int[] sortArray){
		for(int i=1; i < sortArray.length; i++){
			int x = sortArray[i];
			int y = i;
			while (y > 0 && sortArray[y-1] > x){
				sortArray[y] = sortArray[y-1];
				y--;
			}
			sortArray[y] = x;
		}
	}
	
	public boolean equals(int[] array1, int[] array2){
		if(array1 == array2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isCongruent(int[] myIntArrayList, int[] anotherList){
		int[] sort1=myIntArrayList;
		int[] sort2=anotherList;
		simpleSort(sort1);
		simpleSort(sort2);
		if(anotherList.length == myIntArrayList.length && sort1 == sort2){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public int get(int index){
		return index;
	}
	
	static int size(int[] anArray){
		return anArray.length;
	}
	
	public void clear(int[] anArray){
		anArray = null;
	}
	
	public void print(int[] anArray) {
	    System.out.print(Arrays.toString(anArray) + ",");
	}
}

