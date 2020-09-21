package xDomaci14;/*
Knjiga poseduje naziv, AUTORA (TIPA Autor),
broj strana, godinu izdanja.
Sva polja mogu da se dohvate,
a godina izdanja moze i da se postavi

 */

import java.util.ArrayList;
import java.util.Comparator;

public class Knjiga {
    private String naziv;
    private Autor autor;
    private int brStrana, godIzdanja;
    private static ArrayList<Knjiga> biblioteka = new ArrayList<>();

    public Knjiga(String naziv, Autor autor, int brStrana, int godIzdanja) {
        this.naziv = naziv;
        this.autor = autor;
        this.brStrana = brStrana;
        this.godIzdanja = godIzdanja;
    }

    public ArrayList<Knjiga> getBiblioteka() {
        return biblioteka;
    }

    public void dodajKnjigu(Knjiga knjiga){
        if(knjiga != null)
        biblioteka.add(knjiga);
    }

    public void izbaciKnjigu(Knjiga knjiga){
        biblioteka.remove(knjiga);
    }

    public static void sort(){
        biblioteka.sort(Comparator.comparing(Knjiga::getGodIzdanja));
        biblioteka.forEach(System.out::println);
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getBrStrana() {
        return brStrana;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Name of the Book: ").append(getNaziv()).append(" [ ").
                append(getGodIzdanja()).append(" ]").append(", number of pages: ").
                append(getBrStrana()).append(". ").append("\n").append(autor);
        return s.toString();
    }

}
