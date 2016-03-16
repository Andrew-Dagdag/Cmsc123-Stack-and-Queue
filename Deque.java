public class Deque {

	//Attributes
	int[] queue;
	int size;

	//Constructors
	public Deque(){
		queue = new int[0];
		size = queue.length;
	}
	public Deque(int[] elements){
		queue = elements;
		size = queue.length;
	}

	//Methods
	public void display(){
		for(int i=size; i>0; i--)
			System.out.print(queue[i-1]+" ");
		System.out.println();
	}
	//Method isEmpty()
	public boolean isEmpty(){
		if(queue[0] == 0){
			return true;
		}else{
			return false;
		}
	}
	//Method size()
	public int size(){
		return queue.length;
	}
	//Method first()
	public int first(){
		return queue[0];
	}
	//Method last()
	public int last(){
		return queue[queue.length-1];
	}
	//Method addLast(int e)
	public void addLast(int e){
		for(int i = 0; i < queue.length; i++){
			if(queue[i] == 0){
				queue[i] = e;
				break;
			}
		}
	}
	//Method addFirst(int e)
	public void addFirst(int e){
		int temp1 = e, temp2 = 0;
		boolean trigger = true;
		for(int i = 0; i < queue.length; i++){
			if(trigger){
				temp2 = queue[i];
				queue[i] = temp1;
				trigger = false;
			}else if(!trigger){
				temp1 = queue[i];
				queue[i] = temp2; 
				trigger = true;
			}
		}
	}
	//Method removeFirst()
	public void removeFirst(){
		for(int i = 0; i < queue.length-1; i++){
			queue[i] = queue[i+1]; 
		}
		queue[queue.length-1] = 0; 
	}
	//Method removeLast()
	public void removeLast(){
		for(int i = queue.length-1; i >= 0; i--){
			if(queue[i] != 0){
				queue[i] = 0;
				break;
			}
		}
	}
}
