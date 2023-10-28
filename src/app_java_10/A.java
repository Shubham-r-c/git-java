package app_java_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		Student s1 = new Student("Mike",80,102);
		Student s2 = new Student("Stallin",68,103);
		Student s3 = new Student("Adam",77,101);
		Student s4 = new Student("Arin",76,104);
		Student s5 = new Student("Smith",69,105);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
	
	
	List<Student> newList  = students.stream().filter(s->s.getMarks()>75).collect(Collectors.toList());
                      for (Student x : newList) {
                    	  System.out.println(x.getName());
						
					}
    }
}
