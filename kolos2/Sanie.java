import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> listaRenifer;
    public Sanie (ArrayList<Renifer> listaRenifer) {
        this.listaRenifer = listaRenifer;
    }
    public void dodajRenifera(Renifer renifer){
        listaRenifer.add(renifer);
    }
    public int sumaPredkosci(){
        int wynik = 0;
        for (Renifer r : listaRenifer){
            wynik = wynik + r.getPredkosc();
        }
        return wynik;
    }
    public ArrayList<Renifer> najwolnieszyRenifer(){
        int temp = listaRenifer.getFirst().getPredkosc();
        for(Renifer renifer : listaRenifer){
            if(renifer.getPredkosc() < temp){
                temp = renifer.getPredkosc();
            }
        }
        //System.out.println(temp);
        return listaRenifer;
    }
    public void setListaRenifer(ArrayList<Renifer> listaRenifer) {
        this.listaRenifer = listaRenifer;
    }
    public ArrayList<Renifer> getListaRenifer() {
        return listaRenifer;
    }
}
