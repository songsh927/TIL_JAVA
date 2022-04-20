package ch6_2_class;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        System.out.println("tv1 = " + tv1.channel);
        System.out.println("tv2 = " + tv2.channel);
        tv2 = tv1;

        tv1.channel = 5;

        System.out.println("tv1 = " + tv1.channel);
        System.out.println("tv2 = " + tv2.channel);
    }


}
