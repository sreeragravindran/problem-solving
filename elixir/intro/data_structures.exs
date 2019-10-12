# ALL DATA STRUCTURES IN ELIXIR ARE IMMUTABLE 

# LIST
# list declaration, lists are hetrogenous 
a = [1, 2, 3, " "] 

# adding to list 
b = a ++ [5, 6]

IO.inspect a
IO.inspect b 

# Maps / Dictionaries 
map = %{ "a" => 1, "b" => 2 }

# alternate declarations 
# use atom instead of string keys 
map_with_atom_keys  = %{ :a => 1, :b => 2}
# can also be represented as below 
map_with_atom_keys = %{ a: 1, b: 2 } 

# getting from map 
map_value = map_with_atom_keys[:a]
map_value = map_with_atom_keys.a # this is possible only with atoms as keys 

IO.inspect map
IO.inspect map_with_atom_keys
IO.inspect map_value

# Q - what are mutable structures in elixir?  
# how to initial n number of values in to a list ? 