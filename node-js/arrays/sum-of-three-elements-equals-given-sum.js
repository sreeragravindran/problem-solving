/* 
    Given a list of numbers and a number k, return whether any three numbers from the list add up to k.
     For example, given [10, 15, 3, 7, 5, 10, 8, 9, 1] and k of 9, return true since 3 + 5 + 1 is 9.
 */ 

 function exists(array, sum){ 

        if(array.length < 3){
            return false;
        }
      
        // sort the array 
        array.sort(function(a, b){return a - b}); // sort in ascending order 

        console.log(array);
        for (var i = 0; i < array.length - 2; i++) {
            var left = i + 1;
            var right = array.length - 1;

            while( left < right){
                var guess = array[i] + array[left] + array[right]; 
                if(guess == sum){
                    return true; 
                }
                if(guess < sum){
                    left++;
                }
                else {
                    right--;
                }
            }
            const element = array[i];
            
        }

        return false; 
        //console.log(inputArray);
 }


var result = exists([10, 15, 3, 7, 5, 10, 8, 9, 1], 35);

console.log(result);