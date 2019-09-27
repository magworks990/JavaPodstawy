package Lekscja11;


public class Raport implements RaportyInterface {
    public String rapWygenerowanyPrzez (String str){
        String s = "Raporty wygenerowane przez: " +str;
        return s;
    }

    @Override
    public String usunRaport(String str) {
        return "Raport " +str+ " usunienty z systemu";
    }

    @Override
    public void generujRaport(String str) {
        System.out.println("Przygotowanie raportu " +str);
    }
}
