package javapractice.practi;

public class Capitalize_String {
	
	 public String capitalizeTitle(String title) {
	        String s="";

	         String arr[]=title.split(" ");

	         for(String s1 : arr){
	             if(s1.length()<=2){
	                 s= s+s1.toLowerCase() + " " ;
	             }
	            
	             
	             else{
	                 String news=  String. valueOf( s1.charAt(0) );
	                 s= s + news.toUpperCase() + s1.substring(1) + " ";
	             }

	         }
	         return s.trim();
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capitalize_String  ob = new Capitalize_String ();
		String capitalizeTitle = ob.capitalizeTitle("hello world of Dome");
		System.out.println(capitalizeTitle);
		System.out.println("Hello World of Dome".equals(capitalizeTitle));
		

	}

}
