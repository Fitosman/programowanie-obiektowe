public class Produkt {
    String nazwa;
    int cena;
    int iloscNaMagazynie;
    int iloscWKoszyku;
    public Produkt(String nazwa, int cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc na Magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc){
        if (iloscNaMagazynie >= ilosc) {
            iloscNaMagazynie -= ilosc;
        }
        else {System.out.println("Error");}
    }

    public void addIloscWKoszyku(int ilosc){
        iloscWKoszyku += ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }
    /*public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public int getCena() {
        return cena;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }
    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }
    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }*/

}
