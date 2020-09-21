package xDomaci16;
/*
Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
 */
public class Glumac extends Zaposleni {

    private String uloga;

    public Glumac(String imePrezime, Pozoriste pozoriste, String uloga) {
        super(imePrezime, pozoriste);
        this.uloga=uloga;
    }

    @Override
    public String toString() {
        return uloga+"_"+super.toString();
    }
}
