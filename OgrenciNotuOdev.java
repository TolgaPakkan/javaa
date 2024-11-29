public class OgrenciNotuOdev {
    public static void main(String[] args) {
        String[] ogrenciIsimleri = {"Hasan", "Ayşe", "Mehmet", "Zeynep", "Fatma"};
        int[] ogrenciNotlari = {48, 76, 32, 84, 59};
        for (int i = 0; i < ogrenciIsimleri.length; i++) {
            String durum = (ogrenciNotlari[i] >= 50) ? "GEÇTİ" : "KALDI";
            System.out.println(ogrenciIsimleri[i] + " - " + ogrenciNotlari[i] + " - " + durum);
        }

    }
}
