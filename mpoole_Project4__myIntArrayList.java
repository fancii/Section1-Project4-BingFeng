import java.util.ArrayList;
import java.util.Arrays;
public class myIntArrayList {
private int[] anArray;
private int n;
public myIntArrayList(){
}

public myIntArrayList(int[] anArray){
this.anArray = anArray.clone();
n = anArray.length;
}
public myIntArrayList(myIntArrayList anExample){
this.anArray = anExample.getAll().clone();
}
private int[] getAll(){
return anArray.clone();
}
public void add(int index, int value){
if(index >= anArray.length || index<0){
anArray = Arrays.copyOf(anArray,n+1);
anArray[n-1] = value;
}
else{
anArray = Arrays.copyOf(anArray,n+1);
for (int i = n; i > index; i--) {
anArray[i] = anArray[i-1];
}
anArray[index] = value;
}
n = anArray.length;
}
public void remove(int index){
if(index >= anArray.length || index<0){
anArray = Arrays.copyOf(anArray,n-1);
}
else{
for (int i = index; i < n-1; i++) {
anArray[i] = anArray[i+1];
}
anArray = Arrays.copyOf(anArray,n-1);
}
n = anArray.length;
}
public myIntArrayList simpleSort(){
int[] numbers = anArray.clone();
int i,j,temp;
for(i=1;i<n;i++){
temp = numbers[i];
for(j=i-1;j>=0;j--){
if(numbers[j]<temp)
break;
numbers[j+1] = numbers[j];
}
numbers[j+1] = temp;
}
return new myIntArrayList(numbers);
}
public boolean equals(myIntArrayList anotherList){
int[] second = anotherList.getAll();
if(second.length != n)
return false;
else{
for (int i = 0; i < n; i++) {
if(anArray[i] != second[i])
return false;
}
return true;
}
}
public int get(int index){
if(index >= anArray.length || index<0){
return anArray[0];
}
return anArray[index];
}
public int indexOf(int value){
for (int i = 0; i < n; i++) {
if(anArray[i] == value)
return i;
}
return -1;
}
public int size(){
return n;
}
public void clear(){
anArray = Arrays.copyOf(anArray,0);
n = anArray.length;
}
public void print(){
System.out.println();
for(int i : anArray){
System.out.print(i + " ");
}
System.out.println();
}
}
