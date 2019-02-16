
public class LinkedList {
	private Node head;
	
	public LinkedList(){
		head = new Node();
		head.value = 0;
		head.next = null;
	}
	
	public boolean insertItem(int item){
		Node n = new Node();
		n.value = item;
		
		Node x = head;
		while(x.next!=null){
			x = x.next;
		}
		x.next = n;
		return true;
		
		
		
	}
	public void printList(){
		Node z = head.next;
		while(z!=null){
			System.out.println(z.value);
			z=z.next;
		}
		
	}
	
	public boolean deleteItem(int item){
		if(head.value == item){
			head = head.next;
			return true;
		}
		Node x = head;
		Node y = head.next;
		while(true){
			if(y==null || y.value == item){
				break;
			}else{
				x = y;
				y=y.next;
			}			
		}
		if(y!=null){
			x.next = y.next;
			return true;
		}
		return false;
	}
	
	public void bubbleSort(){
		int c = 0;
		Node a = head.next;
		while(a.next!=null){
			Node b = head.next;
			while(b.next!=null){
				if(b.value<b.next.value){
					c = b.value;
					b.value = b.next.value;
					b.next.value= c;
				}
				b = b.next;
			}
			a=a.next;
		}
	}
	
	class Node {
		private int value;
		private Node next = null;
	}
	
}
