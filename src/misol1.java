import java.util.Scanner;

public class misol1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n % 2 == 0) {
            System.out.println(2);
            return;
        }

        for(long i = 3; i * i <= n; i += 2) {
            if(n % i == 0){
                System.out.println(i);
                return;
            }
        }

        System.out.println(n);
    }
}