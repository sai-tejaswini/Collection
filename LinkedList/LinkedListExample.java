package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("sai");
		al.add("Tejaswini");
		al.add("hello");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
