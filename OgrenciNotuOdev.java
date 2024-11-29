import java.io.FileWriter;
import java.io.IOException;

public class OgrenciNotuOdev {
    public static void main(String[] args) {
        String[] ogrenciIsimleri = {"Hasan", "Ayşe", "Mehmet", "Zeynep", "Fatma"};
        int[] ogrenciNotlari = {48, 76, 32, 84, 59};

        try (FileWriter writer = new FileWriter("ogrenci_sonuclari.txt")) {
            for (int i = 0; i < ogrenciIsimleri.length; i++) {
                String durum = (ogrenciNotlari[i] >= 50) ? "GEÇTİ" : "KALDI";
                String satir = ogrenciIsimleri[i] + " - " + ogrenciNotlari[i] + " - " + durum;
                writer.write(satir + "\n");
                System.out.println(satir);
            }
            System.out.println("Sonuçlar dosyaya yazıldı: ogrenci_sonuclari.txt");
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}
