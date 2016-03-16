public class DNode {

	//Attributes
	private String element;
	private DNode next, prev;

	//Constructors
	public DNode(){
		element = null;
		next = null;
		prev = null;
	}
	public DNode(int num){
		element = Integer.toString(num);
		next = null;
		prev = null;
	}
	public DNode(int num, DNode node){
		element = Integer.toString(num);
		next = node;
		prev = null;
	}
	public DNode(DNode node, int num){
		element = Integer.toString(num);
		next = null;
		prev = node;
	}
	public DNode(DNode pnode, int num, DNode nnode){
		element = Integer.toString(num);
		next = nnode;
		prev = pnode;
	}

	//Behaviors
	public DNode getNext(){
		return next;
	}
	public DNode getPrev(){
		return prev;
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
		next = new DNode(num);
	}
	public void setNext(DNode node){
		next = node;
	}
	public void setNext(DNode node, int num){
		next = new DNode(node, num);
	}
	public void setNext(int num, DNode node){
		next = new DNode(num, node);
	}
	public void setNext(DNode pnode, int num, DNode nnode){
		next = new DNode(pnode, num, nnode);
	}
	public void setPrev(){
		prev = null;
	}
	public void setPrev(int num){
		prev = new DNode(num);
	}
	public void setPrev(DNode node){
		prev = node;
	}
	public void setPrev(DNode node, int num){
		prev = new DNode(node, num);
	}
	public void setPrev(int num, DNode node){
		prev = new DNode(num, node);
	}
	public void setPrev(DNode pnode, int num, DNode nnode){
		prev = new DNode(pnode, num, nnode);
	}
}
