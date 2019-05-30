package Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentData extends Student {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		ArrayList<Student> totalstudentlist = new ArrayList<>();
		ArrayList<Object> studentlist ;
		
		System.out.println("Do you want to enter student data \n1.yes 2.No");
		while(sc.nextInt() != 2) {
			studentlist = new ArrayList<>();
			st = new Student();
			System.out.println("Student Name :");
			st.setName();
			st.getName();
			studentlist.add(st.getName());
			System.out.println("Student Id :");
			st.setId();
			st.getId();
			studentlist.add(st.getId());
			System.out.println(studentlist);
			
			
			
			totalstudentlist.add(st);
			System.out.println("Do you want to enter student data \n1.yes 2.No");

		}
		System.out.println(totalstudentlist);
		System.out.println("Enter the details you want \n1.Name 2.Id");
		
		int i = sc.nextInt();	
		
		Iterator it1 = totalstudentlist.iterator();

		while(it1.hasNext()) {
			System.out.println(((Student) it1.next()).getDetails(i));
		}
	}
}
