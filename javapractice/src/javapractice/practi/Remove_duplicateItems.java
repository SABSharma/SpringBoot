package javapractice.practi;

import java.util.Set;
import java.util.TreeSet;

public class Remove_duplicateItems {
	
	public int removeDuplicates(int[] nums) {

	       
        Set <Integer> set = new TreeSet<>();

        for(int i=0; i<nums.length ; i++){
             set.add(nums[i]);

        }

        int arrnew[] = new int[nums.length];
        int i=0;  
       for(  Integer entry : set ){
             System.out.println(entry);
             arrnew[i]=entry;
             i++;
        }
         System.out.println("+++++");
        for(int j=0; j<arrnew.length ; j++){
            System.out.println(arrnew[j]);
         }
        return set.size();
        
    }

	public static void main(String[] args) {
		Remove_duplicateItems ob = new Remove_duplicateItems();
		int arr[] = {-3,-1,0,0,0,3,3};
		ob.removeDuplicates(arr);
		// TODO Auto-generated method stub

	}

}
