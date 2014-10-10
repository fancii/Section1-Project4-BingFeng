
public class myIntArrayList {

	private int[] array;

	public myIntArrayList()
	{
		array = new int[0];
	}

	public myIntArrayList(int[] anArray)
	{
		array = new int[anArray.length];
		for(int i = 0; i < anArray.length; i++)
		{
			array[i] = anArray[i];
		}
	}

	public myIntArrayList(myIntArrayList anExample)
	{
		int[] anArray = new int[anExample.size()];
		for(int i = 0; i < anExample.size(); i++)
		{
			anArray[i] = anExample.get(i);
		}
		array = anArray;
	}

	public void add(int index, int value)
	{
		int[] temp = array.clone();
		array = new int[array.length+1];
		if(index <= 0)
		{
			array[0] = value;
			for(int i = 0; i < temp.length; i++)
			{
				array[i+1] = temp[i];
			}
		}
		else if(index >= temp.length)
		{
			for(int i = 0; i < temp.length; i++)
			{
				array[i] = temp[i];
			}
			array[temp.length] = value;
		}
		else
		{
			for(int i = 0; i < index; i++)
			{
				array[i] = temp[i];
			}
			array[index] = value;
			for(int i = index; i < temp.length; i++)
			{
				array[i+1] = temp[i];
			}
		}
	}

	public int remove(int index)
	{
		if(array.length < 1)
			return -1;
		int[] temp = array.clone();
		array = new int[array.length-1];
		if(index <= 0)
		{
			for(int i = 0; i < array.length; i++)
			{
				array[i] = temp[i+1];
			}
			return temp[0];
		}
		else if(index >= temp.length)
		{
			for(int i = 0; i < array.length; i++)
			{
				array[i] = temp[i];
			}
			return temp[temp.length-1];
		}
		else
		{
			for(int i = 0; i < index; i++)
			{
				array[i] = temp[i];
			}
			for(int i = index; i < array.length; i++)
			{
				array[i] = temp[i+1];
			}
			return temp[index];
		}
	}

	public myIntArrayList simpleSort()
	{
		myIntArrayList sortedList = new myIntArrayList(this);
		for(int i = 1; i < sortedList.size(); i++)
		{
			if(sortedList.get(i) < sortedList.get(i-1))
			{
				int temp = sortedList.remove(i);
				for(int j = 0; j < i; j++)
				{
					if(temp < sortedList.get(j))
					{
						sortedList.add(j, temp);
						break;
					}
				}
			}
		}
		return sortedList;
	}

	public boolean equals(myIntArrayList anotherList)
	{
		if(anotherList.size() != this.size())
			return false;
		for(int i = 0; i < anotherList.size(); i++)
		{
			if(array[i] != anotherList.get(i))
				return false;
		}
		return true;
	}

	public boolean isCongruent(myIntArrayList anotherList)
	{
		if(anotherList.size() != this.size())
			return false;
		myIntArrayList toCheck = new myIntArrayList(this);
		for(int i = 0; i < anotherList.size(); i++)
		{
			if(toCheck.indexOf(anotherList.get(i)) == -1)
				return false;
			else
				toCheck.remove(toCheck.indexOf(anotherList.get(i)));
		}
		return true;
	}

	public int get(int index)
	{
		if(array.length <= 0)
			return -1;
		if(index < 0)
			return array[0];
		if(index >= array.length)
			return array[array.length-1];
		return array[index];
	}

	public int indexOf(int value)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == value)
				return i;
		}
		return -1;
	}

	public int size()
	{
		return array.length;
	}

	public void clear()
	{
		array = new int[0];
	}

	public void print()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
