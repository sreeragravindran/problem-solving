package problemsolving.google.medium;

public class Power {

    static int powerRecursive(int x, int y) {
        if(y == 0) {
            return 1;
        }
        if(y % 2 == 0) {
            int result = powerRecursive(x, y /2);
            return  result * result;
        } else {
            return x * powerRecursive(x, y-1);
        }
    }

    static int powerIterative(int x, int y)
    {
        int result = 1;

        while (y > 0)
        {
            // y is even
            if (y % 2 == 0)
            {
                x = x * x;
                y = y / 2;
            }

            // y isn't even
            else
            {
                result = result * x;
                y = y - 1;
            }
        }
        return result;
    }
}
