package javapractice.practi;

import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a1[]= {1,2,3,1,1};
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0 ; i<a1.length; i++) {
			if(hm.containsKey(a1[i])) {
				Integer integer = hm.get(a1[i]);
				hm.put(a1[i], integer+1);
			}
			else
			  {
				hm.put(a1[i], 1);
			  }
			
		}
		
		//for(int i=0 , i<hm.len)
		
		
		//System.out.println(hm);
		
	}

}
