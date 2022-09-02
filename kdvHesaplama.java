import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        try (var input = new Scanner(System.in)) {
            System.out.print("Tutarı Yazınız :");
            tutar = input.nextDouble();
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :"+tutar);
        System.out.println("KDV Oranı :"+kdvOran);
        System.out.println("KDV :"+kdvTutar);
        System.out.println("KDV'li Tutar :"+kdvliTutar);

    }
}
//https://app.patika.dev/semihhato