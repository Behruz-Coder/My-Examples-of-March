import java.util.Scanner;

public class misol2 {
    public static void main(String[] args){
        Scanner ne = new Scanner(System.in);
        int n = ne.nextInt();
        if(n%2==0){
            System.out.println(n);
        }else {
            System.out.println(n*2);
        }
    }
}
