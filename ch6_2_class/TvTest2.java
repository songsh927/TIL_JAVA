package ch6_2_class;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 = " + t1.channel);
        System.out.println("t2 = " + t2.channel);
        t1.channel = 7;
        System.out.println("t1 = " + t1.channel);
        System.out.println("t2 = " + t2.channel);
        t1.channelDown();
        System.out.println("t1 = " + t1.channel);
        System.out.println("t2 = " + t2.channel);
    }
}