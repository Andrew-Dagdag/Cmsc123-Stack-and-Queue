class ListTest {
	public static void main(String[] args){
		SinglyLinkedList ls = new SinglyLinkedList(new int[]{13,50,37,10});
		//System.out.println(l.getSize() + " " +l.isEmpty());
		ls.name = "ls";
		ls.display();
		DoublyLinkedList ld = new DoublyLinkedList(new int[]{13,50,37,10});
		ld.name = "ld";
		ld.display();
		ld.displayReverse();
		CircularLinkedList lc = new CircularLinkedList(new int[]{13,50,37,10});
		lc.name = "lc";
		lc.display();
	}
}
