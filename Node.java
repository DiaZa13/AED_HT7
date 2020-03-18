/**
 * 
 * @author Diana Zaray Corado Lopez #191025
 * @version 17/03/2020
 * @author Marcos Lopes Gonzalez
 * La siguiente clase fue basada en @see https://www.baeldung.com/java-binary-tree
 * @param <K> key of the association
 * @param <V> value of the association
 */
public class Node<K extends Comparable<K>,V> {
	
	//Auxiliar class that store the associations and keep a reference to each child
	protected ComparableAssociation<K,V> word;
	protected Node left;
	protected Node right;
	
	public Node(K key, V value) {
		this.word = new ComparableAssociation<K,V>(key,value);
		this.left = null;
		this.right = null;
	}
	
}
