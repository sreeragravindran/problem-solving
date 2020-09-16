Given a list of [origin, destination] pairs (you can think of them as plane tickets), sort them into a single continuous route.

Sample Input

[
    ["SFO", "EWR"],
    ["SJC", "LAX"],
    ["DFW", "SJC"],
    ["EWR", "OAK"],
    ["LAX", "SFO"]
]
Desired output
EWR SFO
LAX SJC
SJC DFW
OAK EWR

DFW SJC LAX SFO

["DFW", "SJC", "LAX", "SFO", "EWR", "OAK"]

-----------------


Given a set of [origin, destination] nodes with no guarantees of connectedness and non-branching, 
find the longest continuous route. Sample input
[
    ["SFO", "EWR"],
    ["SJC", "LAX"],
    ["DFW", "SJC"],
    ["EWR", "OAK"],
    ["PHL", "MSP"],
    ["SLC", "ONT"],
    ["LDN", "MSP"],
    ["MSP", "ATL"],
    ["LAX", "SFO"],
    ["EWR", "TRT"],
    ["SJC", "CDG"],
    ["CDG", "NDL"],
    ["EWR", "BOS"],
    ["BOS", "PHL"]
]

SFO EWR OAK
             
        TRT
             
        BOS 
            PHL 
                MSP 
                    ATL 

Desired output
["DFW", "SJC", "LAX", "SFO", "EWR", "BOS", "PHL", "MSP", "ATL"]