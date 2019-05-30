package Example;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int id;
	public void setName() {
		name = sc.next();
	}
	public String getName() {
		return name ;
	}
	public void setId() {
		id = sc.nextInt();
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return name+ "," + id;
		
	}
	
	public Object getDetails(int a) {
		
		switch(a) {
		
		case 1 : return name ;
		case 2 : return id ; 
		
		}
		return 0 ;
	}
	
}
