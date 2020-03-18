/**
 * @author Diana Zaray Corado Lopez #191025
 * @version 17/03/2020
 * @author Duane A Bailey, (2001)
 * Clase adaptada de  @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 * Describe the association betwen a key and a value
 */


public class ComparableAssociation<K extends Comparable<K>,V> {
	
	protected K key;
	protected V value;
	
	public ComparableAssociation(K key, V value) {
		this.key = key;
		this.value = value;
				
	}
	
	/**
	 * Get the key of an association
	 * @pre key part of a ComparableAssociation
	 * @post returns the key of an association
	 * @return key
	 */
	public K getKey() {
		
		return this.key;
	}
	/**
	 * Get the value of an association
	 * @pre value correspond to a ComparableAssociation
	 * @post returns the value of an association
	 * @return value
	 */
	public V getValue() {
		
		return this.value;
	}
	/**
	 * Determine the order of two comparable associations, based on key.
	 *
	 * @pre other is non-null ComparableAssociation
	 * @post returns integer representing relation between values
	 * 
	 * @param other The other comparable association.
	 * @return Value less-than equal to or greater than zero based on comparison
	 */
	 public int compareTo(ComparableAssociation<K,V> that){
	       
		 return this.getKey().compareTo(that.getKey());
	 }
	 
	 /**
	  * Construct a key-value association that can be ordered.
	  *
	  * @pre key is non-null
	  * @post constructs association between a comparable key and a value
	  *
	  * @param key The (comparable) key.
	  * @param value The (possibly comparable) associated value.
	  */
	 public int compareTo(K that){
	       
		 return this.getKey().compareTo(that);
	 }
	 
	  /**
	   * Construct a string representation of the ComparableAssociation.
	   *
	   * @post returns string representation
	   *
	   * @return The string representing the ComparableAssociation.
	   */	 
	 public String toString()
	    {
	        StringBuffer s = new StringBuffer();
	        s.append("Asociacion: "+getKey()+"|"+getValue());
	        return s.toString();
	    }

}


