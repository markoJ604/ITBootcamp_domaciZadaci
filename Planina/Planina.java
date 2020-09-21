package AbstraktneKlase.ZadatakPlanina;

/*
Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
 */


import java.util.ArrayList;

public class Planina {

    private String ime;
    private int visina;
    private ArrayList<Planinar> planinari = new ArrayList<>();

    public Planina(String ime, int visina) {
        this.ime = ime;
        this.visina = visina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        return ime+"("+visina+")";
    }

    public Planinar pronadjiPlaninara(int i){
        return planinari.get(i);
    }

    public void dodajPlaninara(Planinar p){
        planinari.add(p);
    }

    public void ukloniPlaninara(Planinar p){
        planinari.remove(p);
    }

    public void ispisPlaninara(){
        System.out.print("[");
        for(int i=0;i<planinari.size();i++){
            System.out.print(planinari.get(i));
            if(i!=planinari.size()-1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

