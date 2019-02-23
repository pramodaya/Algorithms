
public class RecursionClz {
	RecursionClz() {
		
	}
	public static void main(String[] args) {
		System.out.println(count(3));
	}
	
	static int count(int x){
		if(x==1){
			return 1;
		}else{
			return x + count(x-1);
		}
	}
}
