public class ComparableAssociation<K extends Comparable<K>,V> {
	
	protected K key;
	protected V value;
	
	public ComparableAssociation(K key, V value) {
		this.key = key;
		this.value = value;
				
	}
	
	public K getKey() {
		
		return this.key;
	}
	
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
	 
	 public int compareTo(K that){
	       
		 return this.getKey().compareTo(that);
	 }
	 
	 
	 public String toString()
	    {
	        StringBuffer s = new StringBuffer();
	        s.append("<ComparableAssociation: "+getKey()+"="+getValue()+">");
	        return s.toString();
	    }

}


