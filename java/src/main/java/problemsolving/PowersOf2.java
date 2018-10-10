package problemsolving;

public class PowersOf2 {

    private int n;
    private int base;

    public PowersOf2(int until){
        n = until;
        base = 2;
    }

    public void print(){
        int power = 0;
        for(int i=0; i<=n; i = (int)Math.pow(2, power)){
            System.out.println((int)Math.pow(2, power));
            power++;
        }
    }

    public void printUsingRecursion(int startingPower){
        int value = (int)Math.pow(base, startingPower);
        if(value > n) { return ;}
        System.out.println(value);
        printUsingRecursion(startingPower + 1);
    }
}
