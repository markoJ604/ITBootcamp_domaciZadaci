package AbstraktneKlase.ZadatakPlanina;

/*
Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-ident.
 */


public abstract class Planinar {

    private String ime;
    private String prezime;
    private static int ID_GLOBAL=0;
    private int id=ID_GLOBAL++;

    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public abstract boolean uspon(int visina);

    @Override
    public String toString() {
        return ime+"-"+id;
    }
}

