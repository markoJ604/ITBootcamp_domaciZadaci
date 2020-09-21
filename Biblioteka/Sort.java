package xDomaci14;

import java.util.Comparator;

public class Sort implements Comparator<Knjiga> {

    @Override
    public int compare(Knjiga o1, Knjiga o2) {
        return o1.getGodIzdanja() - o2.getGodIzdanja();
    }
}

