public class TestEntitet {

    public static void main(String[] args) {

        DeoOpreme stit = new DeoOpreme("veliki stit", 1550);

//        System.out.println(stit.toString());

        Igrac t = new Igrac("test", 0, 0);
        PokretniEntitet pokE = new PokretniEntitet(1, 0, 0, 0, 100);
        System.out.println(t);
        System.out.println(pokE);

        PokretniEntitet[] niz = {t, pokE};
        for (int i = 0; i < niz.length; i++)
            niz[i].pomeriSe();

        System.out.println(t);
        System.out.println(pokE);

        /*
        int[] dummyarray = new int[5];
        dummyarray[0] = 3;
        dummyarray[1] = 7;
        System.out.println(dummyarray.length); -----> 5
         */
    }

}
