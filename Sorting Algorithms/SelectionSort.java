
public class SelectionSort {
	private int[] arr;
	
	public SelectionSort(int[] arr){
		this.arr = arr;
	}
	
	public void sort(){
		for(int i=0;i<arr.length-1;i++){
			int maxIndex = 0;
			
			for(int j=0;j<arr.length-1-i;j++){			
				if(arr[maxIndex]<arr[j]){
					maxIndex = j;				
				}
			}
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[maxIndex];
			arr[maxIndex] = temp;
			
			
			
		}
	}
	
	public void arrPrint(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
