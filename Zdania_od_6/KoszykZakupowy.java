import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> listaProduktów = new ArrayList<>();
    public KoszykZakupowy(ArrayList<Produkt> lista) {
        for(Produkt nazwa : lista){
            if(listaProduktów.contains(nazwa)){
                nazwa.addIloscWKoszyku(1);
            }
            else{
                listaProduktów.add(nazwa);
                nazwa.addIloscWKoszyku(1);
            }
        }
    }

    public void dodajProdukt(Produkt nazwa, int ilosc){
        if(nazwa.iloscNaMagazynie >= ilosc)
        {
            for (int i = 0; i < ilosc; i++)
                listaProduktów.add(nazwa);
            nazwa.addIloscWKoszyku(ilosc);
            nazwa.iloscNaMagazynie -= ilosc;
        }
    }

    public void wyswietlZawartoscKoszyka(){
        if(listaProduktów.isEmpty())
            System.out.println("Koszyk jeszt pusty");

        ArrayList<Produkt> temp = new ArrayList<>();
        for(Produkt nazwa : listaProduktów){
            if(temp.contains(nazwa))
                continue;
            System.out.println(nazwa.getNazwa() + " : " + nazwa.iloscWKoszyku);
            temp.add(nazwa);
        }
    }

    public void obliczCalkowitaWartosc(){
        int wynik = 0;
        for(Produkt nazwa : listaProduktów){
            wynik = wynik + nazwa.cena;
        }
        System.out.println("Wartosc koszyka: " + wynik);
    }
}
