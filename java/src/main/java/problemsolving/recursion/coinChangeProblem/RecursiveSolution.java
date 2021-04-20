package ProblemSolving.recursion.coinChangeProblem;

import java.util.Arrays;

public class RecursiveSolution {

    private int _remainingAmount ;
    //
    public int minimumCoins(int[] denominations, int amount){
        // sort in desc order
        // so process the bigger denominations first
        // when the amount becomes 0, totakl
        Arrays.sort(denominations);
        this._remainingAmount = amount;
        return countMinimumCoins(amount, denominations);
    }

    private int countMinimumCoins(int amount, int[] denominations){
        // boundary conditions
        if(amount == 0){
            return 0;
        }

        int count  = 0;
        // recursive logic
        for(int i=denominations.length-1; i>=0; i--){
            // global variable to check if amount was consumed totally
            if(_remainingAmount == 0){
                return count;
            }
            if(amount - denominations[i] == 0){
                _remainingAmount = amount - denominations[i];
                return count + 1;
            }
            if(amount >= denominations[i]){
                _remainingAmount = amount - denominations[i];
                count = 1 + countMinimumCoins(_remainingAmount, denominations);
            }
        }
        // if amount was consumed, count has minimum value, else -1;
        return _remainingAmount ==0 ? count : -1;
    }


    /*
          75
            i = 0;
            count = 1 +
                46
                    i=0
                    count 1 + 1
                        17 returns 1 // consumed amount;

            75

     */
}
