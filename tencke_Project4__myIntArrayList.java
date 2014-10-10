import java.util.Arrays;

/**
 * @author Tyler Encke
 * @version 1.0, 9/23/14
 *          Description: myIntArrayList is an ArrayList like object with methods to remove, add, clear, sort the array.
 *                          isCongruent will check congruence with another myIntArrayList.
 *                          
 */
public class myIntArrayList {

    private int[] array;
    private int size = 0;


    public myIntArrayList() {
        array = new int[0];
    }

    public myIntArrayList(int[] anArray) {
        setArray(anArray);
        setSize(anArray.length);
    }

    public myIntArrayList(myIntArrayList anExample) {
        setSize(anExample.size());
        array = new int[size()];

        for (int i = 0; i < size(); i++) {
            getArray()[i] = anExample.get(i);
        }
    }

    public void add(int index, int value) {
        int[] temp = getArray();
        setArray(new int[size() + 1]);

        if (index < 0 || index >= size()) {
            for (int i = 0; i < size(); i++) {
                getArray()[i] = temp[i];             // Fill up array with original values
            }
            getArray()[size()] = value;              // Put value in last index of new array
        } else {
            getArray()[index] = value;
            for (int i = index - 1; i > -1; i--) {
                getArray()[i] = temp[i];
            }
            for (int i = index + 1; i < size() + 1; i++) {
                getArray()[i] = temp[i - 1];
            }
        }

        setSize(size() + 1);
    }

    public int remove(int index) {
        int[] temp = getArray();
        setArray(new int[size() - 1]);

        if (index >= size()) {
            index = size() - 1;
        }

        for (int i = index - 1; i > -1; i--) {
            getArray()[i] = temp[i];
        }
        for (int i = index; i < size() - 1; i++) {
            getArray()[i] = temp[i + 1];
        }

        setSize(size() - 1);
        return temp[index];
    }

    public myIntArrayList simpleSort() {
        int[] tempSorted = getArray();

        int tempValue;

        for (int i = 1; i < size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(tempSorted[j] < tempSorted[j-1]){
                    tempValue = tempSorted[j];
                    tempSorted[j] = tempSorted[j-1];
                    tempSorted[j-1] = tempValue;
                }
            }
        }

        return new myIntArrayList(tempSorted);
    }

    public boolean equals(myIntArrayList anotherList) {
        if (size() != anotherList.size()) {
            return false;
        }

        for (int i = 0; i < size(); i++) {
            if (get(i) != anotherList.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean isCongruent(myIntArrayList anotherList) {
        if (size() != anotherList.size()) {
            return false;
        }

        myIntArrayList array1 = simpleSort();
        myIntArrayList array2 = anotherList.simpleSort();

        for (int i = 0; i < size(); i++) {
            if (array1.get(i) != array2.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int get(int index) {
        return getArray()[index];
    }

    public int indexOf(int value) {
        for (int i = 0; i < size(); i++) {
            if (get(i) == value) {
                return i;
            }
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new int[0];
        setSize(0);
    }

    public void print() {
        System.out.println(Arrays.toString(getArray()));
    }

    private void setSize(int newSize) {
        size = newSize;
    }

    private void setArray(int[] newArray) {
        array = newArray;
    }

    private int[] getArray() {
        return array;
    }

}
