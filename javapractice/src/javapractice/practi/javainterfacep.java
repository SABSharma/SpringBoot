package javapractice.practi;



public class javainterfacep  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javainterfacep ob = new javainterfacep();
		
//		ob.abstractm1();
//		ob.m1();
		
	    Interface1 it= ()-> {
	    	System.out.println("he");
	    };
	    
	    Interface1 test2 = () -> {    // lambda expression
	         System.out.println("Display using Lambda Expression");
	      };
	      
	      test2.abstractm1();

	}

//	@Override
//	public void abstractm1() {
//		// TODO Auto-generated method stub
//		System.out.println("impmemeted the abstract method ");
//		
//	}
//	
	
	

	
}

