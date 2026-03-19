import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int oylanganSon = random.nextInt(100) + 1;
        int taxmin = 0;
        int urinishlar = 0;

        System.out.println("1 dan 100 gacha son o'yladim. Topa olasizmi?");

        while (taxmin != oylanganSon) {
            System.out.print("Taxminingizni kiriting: ");
            taxmin = scanner.nextInt();
            urinishlar++;

            if (taxmin < oylanganSon) {
                System.out.println("Kattaroq son ayting.");
            } else if (taxmin > oylanganSon) {
                System.out.println("Kichikroq son ayting.");
            } else {
                System.out.println("Tabriklaymiz! " + urinishlar + " ta urinishda topdingiz.");
            }
        }
    }
}