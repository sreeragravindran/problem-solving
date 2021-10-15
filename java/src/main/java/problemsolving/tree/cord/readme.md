
A cord is a string that broken up and stored in a tree. A cord tree has two types of
node. There is a leaf node which will contain a length field and a data field.
There is also an internal node which stores a pointer to a left child and a
pointer to a right child. The internal node stores the total length of its two children.
Some examples
-------------

* A single leaf:
  root: Leaf<len=5>:ABCDE
    
        root ( 26 ) 
  ABCDE (5)       *(21)
      FGHIJKLMNO PQRSTUVWXYZ
  
* A larger tree:
  root: Internal<len=26>
      ->left : Leaf<len=5>:ABCDE
      ->right: Internal<len=21>
          ->left : Leaf<len=10>:FGHIJKLMNO
          ->right: Leaf<len=11>:PQRSTUVWXYZ
          
Q1) Define the structures, in code, for these two node types.


abstract class Node { 
    int len; 
  
    public boolen isLeaf(); 
}

class InternalNode extends Node {
  Node left; 
  Node right;     
  
  public boolen isLeaf() { return false }
}

class LeafNode extends Node {
  String data;
  public boolen isLeaf() { return true }
}

/*2) Write a function that accepts a cord and an index N. Return the Nth character in the cord.*/

/* 


* A single leaf:
  root: Leaf<len=5>:ABCDE
    
        root ( 26 ) 
  ABCDE (5)     *(21)
      FGHIJKLMNO(10) PQRSTUVWXYZ(11)     
      
  
* A larger tree:
  root: Internal<len=26>
      ->left : Leaf<len=5>:ABCDE
      ->right: Internal<len=21>
          ->left : Leaf<len=10>:FGHIJKLMNO
          ->right: Leaf<len=11>:PQRSTUVWXYZ
          */

Node cord;
Character GetCharacterAt(Node cord, int N) {
    if(cord.len < N) {
      return null; 
    } 
  
    if(cord.isLeaf()) {
      return ((LeafNode)cord).data.charAt(N);           
    }
  
    Character charfromLeft = GetCharacterAt(((InternalNode)cord).left, N); 
    if(charFromLeft == null) {
        Character charfromRight = GetCharacterAt(((InternalNode)cord).right, N - ((InternalNode)cord).left.len); 
    }
    
    return charFromLeft != null ? charFromLeft : charfromRight; 
}
