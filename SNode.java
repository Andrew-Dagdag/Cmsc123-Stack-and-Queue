public class SNode {

	//Attributes
	private String element;
	private SNode next;

	//Constructors
	public SNode(){
		element = null;
		next = null;
	}
	public SNode(int num){
		element = Integer.toString(num);
		next = null;
	}
	public SNode(int num, SNode node){
		element = Integer.toString(num);
		next = node;
	}

	//Behaviors
	public SNode getNext(){
		return next;
	}
	public String getElement(){
		return element;
	}
	public int getElementInt(){
		return Integer.parseInt(element);
	}
	public void setNext(){
		next = null;
	}
	public void setNext(int num){
		next = new SNode(num);
	}
	public void setNext(SNode node){
		next = node;
	}
	public void setNext(SNode node, int num){
		next = new SNode(num,node);
	}
}
