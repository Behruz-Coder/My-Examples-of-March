import java.util.Scanner;

public class misol4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String katta = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("PIIMA olimpiadasiga xush kelibsiz, " + katta + "!");
    }
}
