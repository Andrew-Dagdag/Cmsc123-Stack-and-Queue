public class Queue {

	//Attributes
	int[] queue;
	int size;

	//Constructors
	public Queue(){
		queue = new int[0];
		size = queue.length;
	}
	public Queue(int[] elements){
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
		if (queue == null){
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
	//Method enqueue(int e)
	public void enqueue(int e){
		for(int i = 0; i < queue.length; i++){
			if(queue[i] == 0){ 
				queue[i] = e;
				break;
			}
		}
	}
	//Method dequeue()
	public int dequeue(){
		int temp = queue[0];
		for(int i = 0; i < queue.length-1; i++){
			queue[i] = queue[i+1]; 
		}
		queue[queue.length-1] = 0;
		return temp;
	}
}
