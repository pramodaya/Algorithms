
public class Queue {
	private int [] queue;
	private int size;
	private int total;
	
	//place item deletes/out
	private int front;	
	
	//place item adds
	private int back;
	
	public Queue(){
		size = 100;
		total =0;
		front = 0;
		back = 0;
		queue = new int[size];
	}
	public Queue(int size){
		this.size= size;
		total =0;
		front = 0;
		back = 0;
		queue = new int[this.size];
	}
	//isFull queue
	public boolean isFull(){
		return (size == total);
	}
	
	//enqueue
	public boolean enqueue(int item){
		if(!isFull()){
			queue[back]=item;
			back = (back + 1) % size;
			total++;
			return true;
		}
		return false;
	}
	
	//dequeue
	public int dequeue(){
		int item = queue[front];
		front =  (front + 1)% size;
		total--;
		return item;
	}
	
	public void showAll(){
		int f = front;
		if(total != 0){
			for(int i=0;i<total; i++){
				System.out.println(" "+ queue[f]);
				f = (f+1)% size;
				
			}
		}
	}
	
	
}
