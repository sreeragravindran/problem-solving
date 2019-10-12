# declaring a module 
defmodule Math do

    # public function 
    def sum(a, b) do
        a + b 
    end 

    # private function
    defp sum_private(a, b) do 
        a + b
    end 
end


IO.puts Math.sum(1, 2)
 # IO.puts Math.sum_private(1, 2) - this is not allowed 