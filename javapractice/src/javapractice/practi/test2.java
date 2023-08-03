package javapractice.practi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> ls = new ArrayList<>();
		ls.add(new Person("Abhishek", 23));
		ls.add(new Person("Sharma", 34));
		ls.add(new Person("Sharma", 33));
		
	//	ls.stream().filter(i -> i.age==34).forEach(x-> System.out.println(x.age));
		
		Stream<Person> filter = ls.stream().filter(i ->i.name.equals("Sharma")).collect(null);
		
		List<Person> l1 = new ArrayList<>();
		
		
    
	}

}
