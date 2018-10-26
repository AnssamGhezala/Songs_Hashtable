package hashMap;
// ANSSAM GHEZALA 260720743

public class HashLinkedList<K,V>{
    /*
     * Fields
     */
    private HashNode<K,V> head;

    private Integer size;

    /*
     * Constructor
     */

    HashLinkedList(){
        head = null;
        size = 0;
    }

   /* public static void main (String[] args){
       
        HashLinkedList<Integer, String> hll = new HashLinkedList<Integer, String>();
        hll.add(5, "taylor");
        hll.add(6, "Salma");
        hll.add(9, "Marie");
        hll.add(7, "Yasmina");
        HashNode<Integer, String> test = hll.getListNode(9);
        hll.head = test;
        
        hll.toString();
        
        
        
        
    } */
    /*
     *Add (Hash)node at the front of the linked list
     */

    public void add(K key, V value){
        // ADD CODE BELOW HERE
      
      HashNode<K,V> newNode = new HashNode<K,V>(key,value);
        
        size++; 
      
        if (head == null){
          head = newNode;
        } else {
        
        newNode.next = head;
        head = newNode;
        }
       
  
        
        // ADD CODE ABOVE HERE
    }

    /*
     * Get Hash(node) by key
     * returns the node with key
     */

    public HashNode<K,V> getListNode(K key){
        // ADD CODE BELOW HERE
      
       HashNode<K,V> current = head;
   
       while ((current != null)   && (current.getKey() != key)   ) {
         current = current.next; 
         
       } 
  
     
      
      return current;  
       
    
        // ADD CODE ABOVE HERE
    }


    /*
     * Remove the head node of the list
     * Note: Used by remove method and next method of hash table Iterator
     */

    public HashNode<K,V> removeFirst(){
        
        return remove(head.getKey()); 
    }

    /*
     * Remove Node by key from linked list 
     */

    public HashNode<K,V> remove(K key){
        // ADD CODE BELOW HERE
       
     
      HashNode<K,V> current = head;
      int index = 0;
      while ( (current.getKey() != key) && (current != null)) {
        current = current.next; 
        index++;
      } 
    
      HashNode<K,V> nodeToRemove = current; 
      
      if (current !=null) {
        
        if ((size == 1) && (index == 0)) {
          size--;
         current= head; 
         head = null;
         return current;
        } 
        else if ( index == 0 ) {
          size--;
          current = head;
          head = head.next;
          return current;
        } else  {
          size--;
          
          current = head;
        
          for (int i = 0; i < index-1; i++){
            current = current.next;
          }
   
          current.next = current.next.next;
          
          return nodeToRemove;  
        }
        
      }
        
          
     
    
return current;
        // ADD CODE ABOVE HERE
     
    }
    
    /*
     * Delete the whole linked list
     */
    public void clear(){
        head = null;
        size = 0;
    }
    /*
     * Check if the list is empty
     */

    boolean isEmpty(){
        return size == 0? true:false;
    }

    int size(){
        return this.size;
    }

    //ADD YOUR HELPER  METHODS BELOW THIS
    public String toString(){
    
    HashNode<K, V> current = head;
    
    while(current != null){
        System.out.println(current.getValue() + "  " + current.getKey());
        
        current = current.next;
        
      }
    
    return new String(" a");
    
    }
    
  public HashNode<K,V> getHead() {
    return head;
  }
    //ADD YOUR HELPER METHODS ABOVE THIS

}

