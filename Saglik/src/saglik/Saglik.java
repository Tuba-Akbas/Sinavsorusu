/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saglik;

/**
 *
 * @author ASUS
 
Hesapla isimli bir sınıf tanımlayınız. Bu sınıfın anneBoy, babaBoy ve kisininBoyu isimli tamsayı tipinde üç özelliği bulunmaktadır.
Bu sınıfın ayrıca double tipinde vucutKitleIndeksi ve private double yuzelAlani isimli iki özelliği daha bulunmalıdır.
Hesapla sınıfı yapıcı metod olarak tanımlanarak anneBoy ve babaBoy özelliklerini parametre olarak almalıdır. Formüle göre kişinin boyu hesaplanmalıdır.
Hesapla sınıfı yapıcı metod olarak tanımlanarak double boy ve double kilo tiplerinde iki özelliği alarak vucut kitle indeksi formüle göre hesaplanmalıdır.
yuzeyAlaniHesapla metodu double boy, double kilo tipinde iki özelliği alarak yüzeyAlani hesaplayarak geri döndürmelidir. Tüm bu işlemlerin goster fonksiyonuyla 
ekrana yazırılıyor.
Saglik sınıfı Hesapla sınıfından türetilmelidir.
Kisacasi OOP özellikleri kullanılarak kişinin boyunu, vucut kitle indeksini ve yuzey alanini hesaplayan program.
*/
    class Hesapla {

    int anneBoy;
    int babaBoy;
    int kisininBoyu;
    double vucutKitleIndeksi;
    private double yuzeyAlani;

    void Hesapla(int anneBoy, int babaBoy) {
        this.kisininBoyu = ((anneBoy + babaBoy) / 2) + 3;

    }

    void Hesapla(double boy, double kilo) {
        this.vucutKitleIndeksi = kilo / (boy * boy);
    }

    private double yuzeyAlaniHesapla(double boy, double kilo) {

        return this.yuzeyAlani = Math.sqrt((boy * kilo) / 3600);

    }

    public void setyuzey(double boy, double kilo) {
        this.yuzeyAlani = yuzeyAlaniHesapla(boy, kilo);

    }

    public double getyuzey() {
        return this.yuzeyAlani;
    }

    void goster() {
        System.out.println("Ortalama Boyunuz(+3/-9)=" + kisininBoyu);
        System.out.println("Vucut Kitle Indeksiniz=" + vucutKitleIndeksi);
        System.out.println("Vucut Yuzey Alaniniz=" + yuzeyAlani);
    }

    }

    public class Saglik extends Hesapla {
        

    public static void main(String[] args) {
        // TODO code application logic here

        Hesapla nesne = new Hesapla();
        nesne.Hesapla(170, 180);
        nesne.Hesapla(1.78, 60.0);
        nesne.setyuzey(1.78, 60.0);
        nesne.goster();
    }

}
