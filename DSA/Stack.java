
public class Stack {
	private int [] stack;
	private int top;
	private int size;
	//constructor
	public Stack(){
		top =-1;
		size = 50;
		stack = new int [50];
	}
	public Stack(int size){
		top =-1;
		this.size = size;
		stack = new int [this.size];
	}
	
	//isFull
	public boolean isFull(){
		return (top==stack.length-1);
	}
	//isEmpty
	public boolean isEmpty(){
		return (top==-1);
	}
		
		
	
	//push
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top]=item;	
			return true;
		}
		return false;
		
	}
	
	public int pop(){			
		return stack[top--];		
	}
	
	
}
