package Polimorfizm;

public class Szkielet extends Potwor {

    @Override
    public void atakuj (){
        System.out.println("Metoda atakuj z klasy Szkielet");
    }

    public Szkielet (double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Nie domyslny konstruktor z klasy szkielet ");
        System.out.println(">> predkoscChodzenia z klasy Szkielet" +predkoscChodzenia);
        System.out.println(">> zywotnosc z klasy szkielet " +zywotnosc);



    }
}
