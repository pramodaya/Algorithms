
public class DoublyLinkedList {
	
	private Node head;
	public DoublyLinkedList(){
		head.next=null;
		head.previous=null;
		head.value=0;
	}
	
	public boolean insertItem(int item){
		Node a = new Node();
		a.value = item;
		
		Node temp = new Node();
		temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = a;
		a.previous= temp;
		a.next=null;
		return true;
	}
	
	public void printDoublyLinkedList(){
		Node temp = new Node();
		temp = head;
		while(temp.next!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public boolean deleteItem(int item){
		Node temp = new Node();
		while(temp.next!=null){
			if(temp.value==item){
				temp.next = temp.previous.next;
				temp.previous= temp.next.previous;
				return true;
			}
			temp= temp.next;
			
		}
		return false;
	}
	
	
	
	class Node{
		private int value;
		private Node next ;
		private Node previous ;
	}
}
