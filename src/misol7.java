    import java.util.Scanner;

    public class misol7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();
            String sanoq = Long.toBinaryString(N);
            int sum = Long.bitCount(N);
            String sb = Integer.toBinaryString(sum);
            System.out.println(sanoq+" "+sb);
        }
    }
