defmodule Math do

    # gets called only when the second parameter is passed as 0 
    # first paramter _ takes anything 
    def div(_, 0) do
        {:error, "cannot divide by zero"}
    end 

    def div(x, y ) do 
        {:ok, "value is #{x / y}"}
    end 
end

IO.inspect Math.div(1, 0)
IO.inspect Math.div(5, 3)

# Note : 
# which ever function signature matches first, that gets executed. Hence, the more specific ones should be on top followed by generic ones. 
# Just like exceptions in Java 