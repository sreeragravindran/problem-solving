# matches and assigns value 10 to x 
x = 10 

# performs a match  
10 = x 

# performs only a match ( ^ is called the pin operator)
^x = 10 


success = {:ok, "success"} 
failure = {:error, "something went wrong"}
failure2 = {:error,  "you are dead !"}

# pattern matching to handle success / failure  
case_result = case failure2 do    
    {:ok, x} -> "#{x}"
    {:error, "something went wrong"} -> "failure: something went wrong"  
    {:error, y} -> "failure: #{y}"  
    {:error, :fatal, z} -> "fatal: #{z}"  
    {a, b} -> "generic two value tuple match"
    _ -> "default case"
end 

IO.inspect case_result