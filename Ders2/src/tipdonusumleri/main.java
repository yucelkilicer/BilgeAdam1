package tipdonusumleri;

public class main {
    public static void main(String[] args) {

        /*
        not düşme alanı

        Ctrl+alt + l kodları düzenli hale getirir
Seçilen kodu Ctrl + shift + / yapıldığında açıklama moduna alır

         */



        //tip dönüşümleri genelde küçüktn büyüğe doğru olur
        //dikkat etmemiz gereken büyükten küçüğe doğru olan tiplerin dönüşümleridir
        //aksi halde veri kaybı yaşanabilir


        byte bytea = 127;
        int intb;

        intb = bytea;

        intb = 125;
        bytea = (byte) intb; //burada bytea yı intb ye eşitledik
        System.out.println(bytea);


        intb=127;
        bytea = (byte) intb;
        System.out.println("Maksimum boyutu geçmediğinde tip dönüşümü "+intb);

        intb=256;
        bytea = (byte) intb;
        System.out.println("Maksimum boyutu geçtiğinde de tip dönüşümü " +intb);

        Integer zint=12;
        String zstring;
        zstring=zint.toString();
        System.out.println(zstring);
    }
}