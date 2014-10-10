package project4;

/**
 * 
 * @author Joseph Varella
 * @version 1 28 September 2014
 * this program does various things with array lists
 *
 */

import java.util.ArrayList;

public class myIntArrayList {
	private int[] Array;
	private int size;
	public myIntArrayList(){
		
	}

	public myIntArrayList(int[] anArray){
		setSize(anArray.length);
		Array = new int[size()];
		for(int i = 0; i<size(); i++){
			setArray(i, anArray[i]);
		}
	}
	
	public  myIntArrayList(myIntArrayList anExample){
		setSize(anExample.size());
		Array = new int[size()];
		for(int i = 0; i < size(); i++){
			setArray(i, anExample.get(i));
		}
	}
	
	public void add(int index, int value){
		int t0 = value;
		int t1 = 0;
		int[] temp = new int[size() +1];
		for(int i=0; i<size(); i++){
			temp[i] = get(i);
		}
		
		setSize(size() +1);
		Array = new int[size()];
		if(index < size()){
			for(int spot = 0; spot<size(); spot++){
				if(spot<index){
					setArray(spot, temp[spot]);
				}
				else{
					if(t0==value){
						t0 =temp[spot];
						setArray(spot,value);
					}
					else{
						t1 = t0;
						t0 = temp[spot];
						setArray(spot,t1);
					}
				}
			}
		}
		else{
			for(int spot =0; spot<size(); spot++){
				if(t0 == value){
					t0 =temp[spot];
					setArray(spot,value);
				}
				else{
					t1 = t0;
					t0 = temp[spot];
					setArray(spot, t1);
				}
			}
		}
	}
	
	public int remove(int index){
		int[] temp = new int[size()];
		for(int i = 0;i < size(); i++){
		temp[i] = get(i);
		}
		 
		setSize(size() - 1);
		Array = new int[size()];
		if(index < size() + 1){
		for(int j = 0; j < size(); j++){
		if(j <= index){
		setArray(j, temp[j]);
		}else{
		setArray(j, temp[j+1]);
		}
		}
		return temp[index];
		}else{
		for(int i = 0; i < size(); i++){
		setArray(i, temp[i+1]);
		}
		return temp[0];
		}
			 
	}
	
	public myIntArrayList simpleSort(ArrayList<Integer> localList){
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		for(int i=0; i<localList.size(); i++){
			int min = Integer.MAX_VALUE;
			int minIndex=0;
			for(int j = 0; j<localList.size(); j++){
				if( localList.get(j)<min ){
					min = localList.get(j);
					minIndex = j;           
				}

			}
			sortedList.add(min);
			localList.set(minIndex, Integer.MAX_VALUE);
		}
		for(int i=0;i<sortedList.size();i++){

			System.out.print(sortedList.get(i)+ " ");
		}
		return null;
	}
	
	public boolean equals(myIntArrayList anotherList){
		return false;
	}
	
	public boolean isCongruent(myIntArrayList anotherList){
		return false;
	}
	
	public int get(int index){
		if(index < size()){
			return Array[index];
		}
		else{
			return Array[0];
		}
	}
	
	public int indexOf(int value){
		int index = -1;
		for(int i = 0; i < size(); i++){
		if(get(i) == value){
		index = i;
		}
		}
		return index;
	}
	
	public void setArray(int index, int value){
		Array[index] = value;
	}
	
	public void setSize(int aSize){
		size = aSize;
	}
	
	public int size(){
		return size;
	}
	
	public void clear(){
		Array = new int[size()];
	}
	
	public void print(){
		for(int i = 0; i < size(); i++){
			System.out.print(get(i));
			if(i == size() - 1){
			}else{
			System.out.print(", ");
			}
			}
			System.out.print(".\n");
	}
}
