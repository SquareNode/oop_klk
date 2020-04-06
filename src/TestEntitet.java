public class TestEntitet {

    public static void main(String[] args) {

        DeoOpreme stit = new DeoOpreme("veliki stit", 1550);

//        System.out.println(stit.toString());

        Igrac t = new Igrac("test", 12, 8);
        PokretniEntitet pokE = new PokretniEntitet(12, 3);
        System.out.println(t);
        System.out.println(pokE);

        PokretniEntitet[] niz = {t, pokE};
        for (int i = 0; i < niz.length; i++)
            niz[i].pomeriSe();

        System.out.println(t);
        System.out.println(pokE);

    }

}
