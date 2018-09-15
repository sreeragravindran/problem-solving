var expect = require('chai').expect; 
var func = require('../../src/arrays/sum-of-two-elements-equals-given-sum');

describe("sum of any three elements in the array equals the given sum", function(){
    it('array:[10, 15, 3, 7], sum: 17 should return true', function(){
        expect( func( [10, 15, 3, 7], 17 ) ).to.equal(true);
    })

    it('array:[10, 11, 3, -2], sum: 9 should return true', function(){
        expect( func( [10, 11, 3, -2], 9 ) ).to.equal(true);
    })

    it('array:[1], sum: 2 should return false', function(){
        expect( func( [1], 2 ) ).to.equal(false);
    })
})