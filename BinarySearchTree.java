/**
 * @author Diana Zaray Corado Lopez #191025
 * @version 17/03/2020
 * @author Marcos Lopez Gonzalez
 * @author GeeksforGeeks
 * Clase adaptada de BinarySearchTree|Set1 (Search and Insertion) e Implementing a Binary Tree in Java
 * Extraido de: @see https://www.baeldung.com/java-binary-tree
 * Extraido de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion
 *
 * @param <K> 
 * @param <V> 
 */
public class BinarySearchTree<K extends Comparable<K>, V> {
	
	protected Node root;
	protected String msg = "";

	
	/**
	 * Constructor
	 */
	public BinarySearchTree() {
		root = null;
	}
	
	
	/**
	 * Recursive function to add a new association on the binary three, depends if the key of the association
	 * is greater or less than the root
	 *
	 */
	private Node addRecursive(Node current, K key, V value) {
		
		ComparableAssociation<K,V> valor = new ComparableAssociation(key,value);
		
		if(current == null)
			return new Node(key,value);
		
		if(valor.compareTo(current.word)< 0)
			current.left = addRecursive(current.left,key,value);
		else if(valor.compareTo(current.word)>0)
			current.right = addRecursive(current.right,key,value);
		else
			return current;
		
		return current;
			
	}
	
	/**
	 * Adds a new association on the binary tree
	 * @pre the binary search tree can be empty
	 * @post the binary search tree isn't empty
	 * 
	 * @param key
	 * @param value
	 */
	public void add(K key, V value) {
		root = addRecursive(root,key,value);
	}
	
	/**
	 * Recursive function to read the associations on the tree in order
	 * @param current
	 */
	public String inOrderR(Node current) {
		if(current != null) {
			inOrderR(current.left);
			msg += ","+current.word.toString();
			inOrderR(current.right);
		}
		return msg;
	}
	/**
	 * Shows the association on the tree in-order
	 * @pre the three isn't empty
	 * @post returns the association in-order path
	 * @return msg
	 */
	public String inOrder() {
		 inOrderR(root);
		 return msg;
	}
	
	/**
	 * Recursive function to look for a value	
	 * @param current
	 * @param key
	 * @return
	 */
	public Node searchRec(Node current,K key) {
		if(current.word.compareTo(key) == 0 )
			return current;
		
		else if(current.word.compareTo(key) > 0)
			return searchRec(current.left,key);

		return searchRec(current.right,key);

	}
	
	/**
	 * Look for a value based on the key (if the key is on the tree)
	 * @pre the key is on the tree
	 * @post returns the value of the key
	 * @param key
	 * @return
	 */
	public V search(K key) {
		return (V) searchRec(root,key).word.getValue();

	}
	
}

	   
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	