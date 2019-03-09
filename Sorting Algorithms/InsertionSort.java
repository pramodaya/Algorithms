
public class InsertionSort {
	private int[] arr;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	public void arrPrint() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sort(){
		for(int i=1;i<arr.length;i++){
			int firstUnsortedItem = arr[i];
			
			int j;
			for( j=i; j>0 && arr[j-1]>firstUnsortedItem ;j-- ){
				arr[j]=arr[j-1];
			}
			arr[j] = firstUnsortedItem;
			
		}
	}

}
