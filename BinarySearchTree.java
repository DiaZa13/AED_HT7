public class BinarySearchTree<K extends Comparable<K>, V> {
	
	protected Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
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
	
	public void add(K key, V value) {
		root = addRecursive(root,key,value);
	}
	
	public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<BinarySearchTree:");
        s.append(root);
        s.append(">");
        return s.toString();
    }
	
	public void inOrderR(Node current) {
		if(current != null) {
			inOrderR(current.left);
			System.out.println(current.word.toString());
			inOrderR(current.right);
		}
	}
	
	public void inOrder() {
		inOrderR(root);
	}
		
	public Node searchRec(Node current,K key) {
		
		if(current.word.compareTo(key) == 0 ) 
			return current;
		
		else if(current.word.compareTo(key) > 0)
			return searchRec(current.left,key);

		return searchRec(current.right,key);
	}
	
	public V search(K key) {
		return (V) searchRec(root,key).word.getValue();

	}
}

	   
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	