/**
* @author Stewart Schrieffer *
* @version 1.1 September 28, 2014 *
* Description Mimics an ArrayList in function *
* *
*/
public class myIntArrayList {
	
	private int[] myArray;
	
	public myIntArrayList(){
		myArray=new int[0];
	}
	

	public myIntArrayList(int[] anArray){
		myArray=new int[anArray.length];
		
			for(int i=0; i<anArray.length; i++){
				myArray[i]=anArray[i];
		}
	}
	

	public myIntArrayList(myIntArrayList anExample){
		
		myArray=new int[anExample.size()];
		
			for(int i=0;i<anExample.size();i++){
				myArray[i]=anExample.get(i);
		}
	}
	
	public void add(int index, int value){

		int[] holder = new int[myArray.length+1];
		
		if(index<0){
			index=0;
		}
		
		if(index>myArray.length){
			index=myArray.length;
		}

			for(int i=0; i<index; i++){
				holder[i]=myArray[i];
			}
		holder[index]=value;
		
			for(int j=index; j<myArray.length;j++){
				holder[j+1]=myArray[j];
			}
			
			myArray=holder;
	}
	public void remove(int index){
		int[] holder = new int[myArray.length-1];
		
		if(index<0){
			index=0;
		}
		
		if(index>myArray.length){
			index=myArray.length-1;
		}
		
			for(int i=0;i<index;i++){
				holder[i]=myArray[i];
			}
		
			for(int j=index; j<myArray.length-1;j++){
				holder[j]=myArray[j+1];
			}
			
			myArray=holder;
			
	}
	public myIntArrayList simpleSort(){
		int tank=0;
		int j;
		
		for(int i=0;i<myArray.length;i++){
			tank=myArray[i];
			
				for(j=i-1; j>=0 && myArray[j]<tank; j--){
					myArray[j+1]=myArray[j];
				}
				
				myArray[j+1]=tank;
		}
		return this;
	}
	public void print(){
		
		for(int i=0;i<myArray.length;i++){
			System.out.print(myArray[i]+ " ");
		}
	}
	public boolean equals(myIntArrayList anotherList){
		if(anotherList.size()!=myArray.length){
			return false;
		}
		
			for(int i=0;i<myArray.length;i++){
				if(myArray[i]!=anotherList.get(i))
					return false;
			}
			
		return true;
	}
	public int size(){
		return myArray.length;
	}
	public int get(int index){
		if(index<0)
			index=0;
		
		if(index>myArray.length)
			index=myArray.length-1;
		
		return myArray[index];
	}
	public void clear(){
		int[] blankArray = new int[0];
		myArray=blankArray;
	}
	public int indexOf(int value){
		for(int i=0; i<myArray.length;i++){
				if(myArray[i]==value)
					return i;
		}
		return -1;
	}
	public boolean isCongruent(myIntArrayList anotherList){
		
		int[] savedArray=myArray;
		anotherList.simpleSort();
		this.simpleSort();
		
		if(myArray.length!=anotherList.size()){
			return false;
		}
		
			for(int i=0;i<myArray.length;i++){
				if(myArray[i]!=anotherList.get(i))
					return false;
			}
			
		myArray=savedArray;
		return true;
	}
	
	
		

	public static void main(String[] args) {

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
	}
	
}
