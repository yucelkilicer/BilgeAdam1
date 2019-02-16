package Matematikislamleri;

public class MathApp {
    public static void main(String[] args) {

        //math sınıfı Java.lang paketi ile otomatik olarak beraber gelir

        System.out.println("Sayının Kökünü Alma : "+Math.sqrt(16));
        System.out.println("Sayının Mutlak Değeri: "+Math.abs(-2));
        System.out.println("ondalıklı sayının bir üst tam sayı değerini alma: "+Math.ceil(2.17));
        System.out.println("ondalıklı sayının bir alt tam sayı değerini alma"+Math.floor(5.98));
        System.out.println("Ondalıklı Sayıda en yakın sayı değeri(0.50 den sonra yukarı oncesi"+Math.max(5,7));
        System.out.println("Bir Sayının Üstünü Alma: " +Math.pow(5,5));
        System.out.println("sayılar arasında büyük olanı bulma"+Math.max(1,6));
        System.out.println("Sayılar Arasında küçük olanı bulma"+Math.min(2,5));
        System.out.println("PI Sayının Değeri:"+Math.PI);
        System.out.println("Enler Değeri"+Math.E);

        System.out.println("Random Sayı Değeri"+Math.random());
        System.out.println("0 ile 20 arasında sayı üretme"+(int) Math.random()*20);
    }
}
