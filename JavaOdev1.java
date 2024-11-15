public class JavaOdev1 {
    public static void main(String[] args) {
        int toplam = 0;
        int sayiAdedi = 100;
        for (int i = 1; i <= sayiAdedi; i++) {
            toplam += i;
        }
        double ortalama = (double) toplam / sayiAdedi;
        System.out.println("1'den 100'e kadar olan sayıların toplamı: " + toplam);
        System.out.println("1'den 100'e kadar olan sayıların ortalaması: " + ortalama);
    }
}
