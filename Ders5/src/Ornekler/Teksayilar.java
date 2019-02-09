package Ornekler; // 1 den 100 e kadar olan sayılar

public class Teksayilar {
    public static void main(String[] args) {
        String teksayilar="";
        int sayi;
        for(sayi =0; sayi<100; sayi++){

            if(sayi%2==1){
                teksayilar=teksayilar+sayi+" ";

            }
        }
        System.out.println("Tek Sayilar "+teksayilar);
    }
}
