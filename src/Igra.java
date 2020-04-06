import java.util.Scanner;

public class Igra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = sc.next();
        System.out.println("Unesite X: ");
        double x = sc.nextDouble();
        System.out.println("Unesite y: ");
        double y = sc.nextDouble();
        Igrac i = new Igrac(ime, x,y);

        DeoOpreme[] niz = new DeoOpreme[5];
        niz[0] = new DeoOpreme("viteski mac", 3000);
        niz[1] = new DeoOpreme("buzdovan", 1750);
        niz[2] = new DeoOpreme("Veliki stit", 1550);
        niz[3] = new DeoOpreme("drevni oklop", 5000);
        niz[4] = new DeoOpreme("Napitak za oporavak",250);


        while (i.getZlato() > 0 && i.numOpreme < 5) {
            ispisiArtikle(niz);
            System.out.println("imate " + i.getZlato() + " zlata");
            System.out.println("Unesite rbr artikla: ");
            int br = sc.nextInt();
            if(br < 6 && br > 0) {
                i.kupi(niz[br-1]);
                System.out.println("kupili ste " + niz[br-1]);
            }
            else
                continue;
        }

        System.out.println("Ukupno instancirano artikala: " + DeoOpreme.count);
        System.out.println(i);

        for(int j = 0; j < DeoOpreme.count - 5; j++)
            System.out.println(" - " + i.inventar[j]);

        System.out.println("Igra pocinje....");

    }

    static void ispisiArtikle(DeoOpreme[] n) {
        for(int s = 0; s<n.length;s++)
            System.out.println(Integer.toString(s + 1) + ". " + n[s]);
    }
}
