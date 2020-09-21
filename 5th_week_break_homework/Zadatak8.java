//8.
//A) Napisati program koji za uneti broj telefona (u vidu String-a) ispisuje informaciju o tome da li je broj
//napisan u odgovarajućem formatu. Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
//sledećih formata:
//(xxx) xxx-xxxx ili xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.
//B) Modifikovati program tako da on učitava brojeve telefona sve dok korisnik ne unese reč 'stop'.

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String unos;
        int i;
        boolean valid = true;

        while (true) {
            System.out.print("Unesi broj telefona: ");
            unos = in.nextLine();

            if (!unos.equalsIgnoreCase("stop")) {
                switch (unos.length()) {
                    case 12:
                        for (i = 0; i < unos.length(); i++) {
                            char c = unos.charAt(i);
                            switch (i) {
                                case 3:
                                    valid = c == ('-');
                                    break;
                                case 7:
                                    valid = c == ('-');
                                    break;
                                default:
                                    valid = (c >= '0' && c <= '9');
                            }
                            if (valid) {
                                System.out.println("Uneo si isravan format. Probaj opet.");
                                break;
                            }
                            if (!valid) {
                                System.out.println("Ne valja, probaj opet.");
                                break;
                            }
                        }
                        break;
                    case 14:
                        for (i = 0; i < unos.length(); i++) {
                            char c = unos.charAt(i);
                            switch (i) {
                                case 0:
                                    valid = c == ('(');
                                    break;
                                case 4:
                                    valid = c == (')');
                                    break;
                                case 5:
                                    valid = c == (' ');
                                    break;
                                case 9:
                                    valid = c == ('-');
                                    break;
                                default:
                                    valid = (c >= '0' && c <= '9');
                            }
                            if (valid) {
                                System.out.println("Uneo si isravan format. Probaj opet.");
                                break;
                            }
                            if (!valid) {
                                System.out.println("Ne valja, probaj opet.");
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Nije unet ispravan format.");
                }
                System.out.println("Ako zelis da odustanes unesi stop.");
            } else {
                break;
            }
        }
    }
}
