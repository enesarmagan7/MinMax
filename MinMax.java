package Week2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int girilenSayi = 5;
        int enKucukFark = 0;
        int enKucukYakinSayi = 0;
        int enBuyukFark = 0;
        int enBuyukYakinSayi = 0;

        for (int eleman : list) {
            if (eleman == girilenSayi) {
                // Girilen sayı zaten dizide bulunuyor.
                continue;
            }

            int fark = girilenSayi - eleman;

            if (fark > 0 && (enKucukFark == 0 || fark < enKucukFark)) {
                enKucukFark = fark;
                enKucukYakinSayi = eleman;
            }

            if (fark < 0 && (-fark < enBuyukFark || enBuyukFark == 0)) {
                enBuyukFark = -fark;
                enBuyukYakinSayi = eleman;
            }
        }

        System.out.println("Girilen Sayı: " + girilenSayi);

        if (enKucukFark != 0) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukYakinSayi);
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı bulunamadı.");
        }

        if (enBuyukFark != 0) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukYakinSayi);
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı bulunamadı.");
        }
    }
}









