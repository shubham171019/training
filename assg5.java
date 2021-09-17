import java.util.*;

class Queue {
    int size;
    int[] items;
    int front,rear;

    Queue(int size){
        items = new int[size];
        front = -1;
        rear = -1;
    }

    void enQueue(int element){
        if (isFull()){
            System.out.println("Queue is Full");
        }else{
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            element = items[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            }else{
                front++;
            }
            return element;
        }
    }

    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(front == 0 && rear == size -1 ){
            return true;
        }
        return false;
    }

    void printQueue(){
        int i;
        System.out.println();
        if(!isEmpty()){
            for (i=front; i<=rear;i++){
                
                System.out.print(items[i] + " ");
            }
        }
    }
}


class SortList {

	class Node {
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	// addNode() will add a new node to the list
	public void addNode(int data)
	{

		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {

			// If list is empty, both head and tail will
			// point to new node
			head = newNode;
			tail = newNode;
		}
		else {

			// newNode will be added after tail such that
			// tail's next will point to newNode
			tail.next = newNode;

			// newNode will become new tail of the list
			tail = newNode;
		}
	}






	// order
	public void queueIns(){
	    Node current = head;
	    int count=0;
	    while (current != null) {
			count++;
			current = current.next;
		}
		current = head;
// 		System.out.println(count);
	    Queue queue = new Queue(count);
	    
	    while (current != null) {
	       // System.out.println(current.data);
			queue.enQueue(current.data);
			current = current.next;
		}
		//displying the queue data
		queue.printQueue();
	    
	}
	
	
	
	
	public void sortList()
	{

		// Node current will point to head
		Node current = head, index = null;

		int temp;

		if (head == null) {
			return;
		}
		else {
			while (current != null) {
				// Node index will point to node next to
				// current
				index = current.next;

				while (index != null) {
					// If current node's data is greater
					// than index's node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}

	// display() will display all the nodes present in the
	// list
	public void display()
	{
		// Node current will point to head
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}

	public static void main(String[] args)
	{

		SortList sList = new SortList();

		// Adds data to the list
		sList.addNode(8);
		sList.addNode(3);
		sList.addNode(7);
		sList.addNode(4);

		// Displaying original list
		System.out.println("Original list: ");
		sList.display();

		// Sorting list
		sList.sortList();

		// Displaying sorted list
// 		System.out.println("Sorted list: ");
// 		sList.display();
		
		// adding sorted list in queue
		sList.queueIns();
	}
}
