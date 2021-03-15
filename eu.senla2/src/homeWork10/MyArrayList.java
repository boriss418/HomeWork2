package homeWork10;

import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<E> implements MyList<E>{
	
	private E[] values;
	int size=0;
	

	MyArrayList() {		
		values = (E[]) new Object[0];
	}

	@Override
	public boolean add(E e) {
		try {
			E[] temp = values;
			values = (E[]) new Object [temp.length+1];
			System.arraycopy(temp, 0, values, 0, temp.length);
			values[values.length - 1]= e;
			return true;
		}catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public void add(int index, E obj) {
		E[] temp = values;
		if (index >values.length-1) {
			values = (E[]) new Object [index+1];
			System.arraycopy(temp, 0, values, 0, temp.length);
			values[index]= obj;
		}else {	
			values = (E[]) new Object [temp.length];
			System.arraycopy(temp, 0, values, 0, temp.length);
			values[index]= obj;
		}
	}

	@Override
	public boolean addAll(int index, MyList<? extends E> col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {					 
			 return values[index];	   
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> MyList<E> of(Object... e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) {		
		return values[index]=null;
	}

	@Override
	public E set(int index, E obj) {
		if(index <= values.length) {
		return values[index]=obj;
	}
		return obj;
	}		

	@Override
	public void sort(Comparator<? super E> comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyList<E> subList(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "MyArrayList [values=" + Arrays.toString(values) + "]";
	}

}
