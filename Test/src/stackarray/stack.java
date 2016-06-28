package stackarray;

public class stack<Item> {
	Item[] stack;
	int numberOfItems;
	public stack(){
		stack = (Item[]) new Object[1];
	}
	public void push(Item item) {
		if (numberOfItems == this.stack.length) {
			resize(2*numberOfItems);
		}
		stack[numberOfItems++] = item;
	}
	public Item pop() {
		Item popItem = stack[--numberOfItems];
		if (numberOfItems > 0 && numberOfItems == this.stack.length/4) {
			resize(this.stack.length/2);
			
		}
		return popItem;
	}
	public int size(){
		return this.numberOfItems;
	}
	public boolean isEmpty() {
		return this.numberOfItems == 0; 
	}
	private void resize(int capacity) {
		Item[] stackCopy = (Item[]) new Object[capacity]; 
		for (int i = 0; i< numberOfItems; i++) {
			stackCopy[i] = this.stack[i];
		}
		this.stack = stackCopy;
	}
	public static void main(String[] args) {
		int[] intArray = new int[10];
		intArray[0] = 1;
		System.out.println(intArray[0]);
	}

}
