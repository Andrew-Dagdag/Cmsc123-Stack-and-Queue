public class CircularLinkedList {

	//Attributes
	public String name;
	private SNode head, tail;
	private int size;

	//Constructors
	public CircularLinkedList(){
		head = new SNode();
		head.setNext(head);
		tail = head;
		size = 0;
	}
	public CircularLinkedList(int[] nums){
		size = nums.length;
		head = new SNode(nums[0]);
		if(size == 1){
			head.setNext(head);
			tail = head;
		} else {
			tail = new SNode(nums[size-1],head);
			//tail.setNext();
			SNode newNode = new SNode(nums[size-2],tail);
			for(int i=size-2; i>1; i--){
				newNode = new SNode(nums[i-1],newNode);
			}
			head.setNext(newNode);
		}
	}

	//Behaviors
	public void display(){
		System.out.print(name+" -> "+head.getElement());
		SNode newNode = head;
		for(int i=0; i<size; i++){
			newNode = newNode.getNext();
			System.out.print(" -> "+newNode.getElement());
		}
	}
	//Method getSize()
	//Method isEmpty()
	//Method find(int)
	//Method insertFirst(int)
	//Method insertLast(int)
	//Method insert(int,int)
	//Method deleteFirst()
	//Method deleteLast()
	//Method delete(int)
	//Method rotateLeft()
	//Method rotateRight()
}
