package Reference.Banka;

public class Racun {

    private String brojRacuna;
    private int stanje;
    private Osoba vlasnik;

    public Racun(String brojRacuna, String imePrezime) {
        this.brojRacuna = brojRacuna;
        this.vlasnik=vlasnik;
        this.stanje = 0;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public boolean dodajNovac(int vrednost){
        if(vrednost>0){
            this.stanje+=vrednost;
            return true;
        } else {
            //opciona poruka
            return false;
        }
    }

    public boolean oduzmiNovac(int vrednost){
        if(vrednost>0&&this.stanje>=vrednost){
            this.stanje-=vrednost;
            return true;
        } else {
            return false;
        }
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public int getStanje() {
        return stanje;
    }
}

