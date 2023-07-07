public class IsPrime {
    public static void main(String[] args) {
        int a=11;
        boolean isPrime=false;
        for (int i=2;i<a;i++){
            if (i%2==0){
                isPrime=true;

            }
        }
            if (!isPrime){
                System.out.println(a +"is a prime");
            }else {
                System.out.println(a+"is not a prime");
            }

    }
}
