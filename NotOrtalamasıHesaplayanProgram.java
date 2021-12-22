import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ders = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ort;
        int toplam;
        System.out.print("Matematik notunu girin:");
        mat = ders.nextInt();
        System.out.print("fizik notunu girin: ");
        fizik = ders.nextInt();
        System.out.print("kimya notunu girin: ");
        kimya = ders.nextInt();
        System.out.print("turkce notunu girin:");
        turkce = ders.nextInt();
        System.out.print("tarih notunu girin:");
        tarih = ders.nextInt();
        System.out.print("müzik notunu girin:");
        muzik = ders.nextInt();
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ort = toplam / 6;
        System.out.println("Not ortalamanız: " + ort);
        boolean durum = (ort >= 60);
        System.out.print("Geçme Durumu =" + durum);







    }
}
