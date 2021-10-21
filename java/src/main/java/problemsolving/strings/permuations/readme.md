Given a string, generate all possible permutations. 
Approach 1 

Set 
abcd
bacd
bcad
bcda
acbd
acdb
cbad
cabd
cadb
cbda
cdba
cdab
badc
abdc
adcb
adbc
bdca
bdac
dcba
dbca
dbac
dcab
dacb
dabc

Queue 

bdca
bdac
dcba
dbca
dbac
dcab
dacb
dabc

current process 
abcd


abcd 
    bacd
                
    bcad
    bcda
    
Approach 2 
abcd
    perms(a,b)
    ab
        perms(ab, c)
        abc
            perms(abc, d)
            abcd
            abdc
            adbc
            dabc
        acb
            perms(acb, d)
            acbd
            acdb
            adcb
            dacb
        cab
            perms(cab, d)
            cabd
            cadb
            cdab
            dcab
    ba
        perms(ba, c)
        bac
            perms(bac, d)
            bacd
            badc
            bdac
            dbac
        bca
            perms(bca, d)
            bcad
            bcda
            bdca
            dbca
        cba       
            perms(cba, d)
            cbad
            cbda
            cdba
            dcba
           
         
Time Complexity : n! ( generating combinations)
    for each combination 
        swap operation for array length ( n )
        n * n!              