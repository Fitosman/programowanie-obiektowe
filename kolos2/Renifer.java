public class Renifer {
    private String imie;
    private int predkosc;
    public Renifer(String imie, int predkosc) {
        if(imie!=null&&!imie.equals("")){
            this.imie = imie;
        }
        else
            System.out.println("Bledne dane");
        if(predkosc>0){
            this.predkosc = predkosc;
        }
        else
            System.out.println("Bledne dane");
    }
    public void nakarmRenifera(){
        predkosc = predkosc+5;
    }
    public int getPredkosc(){
        return predkosc;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        if(imie!=null&&!imie.equals("")){
            this.imie = imie;
        }
        else
            System.out.println("Bledne dane");
    }
    public void setPredkosc(int predkosc){
        if(predkosc>0){
            this.predkosc = predkosc;
        }
        else
            System.out.println("Bledne dane");
    }
}
