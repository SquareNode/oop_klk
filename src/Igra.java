import java.util.Scanner;

import static java.lang.System.exit;

public class Igra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ime;
        double x,y;

        System.out.println("Unesite ime: ");
        ime = unesiIme(sc);
        System.out.println("Unesite X: ");
        x = unesiDouble(sc);
        System.out.println("Unesite y: ");
        y = unesiDouble(sc);
        Igrac i = new Igrac(ime, x,y);


        DeoOpreme[] niz = new DeoOpreme[5];
        niz[0] = new DeoOpreme("viteski mac", 3000);
        niz[1] = new DeoOpreme("buzdovan", 1750);
        niz[2] = new DeoOpreme("Veliki stit", 1550);
        niz[3] = new DeoOpreme("drevni oklop", 5000);
        niz[4] = new DeoOpreme("Napitak za oporavak",250);

        int min = minZlata(niz);
        int kupljeno = 0;
        //Igrač kupuje sve dok ima zlata za bilo koji od ovih artikala.
        //ali moze najvise 5

        for (int j = 0; j < 5 && i.getZlato() > min; j++) {
            ispisiArtikle(niz);
            System.out.println("imate " + i.getZlato() + " zlata");
            System.out.println("Unesite rbr artikla: ");
            int br = sc.nextInt();
            if(br < 6 && br > 0) {
                i.kupi(niz[br-1]);
                 //ovde prosledjujem referencu, u kupi metodu se poziva konstruktor kopije
                System.out.println("kupili ste " + niz[br-1]);
                //mozda ne uspe kupovina, mozda nemamo dovoljno zlata
                kupljeno++;
            }
            //ne treba

            //else
              //  continue;

        }


        System.out.println("Ukupno instancirano artikala: " + DeoOpreme.count);
        System.out.println(i);

        //kako da ispisem kupljenje artikle?
        //mogu jedino ako napisem funkciju u klasi koja ispisuje opremu
        /*
        for(int j = 0; j < DeoOpreme.count - 5; j++)
            System.out.println(" - " + i.inventar[j]);
        */
        i.ispisiOpremu(kupljeno);


        System.out.println("Igra pocinje....");

    }

    static double unesiDouble(Scanner sc) {
        try {
            if(sc.hasNextDouble())
                return sc.nextDouble();
            else
                throw new Exception("Niste uneli double");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

            //java missing return statement
            //sta da uradim pametnije?

            exit(1);
            return 0;
        }
    }
    static String unesiIme(Scanner sc){
        //da li ovaj try catch ima smisla, deluje mi da moze nekako bolje
        try {
            if(sc.hasNext())
                return sc.next();
            else
                throw new Exception("Niste uneli string");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

            //java missing return statement
            //sta da uradim pametnije?

            exit(1);
            return "";
        }
    }

    static void ispisiArtikle(DeoOpreme[] n) {
        for(int s = 0; s<n.length;s++)
            System.out.println(Integer.toString(s + 1) + ". " + n[s]);
    }

    static int minZlata(DeoOpreme[] niz) {
        int min = niz[0].getCena();
        for (int i = 1; i < niz.length; i++) {
            if(min > niz[i].getCena())
                min = niz[i].getCena();
        }
        return min;
    }
}
