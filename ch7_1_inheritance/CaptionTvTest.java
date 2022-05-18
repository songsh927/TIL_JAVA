package ch7_1_inheritance;

class Tv{
    boolean power;
    int channel;

    void power(){ power = !power; }
    void chanelUp(){ ++channel; }
    void channelDown(){ --channel; }
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.chanelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("hello World");
        ctv.caption = true;
        ctv.displayCaption("hello World");
    }
}
