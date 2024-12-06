import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien = new ArrayList<>();

    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien(){
        for (Zamowienie zamowienie : listaZamowien){
            zamowienie.wyswietlZamowienie();
            System.out.println();
        }
    }

    public void obliczLacznyKostZamowien(){
    }
}
