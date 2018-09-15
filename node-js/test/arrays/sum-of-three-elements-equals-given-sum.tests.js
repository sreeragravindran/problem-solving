var expect = require('chai').expect; 
var code = require('../../src/arrays/sum-of-three-elements-equals-given-sum');

describe("sum of any three elements in the array equals the given sum", function(){
    it('array:[10, 15, 3, 7, 5, 10, 8, 9, 1], sum: 35 should return true', function(){
        expect( code( [10, 15, 3, 7, 5, 10, 8, 9, 1], 35 ) ).to.equal(true);
    })

    it('array:[10, 15, 3, 7, 5, 10, 8, 9, 1], sum: 19 should return true', function(){
        expect( code( [10, 15, 3, 7, 5, 10, 8, 9, 1], 19 ) ).to.equal(true);
    })

    it('array:[10, 15, 3, 7, 5, 10, 8, 9, 1], sum: 36 should return false', function(){
        expect( code( [10, 15, 3, 7, 5, 10, 8, 9, 1], 10 ) ).to.equal(false);
    })
})