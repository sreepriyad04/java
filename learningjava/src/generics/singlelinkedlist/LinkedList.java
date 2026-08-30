package generics.singlelinkedlist;

class ListNode<T> {
    T data;
    ListNode<T> next;
    
    private ListNode head;
    

    public ListNode(T data) {

        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T> {

	
    // TODO: Create and initialize the head to null in the constructor
	private ListNode head;

    public LinkedList() {
		super();
		head = null;
	}
	 
    public void add(T data) {

        // TODO: Implement the add method to add a new node with the specified data at the end of the list
    	
    	ListNode<T> newNode = new ListNode<>(data);
    	if(head==null) {
    		head= newNode;
    		return;
    	}
    	ListNode<T> current=head;
    	while(current.next !=null){
    		current=current.next;
    	}
    	current.next=newNode;
return;
    }


	public void display() {

        // TODO: Implement the display method to print the data of each node in the list separated by spaces

		ListNode current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
    }

    public boolean isEmpty() {
		
        // TODO: Implement the isEmpty method to return true if the list is empty (i.e., head is null), otherwise false.

    	return head==null;
    }

    public int size() {
		

        // TODO: Implement the size method to return the number of nodes in the list
    	int count=0;
    	if(head==null) {
    		return 0;
    	}
    	ListNode<T> current=head;
    	while(current!=null) {
    		count++;
    		current=current.next;
    	}
    	return count;

    }
    
    public static void main(String[] args) {
		LinkedList<Integer> intList= new LinkedList<Integer>();
		System.out.println("is empty ="+intList.isEmpty());
		intList.add(10);
		intList.add(20);
		System.out.println("size of the int list is "+intList.size());
		intList.display();
		
		LinkedList<String> stringList=new LinkedList<>();
		
		System.out.println("is stringlist empty = "+stringList.isEmpty());
		stringList.add("Name");
		stringList.add("is");
		stringList.add("El");
		System.out.println("size of the string list is "+stringList.size());
		stringList.display();
		
		
		
	}
}