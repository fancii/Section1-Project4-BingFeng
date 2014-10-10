public class myIntArrayList {
private int[] Array;
private int size;
 

public myIntArrayList(){
setSize(0);
}
 

public myIntArrayList(int[] anArray){
  setSize(anArray.length);
  Array = new int[size()];
  for(int i = 0; i < size(); i++){
  setArray(i, anArray[i]);
  }
}
 

public myIntArrayList(myIntArrayList anExample){
setSize(anExample.size());
Array = new int[size()];
for(int i = 0; i < size(); i++){
setArray(i, anExample.get(i));
}
}
 

public void setSize(int aSize){
size = aSize;
}
 

public int size(){
return size;
}
 

public void setArray(int index, int value){
Array[index] = value;
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
 

public boolean isEmpty(){
boolean check = true;
for(int i = 0; i < size(); i++){
if(get(i) != 0){
check = false;
}
}
return check;
}
 
public int get(int index){
if(index < size()){
return Array[index];
}else{
return Array[0];
}
}
 

public void add(int index, int value){
int temp0 = value;
int temp1 = 0;
int[] temp = new int[size() + 1];
for(int i = 0; i < size(); i++){
temp[i] = get(i);
}
 
setSize(size() + 1);
Array = new int[size()];
if(index < size()){
for(int position = 0; position < size(); position++){
if(position < index){
setArray(position, temp[position]);
}else{
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
}else{
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
 

public boolean contains(int value){
boolean check = false;
for(int i = 0; i < size(); i++){
if(get(i) == value){
check = true;
}
}
return check;
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
 
}