package MantiksalOperatorler;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        //Değişken değeri True İse

        boolean x=true, y=false, z=true, l=false, sonuc;
        sonuc=x&&z;
        System.out.println("x ve z and(&&) ile karşılaştırılması: "+sonuc);
        sonuc=z&&y;
        System.out.println("z ve y an(&&) ile karşılaştırılması : "+sonuc);

        sonuc=z||y;
        System.out.println("z ve y nin (||) ile karşılaştırılması : "+sonuc);
        sonuc=!z;
        System.out.println("z nin ünlem(!) kullanılarak karşılaştırılması : "+sonuc);

        sonuc=y^z;
        System.out.println("z ve z yada operatöründen tersi (^) karşılaştırılması: "+sonuc);
    }
}
