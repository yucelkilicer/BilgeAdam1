import java.util.Scanner;

public class AsalSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        if (sayi > 1) {
        }


        boolean asalMiDegilMi = true; //flag
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                asalMiDegilMi = true;

            }
        }
        if (asalMiDegilMi) {
            System.out.println("sayi asal değildir");
        } else {
            System.out.println("sayı asaldır");
        }
    }
}

