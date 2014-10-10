import java.util.Scanner;
import java.util.ArrayList;

	public class myIntArrayList {
		
		//declare things here
		private boolean eq = false; // the check if 2 lists are equal
		private boolean con = false; // the check if 2 list are congruent
		private ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		private ArrayList<Integer> myCopyList = new ArrayList<Integer>();
		int[] myArray = new int[0];
		
		
	public static void main(String[]args){
		
		System.out.println("Need to make use of a method, "
				+ "why not Zoidberg?");
	}
	public myIntArrayList(){
		//make the AL here
	}
	public myIntArrayList(int [] anArray){
		//that allows the user to create an initial myintarraylist
		//that is equivalent to an array passed to the constructor
		for(int i: anArray)
		{
			myArrayList.add(i);
		}
	}
	public myIntArrayList(myIntArrayList anExample){
		//will create an intMyArrayList identical to the one
		//passed to it. This is called the copy constructor
		myArrayList = myCopyList;
	}
	public void add(int index, int value){
		//need to check for appropriate index, if the index is
		//outside the array boundaries, attach either on the end
		// or the beginning, whichever is closest, (-2 -> 0)
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(index > myArrayList.size())
		{
			index = myArrayList.size();
		}
		if (index < 0)
			index = 0;
		
		for(int i = 0; i < myArrayList.size(); i++)
		{
			temp[i] = myArrayList[i];
		}
		int m = myArrayList.size();
		m++;
		myArrayList.clear();
		myArrayList.size(m);
		//myArrayList[size+1]; why doesn't this work?
		for(int i = 0; i < index; i++)
		{
			myArrayList[i] = temp[i]; // I would like to know why this does not work, and also what would make it work, because I have spent several hours trying to figure this out and this is my final outcome :(
		}
		myArrayList[index] = value;
		
		for(int i = index+1; i < temp.size(); i++)
		{
			myArrayList[i+1] = temp[i];
		}
	}
	public int remove(int index){
		// remove wherever the index is from the array, if outside
		//then remove the first or last element
		
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		//temp1.size() == myArrayList.size();
		
		for(int i = 0; i < index; i++)
		{
			temp1(i) = myArrayList(i);
		}
		for(int i = index +1; i < myArrayList.size(); i++)
		{
			temp2(i) = myArrayList(i);
		}
		myArrayList.clear();
		for(int i = 0; i < temp1.size(); i++)
		{
			myArrayList(i) = temp1(i);
		}
		for(int i = 0; i < temp2.size(); i++)
		{
			myArrayList(i) = temp2(i);
		}
		
	}
	public myIntArrayList simpleSort(){
		//will return another myIntArrayList object with the
		//contents of the current object sorted using an
		//insertion sort
		boolean check = true;
		int temp3;
		//do I need a second list? I don't think so.
		for(int k =0; k < myArrayList.size(); k++)
		{
			
				while(check)
				{
					int i =1;
					if(myArrayList[i] < myArrayList[i-1])
					{
						temp3 = myArrayList[i];
						myArrayList[i] = myArrayList[i-1];
						myArrayList[i-1] = temp3;
						i--;
					}
					if(myArrayList[i] > myArrayList[i+1])
					{
						temp3 = myArrayList[i+1];
						myArrayList[i+1] = myArrayList[i];
						myArrayList[i] = temp3;
					}
					if(i = 0)
						check = false;
					if(i = myArrayList.size())
						check = false;
			
				}
			
		}
		return myArrayList;
	}
	public boolean equals(myIntArrayList anotherList){
		//will return 1 if the two ArrayLists are equal,
		//else return 0
		if(anotherList.size() == myArrayList.size())
		{
			for(int i = 0; i < myArrayList.size(); i++)
			{
				if((anotherList.indexOf(i)) != myArrayList.indexOf(i))
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public boolean isCongruent(myIntArrayList anotherList){
		//will return 1 if the two arraylists are congruent,
		//otherwise return 0
		
		anotherList.simpleSort();
		myArrayList.simpleSort();
		
		 if(anotherList.size() == myArrayList.size())
		{
			for(int i = 0; i < myArrayList.size(); i++)
			{
				if((anotherList.indexOf(i)) != myArrayList.indexOf(i))
				{
					return false;
				}
			}
			return true;
		}
		return false;
		 
	}
	public int get(int index){
		//if index is out of boundary then return either
		//first or last element
		if(index > myArrayList.size()){
			return myArrayList.indexOf(myArrayList.size()-1);
		}else if(index < myArrayList.size()){
			return myArrayList.indexOf(0);
		}else{
		int w = myArrayList.indexOf(index);
		return w;
		}
	}
	public int indexOf(int value){
		//returns index of first occurance of value
		for(int i =0; i < myArrayList.size(); i++)
		{
			if(myArrayList.indexOf(i) == (value))
			{
				return i;
			}
		}
		System.out.println("The value is not in the array.");
		return -1;
		
	}
	public int size(){
		//I assume returns the size?
		return myArrayList.size();
	}
	public void clear(){
		//empties the myIntArrayList
		int sizes = 0;
		sizes = myArrayList.size();
		
	}
	public void print(){
		//prints all the elements or the myintarraylist in row
		//delimited by one space
		for(int i =0; i < myArrayList.size(); i++)
		{
			System.out.println(myArrayList.indexOf(i) + " ");
		}
	}


	}


