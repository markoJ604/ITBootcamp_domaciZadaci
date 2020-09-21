package xDomaci14;/*
Autor poseduje ime, prezime, godinu rodjenja.
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
i ne mogu da se promene.
 */

public class Autor {
    private String ime, prezime;
    private int godRodjenja;

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public Autor(String ime, String prezime, int godRodjenja) {
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

    @Override
    public String toString() {
//        return "autor: "+this.ime+" "+this.prezime;
        StringBuilder s = new StringBuilder();
        s.append("Name of the author: ").append(getIme()).append(" ").
                append(getPrezime()).append(", ").
                append("year of birth: ").append(getGodRodjenja()).append(".");
        return s.toString();
    }
}
