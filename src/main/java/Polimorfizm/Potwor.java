package Polimorfizm;

public abstract class Potwor {

    public double predkoscChodzenia;
    public double zywotnosc;


    public Potwor (double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Nie domyślny konstruktor z klasy Potwory");
        System.out.println(">> predkoscChodzenia z klasy Potwór " +predkoscChodzenia);
        System.out.println(">> zywotnosc z klasy Potwór " +zywotnosc);


    }

    public abstract void atakuj();
}
