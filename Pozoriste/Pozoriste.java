package xDomaci16;

public class Pozoriste {

    private int ID_GLOBAL=0;
    private int id = ID_GLOBAL++;
    private String naziv;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return naziv+"["+id+"]";
    }
}
