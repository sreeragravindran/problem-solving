var Queue = require('queue-fifo');
var Stack = require("stackjs");

function Node(data, left=null, right=null){
    this.data = data;
    this.left = left;
    this.right = right;
}


function Tree(){
    var root = null; 
    var queue = new Queue();

    this.getRoot = function(){
        return root;
    }

    this.addItem = function(node){
        if(root == null){
            root = node;
            queue.enqueue(node);
            return;
        }    

        // get the item from the queue 
        // insert in left if left is free 
        // insert in right if right is free
        // dequeue node if inserted in right 

        var currentNode = queue.peek();
        if(currentNode.left == null){
            currentNode.left = node;
            queue.enqueue(node);
        } else if ( currentNode.right == null){
            currentNode.right = node;
            queue.enqueue(node);
            queue.dequeue();
        }
    }

    this.getDataInLevelOrder = function(){
        if(root == null){
            return;
        }

        var node = root; 
        var queue = new Queue();
        queue.enqueue(node);
        var resultArray = new Array();

        while(!queue.isEmpty()){

            var currentNode = queue.dequeue();
            resultArray.push(currentNode);
            if(currentNode.left != null){
                queue.enqueue(currentNode.left);
            }
            if(currentNode.right != null){
                queue.enqueue(currentNode.right);
            }
        }

        return resultArray;
    }
}


function deserialize(string){
    var array = string.split("");
    var tree = new Tree();
    array.forEach(element => {
        // insert into the tree 
        // this is the first time 
        //console.log(element);
        tree.addItem(new Node(element));
    });

    return tree;
}


function serialise(tree){
    var array = tree.getDataInLevelOrder();
    var result = "";
    array.forEach(element => {
        //console.log(element.data);
        result = result.concat(element.data);
    })
    return result;
}

var tree = deserialize("hello world");
var result = serialise(tree);
console.log(result);