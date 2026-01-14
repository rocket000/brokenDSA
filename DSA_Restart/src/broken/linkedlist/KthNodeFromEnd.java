package broken.linkedlist;

public class KthNodeFromEnd {

	public static void main(String[] args) {
		 LinkedList myLinkedList = new LinkedList(1);
		 	myLinkedList.append(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(2);
	        myLinkedList.append(4);
	        myLinkedList.append(5);
	        myLinkedList.append(4);

	        myLinkedList.printList();
	        //int k = 5;
	        //int result = myLinkedList.findKthFromEnd(k).value;
	        myLinkedList.removeDuplicates();
	        System.out.println("===");
	        myLinkedList.printList();
	        //System.out.println(result); // Output: 4

	}

}
