

function rightmost1InBinaryRepresentation() {
    var x = 10;

    console.log(x, x.toString(2));
    
    //console.log()
    
    var r1  = x - 1; 
    console.log(r1, r1.toString(2));
    
    var r2 = x & r1; 
    console.log(r2, r2.toString(2));
    
    var r3 = x ^ r2; 
    console.log(r3, r3.toString(2));
}

function nonRepeatedElementInTheArray(){
    var array = [1, 2, 5, 4, 6, 8, 9, 2, 1, 4, 5, 8, 9];

    var v = 0 ;
    array.forEach(e => {
        v = v ^ e;
        console.log(v, v.toString(2));
    })
    //console.log(v);
}

nonRepeatedElementInTheArray();



// fir