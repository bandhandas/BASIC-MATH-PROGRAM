#BY LOOP
  
public class GCD {
    public static int gcd(int a,int b){
        int result= Math.min(a,b);
        while (result > 0){
            if(a% result ==0 && b % result == 0){
                break ;
            }
            result--;

        }
        return result;
    }

    public static void main(String[] args) {
        int a=90;int b=80;
        System.out.println(gcd(a,b));
    }
}
