/**
 * @author kyle smith
 * @version 1.0 9/28/2014
 *  Add functionality to arrays by providing useful methods
 *
 */

package ks2.Project4;

public class myIntArrayList {
	private int[] theArray;

	public myIntArrayList(){
		theArray = new int[0];
	}//default constructor

	public myIntArrayList(int[] anArray){
		this.theArray = new int[anArray.length];
		for (int i = 0; i < theArray.length; i++){
			this.theArray[i] = anArray[i];
		}//duplicate constructor for loop
	}//duplicate constructor

	public myIntArrayList(myIntArrayList anExample){
		this.theArray = new int[anExample.theArray.length];
		for (int i = 0; i < this.theArray.length; i++){
			this.theArray[i] = anExample.theArray[i];
		}//for loop duplicates arrays
	}//copy constructor

	public void add (int index, int value){
		int[] newArray = new int[(this.theArray.length +1)];
		if (index < 0){
			newArray[0] = value;
			for (int i = 0; i < this.theArray.length; i++){
				newArray[(i+1)] = this.theArray[i];
			}//for loop duplicates the remainder of the array
		}//if index < 0
		else if (0 <= index && index <= this.theArray.length){
			for (int i = 0; i < index; i++){
				newArray[i] = this.theArray[i];
			}//copy before addition
			newArray[index] = value;//add given index and value
			for (int i = (index + 1); i < newArray.length; i++){
				newArray[i] = this.theArray[i-1];
			}//copy after addition
		}//if index exists
		else if (this.theArray.length < index){
			for (int i=0; i < this.theArray.length; i ++){
				newArray[i] = this.theArray[i];
			}//duplicate existing array
			newArray[this.theArray.length + 1] = value;
		}//if index too high
		this.theArray = new int[newArray.length];
		for (int i = 0; i < newArray.length; i++){
			this.theArray[i] = newArray[i];
		}
	}//add method

	public void remove (int index){
		int[] newArray = new int[this.theArray.length -1];
		if (index < 0){
			for (int i = 0; i < newArray.length; i++){
				newArray[i] = this.theArray[i+1];
			}
		}//if index < 0
		else if (0 <= index && index <= this.theArray.length){
			for (int i=0; i < index; i++){
				newArray[i] = this.theArray[i];			
			}
			for (int i=index; i < newArray.length; i++){
				newArray[i] = this.theArray[i+1];
			}
		}//if index exists
		else if (this.theArray.length < index){
			for (int i =0; i < newArray.length; i ++){
				newArray[i] = this.theArray[i];
			}//duplicate existing array
		}//if index too high
		this.theArray = new int[newArray.length];
		for (int i = 0; i < newArray.length; i++){
			this.theArray[i] = newArray[i];
		}
	}//remove method

	public myIntArrayList simpleSort(){
		myIntArrayList newList = new myIntArrayList();
		newList.theArray = new int[this.theArray.length];
		int minIndex = 0;
		int minValue = this.theArray[0];
		for (int i = 0; i < newList.theArray.length; i++){
			for (int j = 0; j < this.theArray.length; j++ ){
				if (minValue > this.theArray[j]){
					minValue = this.theArray[j];//replace minValue if new min is found
					minIndex = j;
				}//if new min
				this.remove(minIndex);
			}//finds new low, adds to newList, removes from existing.
			newList.theArray[i] = minValue;
		}//for loop populates newList from low to high
		return newList;
	}//simpleSort method

	public boolean equals(myIntArrayList anotherList){
		boolean equality = true;
		if (anotherList.theArray.length == this.theArray.length){
			for (int i = 0; i < anotherList.theArray.length; i++){
				if (anotherList.theArray[i] == this.theArray[i]) equality = true;
				else {
					equality = false;
					break;
				}
			}
		}
		return equality;
	}//equals method

	public boolean isCongruent(myIntArrayList anotherList){
		if (anotherList.theArray.length != this.theArray.length){
			return false;
		}//if not equal, false
		else {
			this.simpleSort();
			anotherList.simpleSort();
			return this.equals(anotherList);
		}//otherwise, sort both and compare by index and return results
	}//isCongruent method

	public int get(int index){
		int value = 0;
		if (0 <= index && index <= this.theArray.length){
			value = this.theArray[index];
		}//if requested index is within array
		else if (index < 0){
			value = this.theArray[0];
		}// if less than 0 return index 0
		else if (index > this.theArray.length){
			value = this.theArray[this.theArray.length];
		}//if index greater than highest index, return last index
		return value;
	}//get method

	public int indexOf(int value){
		int index = -1;
		for (int i = 0; i < this.theArray.length; i++){
			if (this.theArray[i] == value){
				index = i;
				break;
			}//check each index, if match found record index and break
		}//for loop
		return index;
	}//index of method

	public int size(){
		return this.theArray.length;
	}//size method

	public void clear(){
		while (this.theArray.length > 0){
			this.remove(0);
		}//while array size is > 0 remove index 0
	}//clear method
	
	public void print(){
		for (int i = 0; i < theArray.length; i++){
			System.out.print(theArray[i] + " ");
		}//for
	}//print method
}//class

