/*

Given a linked list, rearrange the node values such that they appear in alternating low -> high -> low -> high ... form. 
For example, given 1 -> 2 -> 3 -> 4 -> 5, you should return 1 -> 3 -> 2 -> 5 -> 4 

*/

function Node(value, next){
    this.value = value;
    this.next = next;

    
    this.display = function(){
        var me = this; 
        let result = ""; 
        while(me != null){        
            result = result.concat(me.value + "->");
            me = me.next;
        }
        console.log(result);
    }
}

function rearrange(head){
    var current = head;
    var counter = 1;
    // boundary case 
    if(head.next == null){
        return head; 
    }
    
    while(current.next != null){
        if(counter % 2 == 0) { // high to low 
            if(current.value < current.next.value){
                swapNodeWithItsNext(current);
                                
            }
        } 
        else { // low to high 
            if(current.value > current.next.value){
                swapNodeWithItsNext(current);	
            }            
        }
        current = current.next;
        counter++;
    }

    return head;
}

function swapNodeWithItsNext(node){
    var temp = node.value;	 
    node.value = node.next.value;
    node.next.value = temp; 
}

// test 
function test(){
    let head = new Node(1, new Node(4, new Node(3, new Node(2, new Node(5, null)))))
    head.display();

    var newHead = rearrange(head);
    newHead.display()

}

test();
