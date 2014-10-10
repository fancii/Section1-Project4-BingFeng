import java.util.ArrayList;
import java.util.Scanner;

/**
* @author Sergio Martinez                  *
* @version 1.2, 28 September 2014  *
* Description  This project consists of an array class which acts similarly to Java's ArrayList Class.                      *
*                                                    *
*/

public class myIntArrayList {

	public int size;
	int [] array;
	
	
	public myIntArrayList(){
		this.array = new int [10];		
		this.size = 10;   //sets array size
		
		}
	
	public myIntArrayList(int [] array1){
		this.size = array.length;
		this.array = new int [array.length];
		
		for(int i = 0; i < array.length; i++ ){
			this.array [i] = array [i];
			
		}}
	
	
	public myIntArrayList(myIntArrayList array2){ //Copy constructor
		array = array2.array;
		size = array2.size;
		
		
	}	
	
	public void add(int i, int value){
		
		if (i < array [0] || i > array.length){
			ensureCapacity(array.length+1);//adds at the end 
			
		}
			
		
	
		}
		
		
	private void ensureCapacity(int minCapacity) {
		minCapacity = array.length; 
		
	}

	public void remove (int i){
		for(i = 1; i < array.length; i++){
			if (i < array [0] || i > array.length){
				array [i] = array [i-1];  				//this moves everything greater than index i = 0 left which which replace the first element
		}
		}
	}
	
	
	
	
	
	public void simpleSort(){
		for(int i = 0; i < array.length; i++){
			int temp = array[i];
			int f;
				for (f = i-1; f >= 0 && temp < array[i]; f++){
					array[f+1] = array[f];
					array[f+1] = temp;
				}}
					
				}

	
	
	public int get(int i){
		if (i < array [0] || i > array.length){
			return array [0];	//returns first element if index is out of boundaries
		}
		return i;
			
	}
	
	
	
	
	public int indexOf(int value){
		value = array [0];
		return value;
	}
	
	
	
	
	public int size(){
		return size;
		
	}
	
	
	
	
	public void clear(){
		for(int i = 0; i < array.length; i++){
				array [i] = array [i-10];  /*this shifts all of the elements to the left 
											10 therefore emptying the array list*/
		
	}
		
	}
	
	
	
	
	public void print(){
		print();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}}



