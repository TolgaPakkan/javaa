import java.util.Scanner;

public class JavaOdev3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notu:");
        double vize = scanner.nextDouble();
        System.out.print("Final notun:");

        double finalNotu = scanner.nextDouble();
        double toplamNot = (vize * 0.4) + (finalNotu * 0.6);

        String toplamNotu2 = (toplamNot <= 45) ? "FF" : (toplamNot <= 60) ? "CB" : (toplamNot <= 70) ? "BB" : (toplamNot <= 85) ? "BA" : "AA";

        System.out.println("Toplam Not:"+ toplamNot);
        System.out.println("Toplam Notu 2:"+ toplamNotu2);
    }
}