public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;
    public Elf(String imie, int wiek, String stanowisko) {
        if(imie!=null&&!imie.equals("")){
            this.imie = imie;
        }
        else
            System.out.println("Bledne dane");
        if(wiek>0){
            this.wiek = wiek;
        }
        else
            System.out.println("Bledne dane");
        if(stanowisko!=null&&!stanowisko.equals("")){
            this.stanowisko = stanowisko;
        }
        else
            System.out.println("Bledne dane");
    }
    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko + ".");
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
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        if(wiek>0){
            this.wiek = wiek;
        }
        else
            System.out.println("Bledne dane");
    }
    public String getStanowisko(){
        return stanowisko;
    }
    public void setStanowisko(String stanowisko){
        if(stanowisko!=null&&!stanowisko.equals("")){
            this.stanowisko = stanowisko;
        }
        else
            System.out.println("Bledne dane");
    }
}
