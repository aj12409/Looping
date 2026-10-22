import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int count1 = 20;
        int count2 = 0;
        int count3 = 12;

        // A loop that counts up by 1 from 0 to 20
        while (count <= 20) {
            System.out.println(count);
            count++;
        }
        //A loop that counts down by 1 from 20 to 0
        while (count1 >= 0) {
            System.out.println(count1);
            count1--;
        }
        //A loop that counts up by 3 from 0 to 24
        while (count2 <= 24) {
            System.out.println(count2);
            count2 = count2 + 3;
        }
        // A loop that counts down by 2 from 12 to 0
        while (count3 >= 0) {
            System.out.println(count3);
            count3 = count3 - 2;
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
