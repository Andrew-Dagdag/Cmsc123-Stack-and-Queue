class Stack {

	//Attributs
	private int size;
	private int[] stack;

	//Constructors
	public Stack(){
		stack = new int[0];
		size = stack.length;
	}
	public Stack(int[] elements){
		stack = elements;
		size = stack.length;
	}

	//Methods
	public void display(){
		for(int i=size; i>0; i--)
			System.out.println(stack[i-1]);
	}
	//Method push(e)
	//Method pop()
	//Method top()
	//Method size()
	//Method isEmpty()
}
