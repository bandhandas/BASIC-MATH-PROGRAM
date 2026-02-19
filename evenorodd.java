
public class evenodd  {
    public static boolean isEven(int n){
        int rem =n % 2;
        if(rem==0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int n =15 ;
        if (isEven(n)== true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
