package homework;

import java.util.*;
import java.util.function.Consumer;

public class MyStack <E> implements Iterable <E>{
	ArrayList<E> list;
	public MyStack() {
		list= new ArrayList<E>();
	}
	public void push(E e) {
		list.add(e);
	}
	public E pop() {
	
		if(list.isEmpty()) {
			return null;
		}
		else {
			return (E)list.remove(list.size()-1);
		}
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
		
	}
	public MyStackIterator<E> iterator(){
		return new MyStackIterator<E> ();
	}
	class MyStackIterator<E> implements Iterator<E>{
		int index=list.size()-1;
		
		@Override
		public boolean hasNext() {
			if(index==0) {
				return false;
			}
			else
				return true;
		}
		
		@Override
		public E next() {
			E item = (E)list.get(index);
			index--;
			return item; 
		}
		
	}
	
	
}

