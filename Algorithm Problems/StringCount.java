import java.util.HashMap;
import java.util.Map;

public class StringCount {
	
	
	
	public static void main(String args[]) {
		String str = "Hello world 89";
		str = str.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		System.out.println(map);
		
	}
}
//output: 
//{ =2, r=1, d=1, e=1, w=1, h=1, 8=1, 9=1, l=3, o=2}