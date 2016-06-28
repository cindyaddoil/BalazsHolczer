package AVL;

public class App {

	public static void main(String[] args) {
		
		BalancedTree<Integer> tree = new BalancedTree<>();
		
		tree.insert(1);
		tree.insert(-2);
		tree.insert(3);
		tree.insert(100);
		tree.insert(101);
		tree.insert(102);
		tree.insert(-33);
		tree.insert(-3);
		
		System.out.println(tree.getMax());
		System.out.println(tree.getMin());
		
		tree.traverseInOrder();
		
		tree.remove(3);
		tree.remove(1);
		tree.remove(-33);
		tree.remove(101);
		tree.remove(100);
		
		System.out.println();
		tree.traverseInOrder();
		
		System.out.println();
		System.out.println(tree.getMin());
		
	}
}
