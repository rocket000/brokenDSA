package broken.linkedlist;

import broken.node.Node;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length =1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}
	
	public void printList() {
		Node temp = head;
		while (temp !=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void append(int value) {
		Node newNode = new Node(value);

		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if(length == 0) return null;
		Node pre =head;
		Node temp = head;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		length++;

	}
	
	public Node removeFirst() {
		if(length == 0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;

		length--;
		if(length==0) {
			tail = null;
		}
		return temp;
		
	}
	
	public Node get(int index) {
		if(index<0 || index>=length) return null;
		Node temp = head;
		while(index !=0) {
			temp = temp.next;
			index--;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if(index<0 || index>length) return false;
		if(index==0) { 
			prepend(value);
		}else if(index == length) {
			append(value);
		}else {
			Node temp = get(index-1);
			Node newNode = new Node(value);
			newNode.next = temp.next;
			temp.next = newNode;
			length++;
		}
		return true;
		
	}
	
	public Node remove(int index) {
		if(index<0 || index>=length) return null;
		if(index == 0) return removeFirst();
		if(index == length-1) return removeLast();
		Node temp = get(index-1);
		Node returnNode  = temp.next;
		temp.next = returnNode.next;
		returnNode.next = null;
		length--;
		return returnNode;	
	}
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node before = null;
		Node after = temp.next;
		for(int i = 0; i<length;i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	public Node findMiddleNode() {
		Node fast = head, slow = head;
		while(fast !=null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public boolean hasLoop() {
		Node fast = head;
		Node slow =head;
		while(fast !=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast==slow) {
				return true;
			}
		}
		return false;
	}
	
	public Node findKthFromEnd(int k) {
		if(head == null|| k>length || k<0) return null;
		Node slow = head;
		Node fast = head;
		for(int i=0;i<k;i++) {
			//list has fewer than k nodes
			if(fast == null) return null;
			fast = fast.next;
		}
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	public void removeDuplicates() {
		Node current = head;
		Node runner = head;
		while(current!=null) {
			runner = current;
			while(runner.next!=null) {
				if(runner.next.value == current.value) {
					runner.next = runner.next.next;
					length--;
				}else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public void partitionList(int x) {
		 if (head == null) return;
		 
	        Node dummy1 = new Node(0);
	        Node dummy2 = new Node(0);
	        Node prev1 = dummy1;
	        Node prev2 = dummy2;
	        Node current = head;
	 
	        while (current != null) {
	            if (current.value < x) {
	                prev1.next = current;
	                prev1 = current;
	            } else {
	                prev2.next = current;
	                prev2 = current;
	            }
	            current = current.next;
	        }
	 
	        prev2.next = null;
	        prev1.next = dummy2.next;
	 
	        head = dummy1.next;
		
	}
	
	public void reverseBetween(int start, int end) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node pre = dummy;
		for(int i =0;i<start;i++) {
			pre = pre.next;
		}
		Node current = pre.next;
		Node toMove =null;
		for(int i=0;i<end-start;i++) {
			toMove = current.next;
			current.next = toMove.next;
			toMove.next = pre.next;
			pre.next = toMove;
		}
		head = dummy.next;
		
	}
}
