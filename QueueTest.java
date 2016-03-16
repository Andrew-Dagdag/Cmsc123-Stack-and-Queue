class QueueTest {
	public static void main(String[] args){
		Queue q = new Queue(new int[]{37,50});
		q.display();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.first());
		q.enqueue(5);
		q.display();
		System.out.println(q.dequeue()); 
		q.display();
		q.enqueue(5);
		q.display();
	}
}
