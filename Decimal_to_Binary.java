public class DEC_TO_BIN {
    public static void dectobin(int n){
        int mynum= n;
        int pow = 0;
        int binnum=0;
        while(n > 0){
            int rem= n% 2;
            binnum = binnum +(rem * (int)Math.pow(10  , pow ));
            pow++;
            n=n/2;
        }
        System.out.println("binany of "+ mynum + "  is "+ binnum);


        }

    public static void main(String[] args) {
        dectobin(7);
    }
}
