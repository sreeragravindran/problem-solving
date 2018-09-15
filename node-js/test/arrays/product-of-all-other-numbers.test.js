var expect = require('chai').expect; 
var func = require('../../src/arrays/product-of-all-other-numbers');

describe("return array with product of all the other numbers", function(){
    it('[1, 2, 3, 4, 5] should return [ 120, 60, 40, 30, 24 ]', function(){
        expect( func( [1, 2, 3, 4, 5] ) ).eqls([ 120, 60, 40, 30, 24 ]);
    })

    it('[1, 2, 3] should return [ 6, 3, 2 ]', function(){
        expect( func( [1, 2, 3] ) ).eqls([ 6, 3, 2]);
    })

    it('[1, 2] should return [ 1, 2 ]', function(){
        expect( func( [1, 2] ) ).eqls([ 1, 2]);
    })
})