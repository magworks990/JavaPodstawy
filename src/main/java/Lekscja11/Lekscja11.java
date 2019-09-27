package Lekscja11;


public class Lekscja11 {
    public static void main (String[] arg){
        Raporty r = new Raporty();
        r.tytul = ">RAP01<";
        r.generujRaport(r.tytul);
        System.out.println(r.rapWygenerowanyPrzez("1234"));

        r.pokaz(r.tytul);
        r.drukuj(r.tytul);

        System.out.println(r.usunRaport(r.tytul));
    }
}
