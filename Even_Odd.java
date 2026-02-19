##Efficient Approch
public class even_odd {
    public static boolean isEvenOdd(int n){
        if ((n & 1)==0){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        int n= 10;
        if(isEvenOdd(n)== true){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
