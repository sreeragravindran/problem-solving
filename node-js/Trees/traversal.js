var Stack = require("stackjs");

function Node(data, left = null, right = null){
    this.data = data;
    this.left = left;
    this.right = right; 

    this.isLeaf = function(){
        return this.left == null && this.right == null;
    }
}

// create tree 
var n1 = new Node(1);
var n2 = new Node(2);
var n3 = new Node(3);
var n4 = new Node(4);
var n5 = new Node(5);
var n6 = new Node(6);
var n7 = new Node(7);

n1.left = n2; 
n1.right = n3;

n2.left = n4;
n2.right = n5;

n3.left = n6;
n3.right = n7;

// traverse witout recursion 

function preOrderWithoutRecursion(){
    var root = n1;
    var stack = new Stack();
    var traversal = "";

    while( 1 == 1){
        while(root){
            //console.log(root.data); 
            traversal = traversal.concat(root.data).concat(" -> ");
            stack.push(root);        
            root = root.left;            
        }
        
        if(stack.isEmpty()){
            break;
        }

        root = stack.pop();
        root = root.right;
    }

    return traversal;
}

function postOrderWithoutRecursion(){
    var stack = new Stack();
    var root = n1;
    var traversal = "";

    while(root){
        if(root.isLeaf()) {
            traversal = traversal.concat(root.data).concat(" -> ");        
        }
        //stack.push({ "data" : root.left.data, "count" })            
    }    
    
}


console.log(preOrderWithoutRecursion());