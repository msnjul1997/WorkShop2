package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseTest {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Santhosh");
		list.add("Naik");
		list.add("Mudavath");
		
		Iterator i=list.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
