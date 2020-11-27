/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan61.bangunruang;

/**
 *
 * @author senenngahenen
 */
public class IF10K10119906Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     * Nama     : Rizqy ANanda RUsmana
     * NIM      : 10119906
     * Kelas    : IF10K
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        double bola1 = bola.hitungVolume(7,0);
        System.out.printf("Hasil : V Bola \t\t= %.1f cm%n", bola1 );

        Tabung tabung = new Tabung();
        double tabung1 = tabung.hitungVolume(10, 21);
        System.out.printf("Hasil : V Tabung \t= %.1f cm%n", tabung1);

        Kerucut kerucut = new Kerucut();
        double kerucut1 = kerucut.hitungVolume(14, 9);
        System.out.printf("Hasil : V Kerucut \t= %.1f cm%n", kerucut1);


    }
}
