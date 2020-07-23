package com.pro.test;

import com.pro.child.Student;
import com.pro.parent.Person;

public class Test {
	
	public static void main(String[] args) {
	
	//	Case :- 1	
		Person p=new Person();
		p.m1(p);
		
	//	Case :- 2	
		Student s=new Student();
		s.m1(s);
		
	//	Case :- 3
		Person p1=new Student();
		p1.m1(s);
		
	// Case :- 4
		Person p2=new Student();
		p2.m1(p);
		
	// These commented functions are not working , its throwing error.	
		
	//	Case :- 5
	//	Student s1= new Person();
		
	//	Case :- 6
	//	Student s2=(Student) new Person();
	//	s2.m1(p);
			
	//	Case :- 7
	//	Student s3=(Student) new Person();
	//		s3.m1(s);
			
	//	Case :- 8
	//	Student s2=(Student) new Person();
	//	s2.m1(p1);
				
	//	Case :- 9
	//	Student s3=(Student) new Person();
	//	s3.m1(s);
		
		
		
	}

}
