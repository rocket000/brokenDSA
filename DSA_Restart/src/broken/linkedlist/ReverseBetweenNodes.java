package broken.linkedlist;

public class ReverseBetweenNodes {

	public static void main(String[] args) {
		 LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);
	        
	        myLinkedList.printList();
	        System.out.println("---------");
	        myLinkedList.reverseBetween(1, 3);
	        myLinkedList.printList();

	}

}
