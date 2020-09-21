package Reference.Banka;

/*
            # Osoba
            Osoba ima Ime, Prezime i godinu rodjenja koji se zadaju prilikom kreiranja klase. Ovi podaci mogu samo da se dohvate.
            Takodje osoba poseduje Racun koji je povezan sa njom, koji se naknadno dodaje.
            # Racun
            Racun poseduje broj racuna i stanje na racunu. Stanje moze da se uveca za odredjenu sumu, ili umanji za odredjenu sumu.
            Povratna vrednost ovih metoda je info da li je novac uspesno dodat/oduzet sa racuna
            Broj racuna je tekstualnog tipa, postavlja se prilikom kreiranja racuna i ne moze se promeniti, vec samo dohvatiti
            # Banka
            Banka poseduje ime i moze da kreira racun za odredjenu osobu
         */

public class Osoba {

    private String ime;
    private String prezime;
    private int godRodjenja;
    private Racun racun;



    public Osoba(String ime, String prezime, int godRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public Racun getRacun(){
        return racun;
    }
    /*
    Metoda vraca:
    true - racun usppesno postavljen
    false - racun nije uspesno postavljen
     */
    public boolean setRacun(Racun racun) {
        if(this.racun!=null){
            System.out.println("Za osobu "+this.ime+" vec postoji racun.");
            return false;
        }
        this.racun = racun;
        return true;
    }
}

