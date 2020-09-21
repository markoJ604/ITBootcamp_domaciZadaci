package Reference.Banka;

public class Banka {
    /*
    # Banka
     Banka poseduje ime i moze da kreira racun za odredjenu osobu
    ime se zadaje prilikom kreiranja i moguce ga je kasnije promeniti
     */

    private String ime;

    public Banka(String ime){
        this.ime=ime;
    }

    public Racun otvoriRacun(Osoba o){

        String brojRacuna = o.getIme()+"-"+o.getPrezime()+o.getGodRodjenja();
        String imePrezime = o.getIme()+" "+o.getPrezime();
        Racun r = new Racun(brojRacuna,imePrezime);
        o.setRacun(r);
        return r;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
