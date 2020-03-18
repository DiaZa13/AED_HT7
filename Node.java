
public class Node<K extends Comparable<K>,V> {
	
	protected ComparableAssociation<K,V> word;
	protected Node left;
	protected Node right;
	
	public Node(K key, V value) {
		this.word = new ComparableAssociation<K,V>(key,value);
		this.left = null;
		this.right = null;
	}
	
}
