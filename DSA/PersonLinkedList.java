
public class PersonLinkedList {
	private Node head;
	
	public PersonLinkedList(Person person){
		head = new Node();
		head.person = person;
		head.next = null;
	}
	
	public boolean insertItem(Person person){
		Node n = new Node();
		n.person = person;
		
		Node x = head;
		while(x.next!=null){
			x = x.next;
		}
		x.next = n;
		return true;
		
		
		
	}
	public void printList(){
		Node z = head;
		while(z!=null){
			System.out.println(z.person.toString());
			z=z.next;
		}
		
	}
	
	public boolean deleteItem(String name){
		if(name.equals(head.person.getName())){
			head = head.next;
			return true;
		}
		Node x = head;
		Node y = head.next;
		while(y==null &&  !(y.person.getName().equals(name))){
			x = y;
			y= y.next;
		}
		if(y!=null){
			x.next = y.next;
			return true;
		}
		return false;
	}
	
//	public void bubbleSort(){
//		int c = 0;
//		Node a = head.next;
//		while(a.next!=null){
//			Node b = head.next;
//			while(b.next!=null){
//				if(b.value<b.next.value){
//					c = b.value;
//					b.value = b.next.value;
//					b.next.value= c;
//				}
//				b = b.next;
//			}
//			a=a.next;
//		}
//	}
	
	class Node {
		private Person person;
		private Node next = null;
	}
}
