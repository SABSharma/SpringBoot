package javapractice.practi;

import java.util.Arrays;

public class FindPrefix {
	
	
	    public String longestCommonPrefix(String[] strs) {
	        
	         int size = strs.length;
	 
	        /* if size is 0, return empty string */
	        if (size == 0)
	            return "";
	 
	        if (size == 1)
	            return strs[0];
	         Arrays.sort(strs);

	        String prefix=strs[0];

	        for(int i=1 ;i<strs.length; i++){
	             
	             int itr=0;
	             int end=0;
	             while(itr < prefix.length()){
	            	 prefix.charAt(itr);
	                 if(prefix.charAt(itr) == strs[i].charAt(itr) ){
	                     end++;
	                 }
	                 else{
	                     break;
	                 }
	                 itr++;
	             }
	             prefix=prefix.substring(0,end);

	        }
	        return prefix;


	        
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
