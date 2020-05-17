/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saglik;

/**
 *
 * @author ASUS
 */
//Soru: Hesapla sınıfını kullanarak kişinin boyunu hesaplanması gerekmektedir. Hesapla sınıfında annenin babanın boyunun tanımlanması gereklidir.
//Hesapla sınıfı yapıcı metod olarak tanımlanarak anne ve babanın boyunu parametre olarak almalıdır. Formüle göre kişinin boyu hesaplanmalıdır.
//Hesapla sınıfında vucut kitle indeksi ve yuzey alani hesaplanmalidir. yuzey alani private erişim belirleyicisi olarak tanımlanmalıdır.
//Saglik sınıfı Hesapla sınıfından türetilmelidir.
//Kisacasi OOP özellikleri kullanılarak kişinin boyunu, vucut kitle indeksini ve yuzey alanini hesaplayan program.
class Hesapla{
    int anneBoy;
    int babaBoy;
    int kisininBoyu;
    double vucutKitleIndeksi;
    private double yuzeyAlani;
    
    void Hesapla(int anneBoy, int babaBoy){
        this.kisininBoyu=((anneBoy+babaBoy)/2)+3;

}
    void Hesapla(double boy,double kilo)
    {
         this.vucutKitleIndeksi=kilo/(boy*boy);
    }
    
    private  double yuzeyAlaniHesapla(double boy, double kilo)
     
     {
         
       return  this.yuzeyAlani= Math.sqrt((boy*kilo)/3600);
       
       
     }
    
    
         public void  setyuzey(double boy,double kilo)
     {
          this.yuzeyAlani=yuzeyAlaniHesapla(boy, kilo);
             
     }  
    
    void goster(){
            System.out.println("Ortalama Boyunuz(+3/-9)="+kisininBoyu);
            System.out.println("Vucut Kitle Indeksiniz="+vucutKitleIndeksi);
            System.out.println("Vucut Yuzey Alaniniz="+yuzeyAlani);
}
    
}
public class Saglik extends Hesapla{
    
     public static void boy (int anneBoy, int babaBoy)
    {   
       int  boy=((anneBoy+babaBoy)/2)+3;
        System.out.println("Kişinin Boyu="+boy);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hesapla nesne=new Hesapla();
        nesne.Hesapla(170, 180);
        nesne.Hesapla(1.78, 60.0);
        nesne.setyuzey(1.78, 60.0);
        nesne.goster();
        nesne.anneBoy=170;
        nesne.babaBoy=180;
        boy(170,180);

    }
    
}
