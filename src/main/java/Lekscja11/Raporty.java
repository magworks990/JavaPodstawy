package Lekscja11;

import Lekscja11.Raport;

public class Raporty extends Raport {

    String tytul;

    public void pokaz (String str) {
        System.out.println("Raporty " + str + " wyświetlany na ekranie");
    }

    public void  drukuj (String str){
        System.out.println("Drukowanie raportu " +str);
    }
}
