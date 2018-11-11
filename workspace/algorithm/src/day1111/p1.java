package day1111;
import java.io.*;
import java.util.*;

public class p1 {
	
	public static Object getKey(Map<Integer, Integer> map, Object value) { 
		for(Object o: map.keySet()) { 
			if(map.get(o).equals(value)) { 
				return o; 
			} 
		} return null; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> array = new ArrayList<>();
		String temp = "";
		
		while(!((temp=sc.nextLine()).equals(""))){
			array.add(temp);
		}
		
		int cnt =0;
		
		Iterator it = array.iterator();
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		while(it.hasNext()){
			temp = (String)it.next();
			String[] str = temp.split("|");
			
			if(str[0].equals("2018-08-01") || str[0].equals("2018-08-10")){
				
			}
			else {
				int a = Integer.parseInt(str[1]);
				if(map.containsKey(a)){
					map.put(a, map.get(a) + 1);
				}
				else{
					map.put(a, 1);
				}
			}
			cnt +=1;
		}
	
		System.out.println(map.get(1));
		
		/*
		ArrayList<Integer> rank = new ArrayList<>();

		while(cnt!=0){
			if(map.containsValue(cnt)){
				rank.add((int)getKey(map,cnt));
			}
			cnt--;
		}
		
		System.out.println(rank.get(0));
		System.out.println(rank.get(1));
		System.out.println(rank.get(2));
		*/
	}
}
