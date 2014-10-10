/*
 * @author Sarah Darley
 * @version 1.1, 28 September, 2014
 * This class imitates the Java ArrayList class.
 */
public class myIntArrayList {
	private int[] myArray;
	private int[] tempArray;
	public myIntArrayList() {
		myArray = new int[0];
	}
	public myIntArrayList(int[] anArray){
		myArray = new int[anArray.length];
		myArray = anArray;
	}
	public myIntArrayList(myIntArrayList anExample){
		myArray = new int[anExample.size()];
		for(int i=0; i<anExample.size(); i++){
			myArray[i] = anExample.get(i);
		}
	}
	public int[] add(int index, int value){
		tempArray = new int[myArray.length+1];
		for(int i=0; i<myArray.length; i++){
			tempArray[i] = myArray[i];
		}
		if(index<0 || index>=myArray.length){
			tempArray[myArray.length]= value; 
		}
		else{
			for(int i=myArray.length-1; i>=index; i--){
				tempArray[i+1]=tempArray[i];
			}
			tempArray[index] = value;
		}
		myArray = new int[tempArray.length];
		myArray = tempArray;
		return myArray;
	}
	public int[] remove(int index){
		tempArray = new int[myArray.length-1];
		if(index>myArray.length){
			for(int i=0; i<myArray.length-1; i++){
				tempArray[i] = myArray[i];
			}
		}
		else if(index<0){
			for(int i=0; i<myArray.length-1; i++){
				tempArray[i] = myArray[i+1];
			}
		}
		else{
			for(int i=0; i<index; i++){
				tempArray[i] = myArray[i];
			}
			for(int i=index; i<tempArray.length; i++){
				tempArray[i] = myArray[i+1];
			}
		}
		myArray = new int[tempArray.length];
		myArray = tempArray;
		return myArray;
	}
	public myIntArrayList simpleSort(){
		int sortValue;
		int i;
		int j;
		for(i=1; i<myArray.length; i++){
			sortValue = myArray[i];
			for(j=i-1; (j>=0) && (myArray[j]<sortValue); j--){
				myArray[j+1] = myArray[j];
			}
			myArray[j+1] = sortValue;
			
		}	
		myIntArrayList sortedArrayList = new myIntArrayList(myArray);
		sortedArrayList.print();
		return sortedArrayList;
	}
	public boolean equals(myIntArrayList anotherList){
		boolean equal = false;
		if(myArray.length != anotherList.size()){
			equal = false;
		}
		else{
			for(int i=0; i<anotherList.size();i++){
				if(myArray[i] == anotherList.get(i)){
					equal = true;
				}
				else{
					equal = false;
					i = anotherList.size();
				}
			}
		}
		return equal;
	}
	public boolean isCongruent(myIntArrayList anotherList){
		boolean equal = true;
		if(myArray.length != anotherList.size()){
			equal = false;
		}
		else{
			myIntArrayList thisList = new myIntArrayList();
			for(int i=0; i<myArray.length; i++){
				thisList.add(i, myArray[i]);
			}
			anotherList = anotherList.simpleSort();
			thisList = thisList.simpleSort();
			for(int i=0; i<anotherList.size();i++){
				if(thisList.get(i) == anotherList.get(i)){
					equal = true;
				}
				else{
					equal = false;
					i = anotherList.size();
				}
			}
		}
		return equal;
	}
	public int get(int index){
		if(index<0){
			return myArray[0];
		}
		else if(index>=myArray.length){
			return myArray[myArray.length-1];
		}
		else{
			return myArray[index];
		}
	}
	public int indexOf(int value){
		for(int i=0; i<myArray.length; i++){
			if(myArray[i] == value){
				return myArray[i];
			}
		}
		return -1;
	}
	public int size(){
		return myArray.length;
	}
	public void clear(){
		myArray = new int[0];
	}
	public void print(){
		for(int i=0; i<myArray.length; i++){
			System.out.print(""+myArray[i]+" ");
		}
		System.out.println();
	}
}
