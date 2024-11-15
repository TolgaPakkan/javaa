import java.util.Scanner;

public class JavaOdev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlangıç değerini giriniz: ");
        int baslangic = scanner.nextInt();
        System.out.print("Bitiş değerini giriniz: ");
        int bitis = scanner.nextInt();
        int toplam = 0;
        for (int i = baslangic; i <= bitis; i++) {
            if (i % 2 == 0) {toplam += i;
            }
        }
        System.out.println("Aradaki tüm çift sayıların toplamı: " + toplam);

        scanner.close();
    }
}

