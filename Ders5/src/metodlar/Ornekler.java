package metodlar;

public class Ornekler {
    public static void main(String[] args) {

        helloMethod();
        sayiYaz(50);
        int sonuc=10+20;
        sayiYaz(sonuc);

        toplamaİslemi(5,3);

        int gelenDeger=donusTipiAlanToplamaIslemi(7,2);
        System.out.println("Donus Tipi Olan Toplama Islemi"+gelenDeger);
        int result =donusTipiAlanToplamaIslemi(3,6)+1;
        System.out.println("sonuc:"+result);



    }

    //return tipi olmayan ve parametre alamayan method
    //static olmasının sebebi static method dan çağırabilmek için

    public static void helloMethod(){
        System.out.println("Hello World");
    }

    //Dönüş tipi olmayan parametre alan method

    public static void sayiYaz(int sayi){
        System.out.println("Sayınız:"+sayi );
    }
//dönüş tipi olmayan 1 den fazla parametre alan method
    public static void toplamaİslemi(int sayi1,int sayi2){

        int sonuc=sayi1+sayi2;
        System.out.println("Toplama iŞlemi Sonucu: "+sonuc);
    }

    public static int donusTipiAlanToplamaIslemi (int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;
    }
}
