/*

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division? 
120 

 1 1 40 5 5 
 1 

*/ 

function func(array){

    if(array.length < 3){
        return array;
    }

    var leftSideProducts = getLeftSideProducts(array);
    var lastValue = array[array.length -1];
    var product = 1
    array[array.length - 1] = leftSideProducts[leftSideProducts.length -1];
    for(var i = array.length - 2; i >= 0; i--){
        product = product * lastValue;
        lastValue = array[i];
        array[i] = product * leftSideProducts[i];
    }
    return array;
}

function getLeftSideProducts(array){

    var tempArray = new Array(array.length);
    var product = 1;
    tempArray[0] = array[0];
    for(var i = 1; i < array.length; i++){
        tempArray[i] = (product = product * array[i - 1]);
    }

    //onsole.log(tempArray);
    return tempArray;
}


module.exports = func;