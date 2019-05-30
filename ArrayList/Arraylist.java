package ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al);
		int i=0;
		try {
			while(sc.hasNextInt()) {
				al.add(sc.next());
				i++;
			}
			al.add(sc.next());
			al.remove(i);
		}
		catch(IndexOutOfBoundsException | InputMismatchException ae) {
			System.out.println("Error");
			while(sc.hasNext()) {
				al.add(sc.next());
			}
			System.out.println(al);

		}
		System.out.println(al);
		while(sc.hasNextInt()) {
			al.add(sc.next());
		}
		System.out.println(al);
		
	}
}
