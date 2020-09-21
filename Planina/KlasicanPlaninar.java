package AbstraktneKlase.ZadatakPlanina;

/*
Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-ident.
 */

public class KlasicanPlaninar extends Planinar {


    public KlasicanPlaninar(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public boolean uspon(int visina) {
        if (visina > 2000 || visina <= 0) {
            System.out.println("Penjanje je neuspesno.");
            return false;
        } else {
            System.out.println("Uspesan uspon!");
            return true;
        }
    }

    @Override
    public String toString() {
        return "K_" + super.toString();
    }
}

