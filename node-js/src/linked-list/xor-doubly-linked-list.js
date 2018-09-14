function Node(value, both){
    this.value = value;
    this.both = both; 
}

var node = new Node("first node"); 
var node2 = new Node("second node");

var address1 = 10;
var address2 = 20; 
var address3 = 30; 

console.log(address1, address1.toString(2))
console.log(address2, address2.toString(2))
console.log(address3, address3.toString(2))

console.log(address1 ^ address2);