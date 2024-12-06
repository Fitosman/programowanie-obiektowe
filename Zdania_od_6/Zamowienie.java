import java.util.ArrayList;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    public Zamowienie(KoszykZakupowy koszyk) {
        koszykZakupowy = koszyk;
        statusZamowienia = "Zamowienie";
    }

    public void ustawStatusZamowienia(String status) {
        statusZamowienia = status;
    }

    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println(statusZamowienia);
    }
}
