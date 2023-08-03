package javapractice.practi;

import java.util.HashMap;
import java.util.Map;

public class HasmapPractice {
	
	public Map<String, String> mapShare(Map<String, String> map) {
		   Map<String , String> hm = new HashMap<String,String>();
		  
		  for(Map.Entry<String,String> e: map.entrySet()){
		  
		  if(e.getKey() == "b" && map.containsKey("a")){
		    hm.put("b",map.get("a"));
		  }
		  else if(e.getKey() == "c" ){
		    continue;
		  }
		  else{
		    hm.put(e.getKey() , e.getValue() );
		  }
		    
		  }
		  
		  return hm;
		  
		  
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HasmapPractice hm = new HasmapPractice();
		
		Map<String , String> hmap = new HashMap<>();
		// hmap.put("a", "aaa");
		hmap.put("b", "bbb");
		hmap.put("c", "ad");
		hmap.put("d", "ddd");
		Map<String, String> mapShare = hm.mapShare(hmap);
		
		for(Map.Entry<String, String> e : mapShare.entrySet()) {
			System.out.println(e);
		}

	}

}
