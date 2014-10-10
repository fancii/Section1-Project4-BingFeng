
/**
 * @Joshua Boland
 *9-24-14 v1.0
 *
 */
public class myIntArrayList {
	private int[] anArray;
	private myIntArrayList anExample;
	private int index;
	private int value;
	private int size;
	private int length;
	public myIntArrayList(){
		//this.anArray = new int[0];
		int[] anArray = new int[0];
		this.anArray = anArray;
		//System.out.println(anArray.length);
		//anExample = new myIntArrayList(anArray);
	}
	public myIntArrayList(int[] anArray){ 
		this.anArray = anArray;
		//anExample = new myIntArrayList(anArray);
	}
	public myIntArrayList(myIntArrayList anExample){
		this.anExample = anExample;
		this.anArray = anExample.anArray;

	}
	public void add(int index, int value){//
		int[] temp = new int[getAnArray().length+1];//creates temp 1 larger than current array
		if(index < 0 || index > size()){
			add(size()-1, value);
		}
		for(int i = 0; i < index;i++){
			setIndex(i);
			temp[i]=get(i);//getAnArray(get(i));//get(i);
		}

		temp[getIndex()]=value;
		setIndex(getIndex()+1);

		for(int i = getIndex(); i < temp.length;i++){
			setIndex(i);
			temp[i]=get(i);
		}

		setAnArray(temp);
	}
	public int remove(int index){
		if(index < 0 || index > size()-1){
			remove(size()-1);
			//remove(0);
		}
		if(size() == 0){
			return index;
		}
		
		int[] temp = new int[getAnArray().length-1];
		
		if(temp.length == 0){
			setAnArray(temp);
			return index;
		}
		
		
		for(int i = 0; i < index;i++){
			//setIndex(i);
			//temp[i]=get(i);
			//temp[i]=getValue(i);
			//System.out.println(anArray[i]);
			temp[i] = anArray[i];//
		}

		for(int i = getIndex(); i < temp.length;i++){
			setIndex(i);
			temp[i]=get(i+1);
		}

		setAnArray(temp);

		return index;
	}
	public myIntArrayList simpleSort(){
		for(int i = 0; i < getAnArray().length; i++){
			if(i == getAnArray().length){
				return anExample;
			}
			if(get(i) > get(i+1)){
				int temp = get(i);
				setValue(i, get(i+1));
				setValue(i+1, temp);
				simpleSort();
			}
		}
		return anExample;
	}
	public boolean equals(myIntArrayList anotherList){
		if(anotherList == getAnExample()){
			return true;
		}
		return false;

	}
	public boolean isCongruent(myIntArrayList anotherList){
		if(anotherList.equals(getAnExample())){
			return true;
		}
		return false;

	}
	public int get(int index){
		if(index < 0 || index > size()){
			return getValue(size()-1);
		}
		
		return getValue(index);
	}
	public int indexOf(int value){
		for(int i= 0; i<getLength(); i++){
			if(getValue(i)==value){
				setIndex(i);
				return getIndex();
			}
		}
		return -1;
	}
	public int size(){
		return getLength();
	}
	public void clear(){
		int[] temp = new int[getAnArray().length];
		//anArray = temp;
		setAnArray(temp);
	}
	public void print(){
		String temp = "";
		//for(int i = 0; i < getAnArray().length; i++){
		for(int i = 0; i < size(); i++){
			temp = temp +  " " + get(i);
		}
		//System.out.println();
		System.out.println(temp);
	}
	public int[] getAnArray() {
		
		return anArray;
	}
	public void setAnArray(int[] anArray) {
		this.anArray = anArray;
	}
	public myIntArrayList getAnExample() {
		return anExample;
	}
	public void setAnExample(myIntArrayList anExample) {
		this.anExample = anExample;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getValue(int index) {
		int value = anArray[index];
		//int value = getAnArray()[index];
		return value;
	}
	public void setValue(int index, int value){
		anArray[index] = value;
	}

	public int getLength() {
		setLength();
		return length;
	}
	public void setLength() {
		this.length = getAnArray().length;
	}

}
