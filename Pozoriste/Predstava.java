package xDomaci16;

import java.util.ArrayList;

/*
Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u
realizaciji predstave. Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da
se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se
predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave
(svakog zaposlenog u zasebnom redu).
 */
public class Predstava {

    private String naziv;
    private Pozoriste pozoriste;
    private ArrayList<Zaposleni> zaposleniUPozoristu;

    public Predstava(String naziv, Pozoriste pozoriste) {
        this.naziv = naziv;
        this.pozoriste = pozoriste;
        this.zaposleniUPozoristu = new ArrayList<>();
    }

    public void dodajZaposlenog(Zaposleni z){
        zaposleniUPozoristu.add(z);
    }

    public void ukloniZaposlenog(Zaposleni z){
        zaposleniUPozoristu.remove(z);
    }

    public int brojZaposlenihNaPredstavi(){
        return zaposleniUPozoristu.size();
    }


    @Override
    public String toString() {
        int empNumb = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(", ").append(pozoriste.getNaziv()).append(". ").append("\n");
        for (int i = 0; i < zaposleniUPozoristu.size(); i++) {
            sb.append(zaposleniUPozoristu.get(i).getImePrezime());
            empNumb++;
            if (i != (zaposleniUPozoristu.size() - 1)) {
                sb.append("\n");
            }
        }
        if (empNumb == 0) {
            sb.append("Nema zaposlenih na ovoj predstavi!");
        }
        return sb.toString();
    }
}
