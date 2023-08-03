package javapractice.practi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Practice {
	int id;
	String name;
	int age;
	public Practice(int id  , String name , int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Practice>  alPractice = new ArrayList<>();
		alPractice.add( new Practice(10,"abhi",23));
		alPractice.add( new Practice(03,"sharma",30));
		alPractice.add( new Practice(15,"akashan",45));
		alPractice.add( new Practice(21,"Sakshi",20));
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(53);
		al.add(99);
		
		alPractice.stream().filter(i->i.age<25).forEach(x->System.out.println(x.age +""+x.name ));
		
		
		 Stream<Integer> filter = al.stream().filter(i-> i%2==0);
		 
		 //filter.forEach(x-> System.out.println(x));
		 
		// al.stream().filter(i->i%2==0).forEach(x->System.out.println(x));
		 
		 //al.stream().map(i->i*2).forEach(x->System.out.println(x));
		 
		 
		 
		//System.out.println();

	}

}
