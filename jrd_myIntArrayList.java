/**
 * 
 * @author Josh deMedici
 * September 28, 2014
 * 
 * This program is an implementation of an aL in Java
 */

public class myIntArrayList 
{

	public int[] aL;

	public  myIntArrayList()
	{
		aL = new int[0];
	}

	public  myIntArrayList(int[] array)
	{
		aL = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			aL[i] = array[i];
		}
	}

	public  myIntArrayList(myIntArrayList anExample)
	{
		aL = new int[anExample.aL.length];
		for(int i = 0; i < aL.length; i++)
		{
			aL[i] = anExample.aL[i];
		}
	}

	public void add(int index, int value)
	{
		int[] array = new int[aL.length +1];
		boolean flag = false;
		if(index >= aL.length)
		{
			for(int i = 0; i < aL.length; i++)
			{
				array[i] = aL[i];
			}
			array[aL.length] = value;
			aL = array;//not a mistake
		}else{
			for(int i = 0; i < aL.length; i++)
			{
				if(!flag)
				{

					if( i == index)
					{
						array[i] = value;
						array[i+1] = aL[i];
						flag = true;
					}else{
						array[i] = aL[i];
					}
				}else{
					array[i+1] = aL[i];
				}
			}
			aL = array;//not a mistake
		}
	}

	public void remove(int index)
	{
		int[] array = new int[aL.length-1];
		boolean flag = false;
		if(index >= aL.length)
		{
			for(int i = 0; i < aL.length - 1; i++)
			{
				array[i] = aL[i];
			}
			aL = array;//not a mistake
		}else{
			for(int i = 0; i < aL.length-1; i++)
			{
				if(!flag)
				{

					if( i == index)
					{
						array[i] = aL[i+1];
						flag = true;
					}else{
						array[i] = aL[i];
					}
				}else{
					array[i] = aL[i+1];
				}
			}
			aL = array;//not a mistake
		}
	}

	public myIntArrayList simpleSort()
	{
		myIntArrayList temp = new myIntArrayList();
		boolean flag = false;
		for(int i = 0; i < aL.length; i++)
		{
			for(int a = temp.size(); a >= 0; a--)
			{
				if(!flag)
				{
					if(a == 0 || aL[i] > temp.aL[a-1])
					{
						temp.add(a, aL[i]);
						flag = true;
					}
				}
			}
			flag = false;
		}
		return temp;

	}
	
	public boolean equals(myIntArrayList anotherList)
	{
		aL = new int[anotherList.aL.size];
		int check;
		for(int i = 0; i < anotherList.size(); i++)
		{
			if(check == anotherList[i])
			{
				check++;
			}
			else
			{
				check = 0;
			}
		}
	}
	
	public boolean isCongruent(myIntArrayList anotherList)
	{
		aL = new int[anotherList.aL.size];
		int check;
		for(int i = 0; i < anotherList.size(); i++)
		{
			for(int j = 0; j < anotherList.size(); j++)
			{
				if(aL[i] != anotherList[j])
				{
					check++;
				}
			}
		}
		if(check == anotherList.size)
		{
			return check;
		}
		else
		{
			return 0;
		}
	 }
	
	public void print()
	{
		for(int i = 0; i < aL.length; i++)
		{

			System.out.print(aL[i] + " ");
		}
		System.out.println();
	}

	public int get(int index)
	{
		if(index > aL.length)
		{
			return aL.length;
		}
		return aL[index];
	}

	public int indexOf(int value)
	{
		for(int i = 0; i < aL.length; i++)
		{
			if(aL[i] == value)
			{
				return i;
			}
		}
		return -1;
	}


	public int size()
	{
		return aL.length-1;
	}

	public void clear()
	{
		int[] array = new int[0];
		aL = array;
	}




}