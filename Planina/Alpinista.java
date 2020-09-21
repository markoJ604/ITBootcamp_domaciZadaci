package AbstraktneKlase.ZadatakPlanina;

/*
Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.
*Napomena: Ukoliko je Alpinista A1 partner Alpinisti A2 onda je i Alpinista A2 partner Alpinisti
A1.
 */

public class Alpinista extends Planinar {

    private Alpinista partner;


    public Alpinista(String ime, String prezime) {
        super(ime, prezime);
    }

    public Alpinista getPartner() {
        return partner;
    }

    public void setPartner(Alpinista p) {
        //ako nema partnera, nastavi u if
        if(this.partner==null){
            //ako je partner od moguceg partnera neki Alp, ili, ako partner nije objekat
            if(p.partner!=null&& !p.partner.equals(this)){
                System.out.println("Ne moze se postaviti partner.");
            } else this.partner = p;
        }
        if (p==this.partner) System.out.println("Alpinisti su vec u navezi.");
    }

    @Override
    public boolean uspon(int visina) {
        if(visina>3000 && this.partner!=null){
            System.out.println("Uspesan uspon!");
            return true;
        } else {
            System.out.println("Neuspesan uspon.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "A_"+super.toString();
    }
}

