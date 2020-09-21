package xDomaci16;

/*
Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
Moze da se sastavi tekstualni opis u obliku naziv[id].

Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime
[naziv_pozorista].

Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u
realizaciji predstave. Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da
se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se
predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave
(svakog zaposlenog u zasebnom redu).

 */
public class Main {
    public static void main(String[] args) {

        Pozoriste p1 = new Pozoriste("Bosko Buha");
        Zaposleni z1 = new Zaposleni("Marko Jovanovic", p1);
        Glumac g1 = new Glumac("Petar Petrovic", p1, "Mile");
        Reditelj r1 = new Reditelj("Mile Brankovic", p1, "Mile");
        Predstava bas = new Predstava("basCelik", p1);

        bas.dodajZaposlenog(z1);
        bas.dodajZaposlenog(g1);
        bas.dodajZaposlenog(r1);

        System.out.println(bas);

    }
}
