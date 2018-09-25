/* 
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */ 

 function sumOfAnyTwoElementsEqualsGivenSum(inputArray, sum){ 

     var map = new Map();
     var temp = 0; 
     var result = false; 

     inputArray.forEach(element => {
         var temp = sum - element;
         if (map.has(temp)){
             result = true; 
             return; // breaks the for loop 
         }
         map.set(element, "");
         //console.log(map);
     });
     
     return result; 
 }


// var result = exists([10, 11, 3, -2], 9);

// console.log(result);

module.exports = sumOfAnyTwoElementsEqualsGivenSum;
