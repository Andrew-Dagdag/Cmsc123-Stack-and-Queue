public class DoublyLinkedList {

	//Attributes
	public String name;
	private DNode head, tail;
	private int size;

	//Constructors
	public DoublyLinkedList(){
		head = new DNode();
		tail = head;
		size = 0;
	}
	public DoublyLinkedList(int[] nums){
		size = nums.length;
		head = new DNode(nums[0]);
		if(size == 1){
			//head.setNext();
			tail = head;
		} else {
			tail = new DNode(nums[size-1]);
			//tail.setNext();
			DNode newNode = new DNode(nums[size-2],tail);
			for(int i=size-2; i>1; i--){
				newNode = new DNode(nums[i-1],newNode);
			}
			newNode.setPrev(head);
			head.setNext(newNode);
			
			DNode nextNode = new DNode();
			while(newNode.getElementInt()!=tail.getElementInt()){
				nextNode = newNode.getNext();
				nextNode.setPrev(newNode);
				newNode = nextNode;
			}
			tail = newNode;
			
		}
	}

	//Behaviors
	public void display(){
		System.out.print(name+" -> null <-> "+head.getElement());
		DNode newNode = head;
		for(int i=0; i<size-1; i++){
			newNode = newNode.getNext();
			System.out.print(" <-> "+newNode.getElement());
		}
		System.out.println(" <-> null");
	}
	public void displayReverse(){
		System.out.print(name+" -> null <-> "+tail.getElement());
		DNode newNode = tail;
		for(int i=0; i<size-1; i++){
			newNode = newNode.getPrev();
			System.out.print(" <-> "+newNode.getElement());
		}
		System.out.println(" <-> null");
	}
	//Method getSize()
	//Method isEmpty()
	//Method find(int)
	//Method findPrevious(int,int)
	//Method findAfter(int,int)
	//Method insertFirst(int)
	//Method insertLast(int)
	//Method insert(int,int)
	//Method deleteFirst()
	//Method deleteLast()
	//Method delete(int)
}
