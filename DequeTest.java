public class DequeTest{
	public static void main(String[] args){
		Deque dq = new Deque(new int[]{37,50});
		dq.display();
		System.out.println(dq.isEmpty());
		System.out.println(dq.size());
		System.out.println(dq.first());
		System.out.println(dq.last());
		dq.removeFirst();
		dq.display();
		dq.addFirst(5);
		dq.display();
		dq.removeLast();
		dq.display();
		dq.addLast(10);
		dq.display();
	} 
}