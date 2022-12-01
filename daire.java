package vki;
import java.util.Scanner;

public class Daire {

    public static void main(String[] args) {
        int r,merkezAci;
        double alan, cevre, pi = 3.14, daireDilimiAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Girniz : ");
        r = input.nextInt();

        System.out.print("Merkez Açısını Giriniz : ");
        merkezAci = input.nextInt();

        alan = pi * r * r;
        cevre = 2* pi * r;
        daireDilimiAlani = (pi * (r*r)*merkezAci)/360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin alanı : " +daireDilimiAlani);
    }

}
