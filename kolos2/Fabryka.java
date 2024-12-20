import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> lista;
    private double dlGeo;
    private double szGeo;
    public Fabryka(ArrayList<Elf> lista, int dlGeo, int szGeo) {
        this.lista = lista;
        if(dlGeo >= -180 && dlGeo <= 180){
            this.dlGeo = dlGeo;
        }
        else
            System.out.println("Bledne dane");
        if(szGeo >= -90 && szGeo <= 90){
            this.szGeo = szGeo;
        }
        else
            System.out.println("Bledne dane");
    }
    public Fabryka(ArrayList<Elf> lista) {
        this.lista = lista;
    }
    public void dodajPracownika(Elf elf){
        lista.add(elf);
    }
    public void usunPracownika(Elf elf){
        lista.remove(elf);
    }
    public ArrayList<Elf> najstarszyPracownik(){
        int temp = 0;
        for(Elf elf : lista){
            if(elf.getWiek() > temp){
                temp = elf.getWiek();
            }
        }
        //System.out.println(temp);
        return lista;
    }
    public void setLista(ArrayList<Elf> lista) {
        this.lista = lista;
    }
    public ArrayList<Elf> getLista() {
        return lista;
    }
    public double getDlGeo() {
        return dlGeo;
    }
    public void setDlGeo(double dlGeo) {
        if(dlGeo >= -180 && dlGeo <= 180){
            this.dlGeo = dlGeo;
        }
        else
            System.out.println("Bledne dane");
    }
    public double getSzGeo() {
        return szGeo;
    }
    public void setSzGeo(double szGeo) {
        if(szGeo >= -90 && szGeo <= 90){
            this.szGeo = szGeo;
        }
        else
            System.out.println("Bledne dane");
    }
}
