package broken.linkedlist;

public class PartitionList {

	public static void main(String[] args) {
		 LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(33);
	        myLinkedList.append(24);
	        myLinkedList.append(42);
	        myLinkedList.append(56);
	        myLinkedList.append(10);
	        myLinkedList.append(22);
	        myLinkedList.append(47);
	        
	        myLinkedList.printList();
	        System.out.println("---------");
	        myLinkedList.partitionList(30);
	        myLinkedList.printList();
	        

	}

}
