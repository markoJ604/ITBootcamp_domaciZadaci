package AbstraktneKlase.ZadatakPlanina;

/*
Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-ident.

Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-ident.

Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.
*Napomena: Ukoliko je Alpinista A1 partner Alpinisti A2 onda je i Alpinista A2 partner Alpinisti
A1.

Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
 */


public class Main {
    public static void main(String[] args) {

        KlasicanPlaninar p1 = new KlasicanPlaninar("Marko", "Jovanovic");
        KlasicanPlaninar p2 = new KlasicanPlaninar("Jovana", "Vukovic");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Planina pl1 = new Planina ("Durmitor", 2523);
        Planina pl2 = new Planina ("Matterhorn", 4478);
        System.out.println(pl1.toString());

        p1.uspon(pl1.getVisina());

        pl1.dodajPlaninara(p1);
        pl1.dodajPlaninara(p2);

        System.out.println(pl1.pronadjiPlaninara(1));

        pl1.ispisPlaninara();

        Alpinista a1 = new Alpinista("Branko", "Pajic");
        Alpinista a2 = new Alpinista("Voja","Pajic");

        pl2.dodajPlaninara(a1);
        pl2.dodajPlaninara(a2);

        pl2.ispisPlaninara();
        System.out.println(pl2.toString());

        a1.uspon(pl2.getVisina());
        a1.setPartner(a2);


        System.out.println(a1.getPartner());
        a1.uspon(pl2.getVisina());

        a2.setPartner(a1);

    }
}

