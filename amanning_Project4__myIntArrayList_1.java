/*Alicia Manning
 * 9.28.14
 * This project creates an arraylist like the default array list in java
 */
public class myIntArrayList {
	private int[] myArrayList;
	private int size;


	// Creates an initial myIntArrayList with a set size of 0.
	public myIntArrayList(){
		setSize(0);
	}


	// Creates a myIntArrayList that copies the size and contents of an array parameter.
	public myIntArrayList(int[] anArray){
		setSize(anArray.length);
		myArrayList = new int[size()];
		for(int i = 0; i < size(); i++){
			setArray(i, anArray[i]);
		}
	}


	// Creates a myIntArrayList that copies the size and contents of an myIntArrayList parameter.
	public myIntArrayList(myIntArrayList anExample){
		setSize(anExample.size());
		myArrayList = new int[size()];
		for(int i = 0; i < size(); i++){
			setArray(i, anExample.get(i));
		}
	}

	// Sets the size variable to the integer specified.
	public void setSize(int aSize){
		size = aSize;
	}

	// returns the value of the size integer variable.
	public int size(){
		return size;
	}

	// Sets the value at position index equal to the specified value parameter.
	public void setArray(int index, int value){
		myArrayList[index] = value;
	}

	// Clears the array of data by overwriting the old array with a new one of the same size.
	public void clear(){
		myArrayList = new int[size()];
	}

	// Prints out the contents of the array.
	public void print(){
		for(int i = 0; i < size(); i++){
			System.out.print(get(i));
			if(i == size() - 1){
			}
			else{
				System.out.print(", ");
			}
		}
		System.out.print(".\n");
	}

	// This method checks to see if the myIntArrayList is empty.
	public boolean isEmpty(){
		boolean check = true;
		for(int i = 0; i < size(); i++){
			if(get(i) != 0){
				check = false;
			}
		}
		return check;
	}

	// This method returns the value found at a given index parameter within the myIntArrayList.
	public int get(int index){
		if(index < size()){
			return myArrayList[index];
		}
		else{
			return myArrayList[0];
		}
	}

	//inserts a value in to the myIntArrayList at the given index parameter. If the index is
	// out of bounds of the myIntArrayList the number is added to the beginning of the list.
	public void add(int index, int value){
		
		int temp0 = value;
		int temp1 = 0;
		int[] temp = new int[size() + 1];
		
		for(int i = 0; i < size(); i++){
			temp[i] = get(i);
		}

		setSize(size() + 1);

		myArrayList = new int[size()];

		if(index < size()){
			for(int position = 0; position < size(); position++){
				if(position < index){
					setArray(position, temp[position]);
				}
				else{
					if(temp0 == value){
						temp0 = temp[position];
						setArray(position, value);
					}
					else
					{
						temp1 = temp0;
						temp0 = temp[position];
						setArray(position, temp1);
					}
				}
			}
		}
		else{
			System.out.println("Index out of bounds, adding to the beginning of the list. ");

			for(int position = 0; position < size(); position++){
				if(temp0 == value){
					temp0 = temp[position];
					setArray(position, value);
				}else{
					temp1 = temp0;
					temp0 = temp[position];
					setArray(position, temp1);
				}
			}
		}
	}

	//removes the value at a given index and shifts the remaining values up in the list.
	// If the index given is out of bounds then the first value in the list will be removed.
	public int remove(int index){
		int[] temp = new int[size()];

		for(int i = 0;i < size(); i++){
			temp[i] = get(i);
		}

		setSize(size() - 1);
		myArrayList = new int[size()];

		if(index < size() + 1){
			for(int j = 0; j < size(); j++){
				if(j <= index){
					setArray(j, temp[j]);
				}
				else{
					setArray(j, temp[j+1]);
				}
			}
			return temp[index];
		}
		else{
			for(int i = 0; i < size(); i++){
				setArray(i, temp[i+1]);
			}
			return temp[0];
		}
	}

	//checks to see if a value exists within the myIntArrayList.
	public boolean contains(int value){
		boolean check = false;
		for(int i = 0; i < size(); i++){
			if(get(i) == value){
				check = true;
			}
		}
		return check;
	}

	//returns the index of a given value within the myIntArrayList. If the index is out of bounds
	public int indexOf(int value){
		int index = -1;
		for(int i = 0; i < size(); i++){
			if(get(i) == value){
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		
		myIntArrayList myList1 = new myIntArrayList(); //creates a list

		myList1.print()	;//prints list

	}
}




